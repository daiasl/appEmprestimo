<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppEmprestimo</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
	  <div class="container-fluid">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link active" href="/">Home</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/Livro/lista">Livro</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/MaterialDigital/lista">Material Digital</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/Revista/lista">Revista</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/Produto/lista">Produto</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/Emprestimo/lista">Emprestimo</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/Usuario/lista">Usuario</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	<div class="container mt-3">
	  <h2>AppEmprestimo</h2>
	  <p>Projeto de empréstimos na biblioteca.</p>   
	  	  
	  <h3>Classe: Revista</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Issn</th>
			<th>Edicao</th>
			<th>Ano</th>
			<th>Titulo</th>
			<th>Estante</th>
			<th>CodigoBarras</th>
			<th>QtdDisponiveis</th>
			<th>QtdExemplares</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>1980393-1</td>
			<td>6</td>
			<td>2011</td>
			<td>.Net Magazine</td>
			<td>5</td>
			<td>Não há</td>
			<td>20</td>
			<td>20</td>
	      </tr>
	      <tr>
	        <td>2357-7886</td>
			<td>138</td>
			<td>2021</td>
			<td>Revista Wine - Entrevista com Julia Cavil</td>
			<td>5</td>
			<td>9772357788009</td>
			<td>3</td>
			<td>20</td>
	      </tr>	      
		  <tr>
	        <td>456-7890</td>
			<td>1</td>
			<td>2022</td>
			<td>História da Humanidade</td>
			<td>5</td>
			<td>Não há</td>
			<td>1</td>
			<td>1</td>
	      </tr>		  			  		  
	    </tbody>
	  </table>	  
	</div>
</body>
</html>