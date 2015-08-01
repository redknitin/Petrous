package com.katkam.petrous;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Reddy
 */
public class ExportServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException
    {
        String csvOutput = new String();
        
        //Header row
        //csvOutput += "ID,Name,Email\r\n"; //TODO: Replace this with a string builder
        
        //Let's ditch our XML-to-CSV conversion for now and output XML
        response.setContentType("text/xml");
        try {
            String data = DataRepository.getData(request.getServletContext());
            response.getWriter().println(data);
        }
        catch (Exception ex) {
            response.getWriter().println(ex);
        }
    }
}
