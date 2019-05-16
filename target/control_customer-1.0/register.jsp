<%-- 
    Document   : register
    Created on : 23/03/2019, 09:52:19 PM
    Author     : asus
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/register.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div class="conteiner">
        <h1>Registro de nuevo Usuario</h1>
        <p> Ingresar datos que se le piden a continuacion para crear su usuario</p>
        <form name= "formu" method= "post" action= "Register">



            <label>Usuario</label><input name="user" type="text" required="true">
            <br><br>
            <label>Nombre</label><input name="name" type="text" required="true">
            <br><br>
            <label>Apellido</label><input name="lastName" type="text" required="true">
            <br><br> 
            <label>Contraseña</label><input name="password" type="password" required="true">
            <br>
            <button class="r" name="enviar">Registrarse e iniciar Sesion</button> 




        </Form>
    </div>
</body>
</html>

