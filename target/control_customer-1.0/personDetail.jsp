<%-- 
    Document   : personDetail
    Created on : 22/03/2019, 05:25:30 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/personDetail.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contein">
            <h1>Actualizar datos del cliente</h1>
        <form method="post" action="PersonUpdate">
            <input name="id" type="hidden" value="${person.id}">
            <label>Nombre</label><input name="firstName" value="${person.firstName}" type="text" required="true">
            <br>
            <label>Apellido</label><input name="lastName" value="${person.lastName}" type="text" required="true">
            <br>
            <label>Numero de telefono</label><input name="number" value="${person.numberPhone}" type="text" required="true">
            <br>
            <button>Actualizar</button>
        </form>
            
            <br>
            
             <button class="b" onclick=" location.href='PersonList'">Volver a la lista de clientes</button>
            <br>
            <button class="b1" onclick=" location.href='AddCustomerBoys?idPersonInCharge=${person.id}'">Agregar niño</button>
          
            </div>
    </body>
</html>
