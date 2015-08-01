<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
            <p><%= com.katkam.petrous.DataRepository.getVersionCodeName() %></p>
            <div>                
                  <%=
                  com.katkam.petrous.DataRepository.getData(request.getServletContext())
                  %>      
            </div>
        </div>
    </body>
</html>
