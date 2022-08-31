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
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/Livro/lista">Livro</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="/MaterialDigital/lista">Material Digital</a></li>
				<li class="nav-item"><a class="nav-link" href="/Revista/lista">Revista</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/Produto/lista">Produto</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="/Emprestimo/lista">Emprestimo</a></li>
				<li class="nav-item"><a class="nav-link" href="/Usuario/lista">Usuario</a>
				</li>
			</ul>
		</div>
	</nav>
	<div class="container mt-3">
		<h2>Cadastramento de Usuários</h2>
		<form action="/usuario/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o seu nome" name="nome">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">Email:</label> <input type="email"
					class="form-control" placeholder="Entre com o seu e-mail"
					name="email">
			</div>
			<div class="mb-3">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" placeholder="Entre com a sua senha"
					name="senha">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>