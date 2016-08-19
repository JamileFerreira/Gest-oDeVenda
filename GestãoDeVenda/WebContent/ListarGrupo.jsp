<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modelo.ng.Grupo"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Lista de Vendas</h1>
			<%
				ArrayList<Grupo> grupos = (ArrayList<Grupo>) request.getAttribute("grupos");
			%>

                   <table>
				     <tr>
					 <td>Nome</td>
					 <td>Id</td>
					 <td>Cnpj</td>
					 <td>Telefone</td>
					 <td>Site</td>
					 <td>Email</td>
					 </tr>
			<%
				for (int i = 0; i < grupos.size(); i++) {
			%>
			
				
				     <tr>
					 <td><%=grupos.get(i).getNome()%></td>
					 <td><%=grupos.get(i).getIdGrupo()%></td>
					 <td><%=grupos.get(i).getCnpj()%></td>
					 <td><%=grupos.get(i).getTelefone()%></td>
					 <td><%=grupos.get(i).getSite()%></td>
					 <td><%=grupos.get(i).getEmail()%></td>
					 </tr>

					 
				</table>
			<%}%>


</body>
</html>