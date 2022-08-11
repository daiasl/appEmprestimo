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
	  	  
	  <h3>Classe: Produto</h3>         
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
	        <td>Sistemas de Informação no Brasil: uma análise dos artigos científicos dos anos 90</td>
			<td>4</td>
			<td>Não há</td>
			<td>1</td>
			<td>1</td>
	      </tr>
	      <tr>
	        <td>As redes cognitivas na ciência da informação brasileira: um estudo nos artigos científicos publicados nos periódicos da área</td>
			<td>4</td>
			<td>Não há</td>
			<td>1</td>
			<td>1</td>
	      </tr>	
		  <tr>
	        <td>Perspectivas acerca do conceito de saúde mental: análise das produções científicas brasileiras</td>
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