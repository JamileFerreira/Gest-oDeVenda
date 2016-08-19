<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modelo.ng.Grupo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Atualizar de Grupo</h3><br>
    <form name="grupo" method="post" action="EditarGrupoBD">
    <%Grupo grupo	=(Grupo)request.getAttribute("grupo");%>
    
    <input type="hidden" name="id" value="<%=grupo.getIdGrupo()%>"> <br> 
        Nome<input type="text" name="nome" size="10" value=<%=grupo.getNome()%>><br>
        CNPJ<input type="text" name="cnpj" size="10" value=<%=grupo.getCnpj()%>><br>
		Email:<input type="text" name="email" size="10" value=<%=grupo.getEmail()%>><br>
        Site:<input type="text" name="site" size="10" value=<%=grupo.getSite()%>><br><br>
        Telefone:<input type="text" name="telefone" size="10" value=<%=grupo.getTelefone()%>><br>
        <input type="submit" value="Atualizar Grupo" ><br>
    </form>
</body>
</html>