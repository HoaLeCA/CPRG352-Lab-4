<%-- 
    Document   : editnote
    Created on : 29-Sep-2022, 1:49:06 PM
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
        <h2><a>Edit Note</a></h2>
        <form action="note" method="POST">
            <div>
            <label>Title:</label>
            <input type="texarea" value="${note.title}" name="getTitle" >
            </div>
            <div>
            <label>Contents:</label>
            <textarea name="getContent" rows = "6" cols="20" >${note.content}</textarea>
            
            </div>
             <div>
              <input type="submit" value="Save">
            </div>
        </form>
    </body>
</html>
