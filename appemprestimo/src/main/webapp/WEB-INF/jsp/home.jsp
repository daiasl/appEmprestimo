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
	  <p>Projeto de empr�stimos na biblioteca.</p>   
	  
	  <h3>Classe: Emprestimo</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>dataEmprestimo</td>
	        <td>LocalDateTime</td>
	        <td>Data da realiza��o do empr�stimo.</td>
	      </tr>
	      <tr>
	        <td>dataDevolucao</td>
	        <td>LocalDateTime</td>
	        <td>Data de devolu��o do empr�stimo realizado.</td>
	      </tr>	      
	    </tbody>
	  </table>
	  <h3>Classe: Usuario</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome do usu�rio.</td>
	      </tr>
	      <tr>
	        <td>cpf</td>
	        <td>String</td>
	        <td>CPF do usu�rio.</td>
	      </tr>	      
	    </tbody>
	  </table>
	  <h3>Classe: Produto</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>titulo</td>
	        <td>String</td>
	        <td>T�tulo do produto a ser emprestado.</td>
	      </tr>
	      <tr>
	        <td>estante</td>
	        <td>int</td>
	        <td>Em qual estante est� localizado o produto.</td>
	      </tr>	
		  <tr>
	        <td>codigoBarras</td>
	        <td>String</td>
	        <td>Representa��o gr�fica de uma sequ�ncia num�rica utilizada para identificar um produto.</td>
	      </tr>
		  <tr>
	        <td>qtdExemplares</td>
	        <td>int</td>
	        <td>Quantidade de exemplares do mesmo produto.</td>
	      </tr>	
		  <tr>
	        <td>qtdDisponiveis</td>
	        <td>int</td>
	        <td>Quantidade de produtos dispon�veis.</td>
	      </tr>			  
	    </tbody>
	  </table>
	  <h3>Classe: Livro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>isbn</td>
	        <td>String</td>
	        <td>Padr�o de identifica��o de numera��o dos livros a serem emprestados.</td>
	      </tr>
	      <tr>
	        <td>volume</td>
	        <td>int</td>
	        <td>Volume identificado em livros.</td>
	      </tr>
	      <tr>
	        <td>edicao</td>
	        <td>int</td>
	        <td>N�mero da edi��o dos livros.</td>
	      </tr>	
		  <tr>
	        <td>anoPublicacao</td>
	        <td>int</td>
	        <td>Ano de publica��o dos livros.</td>
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
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>issn</td>
	        <td>String</td>
	        <td>N�mero internacional normalizado para publica��es seriadas, como � o caso de Revistas.</td>
	      </tr>
	      <tr>
	        <td>edicao</td>
	        <td>int</td>
	        <td>N�mero da edi��o das Revistas.</td>
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
	        <th>Descri��o</th>
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
	        <td>Link completo contendo o c�digo DOI.</td>
	      </tr>		  			  		  
	    </tbody>
	  </table>
	</div>
</body>
</html>