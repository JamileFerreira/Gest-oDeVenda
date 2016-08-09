<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Cadastro de Vendas</h3><br>
    <form name="venda" method="post" action="CriarVendaServlet">
        Valor Total<input type="text" name="valortotal" size="10"><br><br>
        Data da venda<input type="text" name="dataVenda" size="10"><br><br>
		Id Filial:<input type="text" name="idFilial" size="10"><br><br>
        Id Cliente:<input type="text" name="idCliente" size="10"><br><br>
        <input type="submit" value="Cadastrar venda"><br><br>	
    </form>
</body>
</html>