<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Grupo</title>
</head>
<body>
<h3>Cadastrar Novo Evento</h3><br>
    <form name="evento" method="post" action="CriarEventoServlet">
        Identificador<input type="int" name="nome" size="10"><br><br>
        Nome<input type="text" name="cnpj" size="10"><br><br>
		Descrição:<input type="text" name="email" size="10"><br><br>
        Data:<input type="text" name="site" size="10"><br><br>
        <input type="submit" value="Cadastrar Novo Evento"><br><br>	
    </form>
</body>
</html>