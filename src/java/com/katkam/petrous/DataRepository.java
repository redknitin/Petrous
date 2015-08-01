package com.katkam.petrous;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.servlet.ServletContext;

/**
 *
 * @author Reddy
 */
public class DataRepository {
    public static String getVersionCodeName() {        
        return "Leonardo"; //version 0.1
    }
    
    public static String getData(ServletContext context) throws Exception {
        String path = "/META-INF/resources/data.xml";
        InputStream stream = context.getResourceAsStream(path);
        
        if (stream==null) {
            throw new Exception("Got null stream for " + context.getRealPath(path));
        }
        
        InputStreamReader inread = new InputStreamReader(stream);
        BufferedReader bread = new BufferedReader(inread);
        
        String iterData;
        StringBuilder accumData = new StringBuilder();
    
        try{
            while ((iterData = bread.readLine())!=null) {
                accumData.append(iterData);
            }
        }
        catch(Exception ex) {
            throw ex;
        }
        
        return accumData.toString();
    }
}
