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
		<h2>Cadastramento de Livros</h2>
		<form action="/Livro/Incluir" method="post">			
			<div class="mb-3 mt-3">
				<label>Isbn:</label> <input type="text" class="form-control"
				    placeholder="Entre com o c�digo ISBN" name="isbn">
			</div>
			<div class="mb-3 mt-3">
				<label>Volume:</label> <input type="number" class="form-control"
					placeholder="Entre com o n�mero do volume" name="volume">
			</div>	
			<div class="mb-3 mt-3">
				<label>Edi��o:</label> <input type="number" class="form-control"
					placeholder="Entre com o n�mero da edi��o" name="edicao">
			</div>
			<div class="mb-3 mt-3">
				<label>Ano de Publica��o:</label> <input type="number" class="form-control"
					placeholder="Entre com o ano" name="anoPublicacao">
			</div>					
			<div class="mb-3 mt-3">
				<label>Nome do Autor:</label> <input type="text" class="form-control"
					placeholder="Entre com o t�tulo" name="nomeAutor">
			</div>
			<div class="mb-3 mt-3">
				<label>T�tulo:</label> <input type="text" class="form-control"
					placeholder="Entre com o t�tulo" name="titulo">
			</div>
			<div class="mb-3 mt-3">
				<label>Estante:</label> <input type="number" class="form-control"
					placeholder="Entre com a estante" name="estante">
			</div>
			<div class="mb-3 mt-3">
				<label>CodigoBarras:</label> <input type="text" class="form-control"
					placeholder="Entre com o c�digo de barras" name="codigoBarras">
			</div>
			<div class="mb-3 mt-3">
				<label>QtdDisponiveis:</label> <input type="number" class="form-control"
					placeholder="Entre com a quantidade de exemplares dispon�veis" name="qtdDisponiveis">
			</div>
			<div class="mb-3 mt-3">
				<label>QtdExemplares:</label> <input type="number" class="form-control"
					placeholder="Entre com o n�mero de exemplares" name="qtdExemplares">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>