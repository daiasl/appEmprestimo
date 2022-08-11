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
	  
	  <h3>Classe: Empréstimo</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Data do Empréstimo</th>
	        <th>Data de Devolução</th>	        
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>01/08/2022</td>
	        <td>01/09/2022</td>	        
	      </tr>
	      <tr>
	        <td>15/09/2022</td>
	        <td>16/09/2022</td>	        
	      </tr>	 
	      <tr>
	        <td>12/08/2022</td>
	        <td>20/08/2022</td>	        
	      </tr>	      
	    </tbody>
	  </table>	  
	</div>
</body>
</html>