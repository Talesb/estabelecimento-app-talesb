<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de Funcionario</h2>


		<form action="/funcionario/incluir" method="post">

			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome" name="nome">
			</div>

			<div class="mb-3 mt-3">
				<label>Login:</label> <input type="text" class="form-control"
					placeholder="Entre com o login" name="login">
			</div>

			<div class="mb-3 mt-3">
				<label>Senha:</label> <input type="password" class="form-control"
					placeholder="Entre com a senha" name="senha">
			</div>

			<div class="mb-3 mt-3">
				<label>Telefone:</label> <input type="text" class="form-control"
					placeholder="Entre com o telefone" name="telefone">
			</div>

			<div class="mb-3 mt-3">
				<label>CPF:</label> <input type="text" class="form-control"
					placeholder="Entre com o token" name="cpf">
			</div>
			
			<div class="mb-3 mt-3">
				<label>E-mail:</label> <input type="text" class="form-control"
					placeholder="Entre com o token" name="email">
			</div>

			<div class="form-group">
				<label>Estabelecimento</label> <select class="form-control"
					name="estabelecimentoId">
					<c:forEach var="e" items="${listaEstabelecimento}">
						<option value="${e.id}"> ${e.nome}</option>
					</c:forEach>
				</select>
			</div>


			<br />
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>