<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modelo.ng.Venda"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="venda" method="post" action="ExcluirVendaServlet">

<h1>Lista de Vendas</h1>
			<%
				ArrayList<Venda> vendas = (ArrayList<Venda>) request.getAttribute("vendas");
			%>

                   <table>
				     <tr>
				     <td>IdVenda</td>
					 <td>Data</td>
					 <td>Filial</td>
					 <td>Cliente</td>
					 <td>Valor Total</td>
					 </tr>
			<%
				for (int i = 0; i < vendas.size(); i++) {
			%>
			
				     <tr>
				     <td><%=vendas.get(i).getIdVenda()%></td>
					 <td><%=vendas.get(i).getDataVenda()%></td>
					 <td><%=vendas.get(i).getIdFilial()%></td>
					 <td><%=vendas.get(i).getIdCliente()%></td>
					 <td><%=vendas.get(i).getValortotal()%></td>
					 </tr>

				</table>
			<%}%>
		ID Venda <br><input type="text" name="idVenda" size="10"><br><br>
			<input type="submit" value="Excluir Venda"><br><br>	
</form>
</body>
</html>