<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Procesando</title>
</head>
<body>

<%
int resultado = (int)request.getAttribute("resultado");
if(resultado==0)  
{
%>            
Creación exitosa. Redireccionando...
<META HTTP-EQUIV="REFRESH" CONTENT="5;URL=/acquapp/AddWaterBody.html"> 
<%
} else {
%>
Creación fallida. Redireccionando...
<META HTTP-EQUIV="REFRESH" CONTENT="5;URL=/acquapp/AddWaterBody.html">
<%
}
%>

</body>
</html>