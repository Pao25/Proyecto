<%-- 
    Document   : addCustomerBoys
    Created on : 22/03/2019, 02:20:17 PM
    Author     : asus
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/addcustomer.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>

        <div class="contein">
            <h1>Registrar nuevo Peque</h1>
            <form action="CreateCustomerBoys" method="post">

                <input type="hidden" name="idPerson" value="${idPersonInCharge}">

                <label>Nombre</label><input type="text" name="firstNamec">
                <br>
                <label>Apellido</label><input type="text" name="lastNamec">
                <br>
                <label>Fecha de nacimiento</label><input type="date" name="birthDate">
                <br>
                <label>Fecha de Ingreso</label><input type="date" name="dateAdmission">
                <br>

                <label>Padece de alguna enfermerdad</label> <select name="idMedical">

                    <c:forEach items="${list}" var="medica">
                        <option value="${medica.id}">${medica.disease}</option>
                    </c:forEach>
                </select>
                <br>
                <button class="b1">Guardar</button>

            </form>
            <button class="b" onclick=" location.href = 'menu.jsp'">Menu</button>
        </div>
    </body>
</html>
