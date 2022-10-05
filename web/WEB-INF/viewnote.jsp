<%-- 
    Document   : viewnote
    Created on : 29-Sep-2022, 1:48:55 PM
    Author     : levan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1><a>Simple Note Keeper</a></h1> 
        <h2>View Note</h2>
        <p><b>Title:</b> ${note.title} </p>
        
        <p><b>Contents:</b></p>
        <p> ${note.content} </p>
       
              
        <div>
                <a href="note?edit">Edit</a>
                
        </div>
    </body>
</html>
