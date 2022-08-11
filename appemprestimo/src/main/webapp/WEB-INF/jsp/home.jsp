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
	  
	  <h3>Classe: Emprestimo</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>dataEmprestimo</td>
	        <td>LocalDateTime</td>
	        <td>Data da realização do empréstimo.</td>
	      </tr>
	      <tr>
	        <td>dataDevolucao</td>
	        <td>LocalDateTime</td>
	        <td>Data de devolução do empréstimo realizado.</td>
	      </tr>	      
	    </tbody>
	  </table>
	  <h3>Classe: Usuario</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome do usuário.</td>
	      </tr>
	      <tr>
	        <td>cpf</td>
	        <td>String</td>
	        <td>CPF do usuário.</td>
	      </tr>	      
	    </tbody>
	  </table>
	  <h3>Classe: Produto</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>titulo</td>
	        <td>String</td>
	        <td>Título do produto a ser emprestado.</td>
	      </tr>
	      <tr>
	        <td>estante</td>
	        <td>int</td>
	        <td>Em qual estante está localizado o produto.</td>
	      </tr>	
		  <tr>
	        <td>codigoBarras</td>
	        <td>String</td>
	        <td>Representação gráfica de uma sequência numérica utilizada para identificar um produto.</td>
	      </tr>
		  <tr>
	        <td>qtdExemplares</td>
	        <td>int</td>
	        <td>Quantidade de exemplares do mesmo produto.</td>
	      </tr>	
		  <tr>
	        <td>qtdDisponiveis</td>
	        <td>int</td>
	        <td>Quantidade de produtos disponíveis.</td>
	      </tr>			  
	    </tbody>
	  </table>
	  <h3>Classe: Livro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>isbn</td>
	        <td>String</td>
	        <td>Padrão de identificação de numeração dos livros a serem emprestados.</td>
	      </tr>
	      <tr>
	        <td>volume</td>
	        <td>int</td>
	        <td>Volume identificado em livros.</td>
	      </tr>
	      <tr>
	        <td>edicao</td>
	        <td>int</td>
	        <td>Número da edição dos livros.</td>
	      </tr>	
		  <tr>
	        <td>anoPublicacao</td>
	        <td>int</td>
	        <td>Ano de publicação dos livros.</td>
	      </tr>
		  <tr>
	        <td>nomeAutor</td>
	        <td>String</td>
	        <td>Nome do autor principal dos livros.</td>
	      </tr>			  		  
	    </tbody>
	  </table>
	  <h3>Classe: Revista</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>issn</td>
	        <td>String</td>
	        <td>Número internacional normalizado para publicações seriadas, como é o caso de Revistas.</td>
	      </tr>
	      <tr>
	        <td>edicao</td>
	        <td>int</td>
	        <td>Número da edição das Revistas.</td>
	      </tr>	      
		  <tr>
	        <td>ano</td>
	        <td>int</td>
	        <td>Ano das Revistas.</td>
	      </tr>		  			  		  
	    </tbody>
	  </table>
	  <h3>Classe: MaterialDigital</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>doi</td>
	        <td>String</td>
	        <td>Identificador de arquivo digital.</td>
	      </tr>
	      <tr>
	        <td>volume</td>
	        <td>int</td>
	        <td>Volume identificado nos arquivos digitais.</td>
	      </tr>	      
		  <tr>
	        <td>ano</td>
	        <td>int</td>
	        <td>Ano do arquivo digital.</td>
	      </tr>
	      <tr>
	        <td>linkDoi</td>
	        <td>String</td>
	        <td>Link completo contendo o código DOI.</td>
	      </tr>		  			  		  
	    </tbody>
	  </table>
	</div>
</body>
</html>