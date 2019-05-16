<%-- 
    Document   : menu
    Created on : 22/03/2019, 03:49:39 AM
    Author     : asus
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/menu.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="conteiner">
            <h1>Control de:</h1>

            <img class="i" src="imagen/Peques.jpeg" >
            <br>
            <br>

            <button class="b"  onclick=" location.href = 'createMedicalHistory.jsp'">Crear Historial Medico</button>
            
            <button class="b"  onclick=" location.href = 'newPersonInCharge.jsp'">Crear nuevo cliente</button>
            
            <button class="b"  onclick=" location.href = 'PersonList'">Ver Clientes</button>
            
            <button class="b"  onclick=" location.href = 'MedicalList'">Lista historial Medico</button>
            
            <button class="b"  onclick=" location.href = 'CustomersBoys'">Listado de padres e hijos</button>
            
            <button class="b"  onclick=" location.href = 'Logout'">Cerrar Sesion</button>




        </div>

    </body>
</html>
