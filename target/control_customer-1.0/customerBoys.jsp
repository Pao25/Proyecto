<%-- 
    Document   : customerBoys
    Created on : 22/03/2019, 03:06:33 PM
    Author     : asus
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/tableCustormerBoys.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Clientes y familiares de Guarderia los Peques</h1>
        <table>

            <tr>
                <th>Nombre del Encargado</th>
                <th>Parentesco</th>
                <th>Nombre del familiar</th>

                <th>Padece alguna enfermedad</th>
                <th>Descripcion</th>

            </tr>

            <c:forEach items="${lista}" var="customer" varStatus="status">
                <tr>

                    <td>${customer.firstName} ${customer.lastName} </td>

                    <td>${customer.kinship} </td>
                    <td>${customer.firstNamec} ${customer.lastNamec} </td>

                    <td> ${customer.disease} </td>
                    <td> ${customer.description} </td>
                </tr>

            </c:forEach>
        </table>
        <button class="b1" onclick=" location.href = 'menu.jsp'">Menu</button>
    </body>
</html>
