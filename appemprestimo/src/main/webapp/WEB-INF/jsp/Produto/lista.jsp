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
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h2>AppEmprestimo</h2>
		<p>Projeto de empréstimos na biblioteca.</p>

		<h3>Cadastramento de Produto</h3>
		<table class="table table-striped">
			<thead>
				<tr>					
					<th>Titulo</th>
					<th>Estante</th>
					<th>CodigoBarras</th>
					<th>QtdDisponiveis</th>
					<th>QtdExemplares</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Sistemas de Informação no Brasil: uma análise dos artigos
						científicos dos anos 90</td>
					<td>4</td>
					<td>Não há</td>
					<td>1</td>
					<td>1</td>
				</tr>
				<tr>
					<td>As redes cognitivas na ciência da informação brasileira:
						um estudo nos artigos científicos publicados nos periódicos da
						área</td>
					<td>4</td>
					<td>Não há</td>
					<td>1</td>
					<td>1</td>
				</tr>
				<tr>
					<td>Perspectivas acerca do conceito de saúde mental: análise
						das produções científicas brasileiras</td>
					<td>4</td>
					<td>Não há</td>
					<td>1</td>
					<td>1</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>