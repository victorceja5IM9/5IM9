<%-- 
    Document   : Consulta
    Created on : 8/10/2018, 08:15:48 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="consulta" action="../ConsultaServlet">
            Quiuen quieres buscar<input type="text" name="nombre"> 
            <input type="submit" value="consulta">
        </form>
    </body>
</html>
