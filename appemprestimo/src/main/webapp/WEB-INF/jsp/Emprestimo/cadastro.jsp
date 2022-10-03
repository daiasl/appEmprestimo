<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>AppEmprestimo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Cadastramento de Empréstimos</h2>
		<form action="/Emprestimo/Incluir" method="post">			
			<div class="mb-3 mt-3">
				<label>Data de Devolução:</label> <input type="datetime-local"
					class="form-control" placeholder="Entre com a data de devolução"
					name="dataDevolucao">
			</div>
			<div class="mb-3">
				<label>Solicitante:</label> 
				<select name="solicitante" class="form-control" id="sel1">
					<c:forEach var="s" items="${solicitantes}">					
						<option value="${s.id}" >${s.nome}</option>						
					</c:forEach>
				</select>
			</div>
			<div class="mb-3">
				<label>Produtos:</label>
				<c:forEach var="p" items="${produtos}">
					<div class="checkbox">
						<label><input type="checkbox" name="produtos" value="${p.id}">${p.titulo}</label>
					</div>
				</c:forEach>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>