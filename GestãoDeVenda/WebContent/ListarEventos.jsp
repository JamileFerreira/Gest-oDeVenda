<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Todos os Eventos</title>
</head>
<body>
		<h1>Listar Evento</h1>
			<form action="ListarEventoServlet">
				Informe o c�digo do Evento: <input type="text" name="id_evento" /><br />
				<input type="submit" value="Listar Eventos"><br><br>
			</form> 
		
</body>
</html>