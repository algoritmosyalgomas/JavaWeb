<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio de Sesi�n</title>
</head>
<body>
	<form action="usuario" method="post">
		<table>
			<tr>
				<td>Usuario</td>
				<td><input type="text" name="nombre" /></td>
			</tr>
			<tr>
				<td>Clave</td>
				<td><input type="password" name="clave" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Iniciar sesi�n"/></td>
			</tr>
		</table>
		<div>
			<p>
				<%
					String resultado = (String)request.getAttribute("mensaje");
					String mensaje = "";
					if (resultado != null) {
						mensaje = resultado;
					}
				%>
				<%=mensaje %>
			</p>
		</div>
	</form>
</body>
</html>