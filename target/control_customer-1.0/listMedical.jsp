<%-- 
    Document   : listMedical
    Created on : 22/03/2019, 07:27:36 AM
    Author     : asus
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="css/listMedical.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1 style="text-align: center">Historial Medico</h1>
        <table>
            <tr>
                <th>Enfermedad</th>
                <th>Descripcion</th>
               
            </tr>
            <c:forEach items="${medical}" var="medical" varStatus="status">
                <tr>

                    <td>${medical.disease} </td>
                    <td> ${medical.description} </td>
                    
                    <td> <button class="b" onclick=" location.href = 'MedicalById?id=${medical.id}'">Ver</button></td>


            </tr>

        </c:forEach>
        </table>
        <br>
        <button class="b1" onclick=" location.href = 'menu.jsp'">Inicio</button>
    </body>
</html>
