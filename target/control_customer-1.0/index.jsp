<%-- 
    Document   : index
    Created on : 22/03/2019, 03:46:27 AM
    Author     : asus
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/inde.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >

        <div class="conteine">
            <h1>Guarderia Los Peques</h1>
            <form name= "formu" method= "post" action= "Login">

                <label>Usuario</label><input name="user_name" type="text">
                <br><br>
                <label>Contrasenia</label><input name="pass" type="password">
                <br><br>  

                <button class="b" name="enviar">Inicio sesion</button> 

            </Form>
            <br>
            <button class="b" style='text-align: center' onclick=" location.href = 'register.jsp'">Nuevo Usuario</button>


        </div>
    </body>
</html>
