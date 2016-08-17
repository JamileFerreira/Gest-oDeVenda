<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>INSERIR NOVO EVENTO</title>
</head>
<body>
	<h1>INSERIR NOVO EVENTO</h1>
	 <form name="evento" method="post" action="/CriarEventoServlet">
        Código <input type="text" name="id_evento" size="10"><br><br>
        Nome <input type="text" name="nome_evento" size="10"><br><br>
		Descrição <input type="text" name="desc_evento" size="10"><br><br>
        Data Prevista<input type="text" name="dt_evento" size="10"><br><br>
        <input type="submit" value="Cadastrar Evento"><br><br>	
    </form>

</body>
</html>