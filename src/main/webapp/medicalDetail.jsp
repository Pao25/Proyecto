<%-- 
    Document   : medicalDetail
    Created on : 22/03/2019, 07:38:21 AM
    Author     : asus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/medicalDetail.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contein">
            <form method="post" action="MedicalUpdate">
                <h1>Actualizar datos de Historial medico</h1>
                <input name="id" type="hidden" value="${medi.id}">
                <label>Enfermedad</label><input name="disease" value="${medi.disease}" type="text" required minlength="4">
                <br>
                <br>
                <label>Descripcion</label><input name="description" value="${medi.description}" type="text" required minlength="4">
                <br>
                <button class="b">Actualizar</button>
            </form>

            <br>

            <button class="b1" onclick=" location.href = 'menu.jsp'">Menu</button>
        </div>
    </body>
</html>
