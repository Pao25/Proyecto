<%-- 
    Document   : newPersonInCharge
    Created on : 22/03/2019, 04:46:03 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/Customer.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Cliente</title>
    </head>
    <body>
        <div class="contein">
            <form name= "formu" method= "post" action= "CreatePerson">
                <h1>Nuevo Cliente</h1>

                <label>Nombre:</label><input name="name" type="text" required="true">
                <br>
                <br>
                <label>Apellido:</label><input name="lastname" type="text" required="true">
                <br>
                <br>
                <label>Parentesco:</label><input name="kinship" type="text" required="true">
                <br>
                <br>
                <label>Numero de telefono:</label><input name="number" type="text" requires="true">
                <br>


                <br><br>  

                <button class="b" name="enviar">Guardar Cliente</button> 
                <br>
                <button class="b1" type="reset">Cancelar</button>
            </Form>
            <button class="b2" onclick=" location.href = 'menu.jsp'">Menu</button>
        </div>

    </body>
</html>
