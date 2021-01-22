<%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 20/01/2021
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Agenda</title>
</head>
<body>
<c:url var="novoContato" value="agenda-edit"></c:url>

<a href="${novoContato}">Adicionar novo contato</a>


<table width="100%" border="1">
    <tr>
        <td>Nome</td>
        <td>Telefone</td>
        <td></td>
        <td></td>
    </tr>
    <c:choose>
        <c:when test="${empty(contatos)}">
            <tr>
                <td colspan="4">Nenhum usuário encontrado</td>
            </tr>
        </c:when>
        <c:otherwise>
            <c:forEach var="this" items="${contatos}">
                <c:url var="editarContatoUrl" value="agenda-edit">
                    <c:param name="id">${this.id}</c:param>
                </c:url>

                <c:url var="excluirContatoUrl" value="agenda-exluir">
                    <c:param name="id">${this.id}</c:param>
                </c:url>

                <td align="center">${this.name}</td>
                <td align="center">${this.telephone}</td>
                <td align="center"><a href="${editarContatoUrl}"></a></td>
                <td align="center"><a href="${excluirContatoUrl}"></a></td>


            </c:forEach>
        </c:otherwise>
    </c:choose>
</table>
</body>
</html>