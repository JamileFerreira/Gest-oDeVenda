<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Cadastro de Grupo</h3><br>
    <form name="venda" method="post" action="CriarGrupoServlet">
        Nome<input type="text" name="nome" size="10"><br><br>
        CNPJ<input type="text" name="cnpj" size="10"><br><br>
		Email:<input type="text" name="email" size="10"><br><br>
        Site:<input type="text" name="site" size="10"><br><br>
        Telefone:<input type="text" name="telefone" size="10"><br><br>
        <input type="submit" value="Cadastrar Grupo"><br><br>	
    </form>
</body>
</html>