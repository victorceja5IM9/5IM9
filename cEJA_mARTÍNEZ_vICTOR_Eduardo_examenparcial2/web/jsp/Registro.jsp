<%-- 
    Document   : Registro
    Created on : 8/10/2018, 08:15:11 AM
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
    <center>
        <h1>Registrate</h1>
        
        <form name="registro" action="../RegistroServlet">
            Nombre: <input type="text" name="Nombre">
            Apellido Paterno: <input type="text" name="ape1">
            Apellido Materno<input type="text" name="ape2">
            Selecciona tu escuela: <br><select name="escuela">
                <option>Cecyt8</option>
                <option>Cecyt9</option>
                <option>Cecyt1</option>
                <option>Cecyt10</option>
            </select>
            ¿Cuál es tu materia favorita?<input type="text" name="materia">
            ¿Cúal es tu deporte favorito?<input type="text" name="deporte">
            <input type="submit" value="resgistrar">
        </form>
        
    </center>
       
    </body>
</html>
