<%-- 
    Document   : listPerson
    Created on : 22/03/2019, 05:00:27 AM
    Author     : asus
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/person.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h2 style="text-align: center">Clientes</h2>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Parentesco</th>
                <th>Numero de Telefono</th>
            </tr>
            <c:forEach items="${person}" var="personCharge" varStatus="status">
                <tr>

                    <td> ${personCharge.firstName}</td>
                    <td> ${personCharge.lastName} </td>
                    <td>${personCharge.kinship}</td> 
                    <td>${personCharge.numberPhone}</td>
                    <td> <button class="b" onclick=" location.href = 'PersonById?id=${personCharge.id}'">Ver</button></td>


            </tr>

        </c:forEach>
        </table>
        <br>
        <button class="b1" onclick=" location.href = 'menu.jsp'">Menu</button>
    
</body>
</html>
