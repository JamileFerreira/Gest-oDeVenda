<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>CRIAR EVENTO</title>
	</head>
	<body>
		<form action="CriarEventoServlet">
			<h1>Criar Novo Evento</h1>
				Identificador: <input type="text" name="id_evento" /><br />
				Nome do Evento: <input type="text" name="nome_evento" /><br />
				Descrição: <input type="text" name="descricao_evento" /><br />
				Data Prevista: <input type="text" name="data_evento" /><br />
				<input type="submit" value="Gravar" />
		</form>

	</body>
</html>