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
	  	  
	  <h3>Classe: Livro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Isbn</th>    
			<th>Volume</th>
			<th>Edicao</th>
			<th>AnoPublicacao</th>
			<th>NomeAutor</th>
			<th>Titulo</th>
			<th>Estante</th>
			<th>CodigoBarras</th>
			<th>QtdDisponiveis</th>
			<th>QtdExemplares</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>987-85-508-1500-8</td>
			<td>1</td>
			<td>1</td>
			<td>2020</td>
			<td>Robert C. Martin</td>
			<td>Desenvolvimento de Software Ágil</td>
			<td>1</td>
			<td>9788550815008</td>
			<td>5</td>
			<td>6</td>
	      </tr>
	      <tr>
	        <td>987-5-01-30451-3</td>
			<td>1</td>
			<td>2</td>
			<td>2022</td>
			<td>Kate Quinn</td>
			<td>A Rede de Alice</td>
			<td>2</td>
			<td>978850304513</td>
			<td>3</td>
			<td>10</td>
	      </tr>
	      <tr>
	        <td>987-65-5564-024-3</td>
			<td>1</td>
			<td>1</td>
			<td>2020</td>
			<td>Daiana Garbin</td>
			<td>A vida perfeita não existe</td>
			<td>3</td>
			<td>9786555640243</td>
			<td>2</td>
			<td>2</td>
	      </tr>  		  
	    </tbody>
	  </table>	  
	</div>
</body>
</html>