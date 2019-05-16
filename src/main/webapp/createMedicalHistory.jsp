<%-- 
    Document   : createMedicalHistory
    Created on : 22/03/2019, 06:52:46 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/historial.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="conteiner">
        <form  method="post" action="CreateMedicalHistory">
            <h1>Crear historial medico</h1>
            <label>Enfermedad:</label><input name="disease" type="text" required minlength="3"/>
            <br>
            <br>
            <label>Descripcion:</label><input name="description" type="text" required minlength="3"/>
            <br>
            <br>
            <button class="b">Guardar</button> 
            <button class="b" onclick=" location.href='menu.jsp'">Menu</button>
        </form>
            </div>
    </body>
</html>
