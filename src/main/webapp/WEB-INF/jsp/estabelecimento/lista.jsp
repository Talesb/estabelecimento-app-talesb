<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de Estabelecimentos</h2>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Confirmação!</strong> ${mensagem}
			</div>
		</c:if>

		<form action="/estabelecimento" method="get">
			<button type="submit" class="btn btn-primary">Novo</button>
		</form>

		<hr>

		<c:if test="${not empty listaEstabelecimento}">
			<h2>Total de Estabelecimentos: ${listaEstabelecimento.size()}</h2>

			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Login</th>
						<th>Senha</th>
						<th>CNPJ</th>
						<th>Endereço</th>
						<th>edtech</th>
						<th>Qtd de Funcionarios</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" items="${listaEstabelecimento}">
						<tr>
							<td>${e.id}</td>
							<td>${e.nome}</td>
							<td>${e.login}</td>
							<td>${e.senha}</td>
							<td>${e.cnpj}</td>
							<td>${e.endereco}</td>
							<td>${e.edtech}</td>
							<td>${e.qtdFuncionarios}</td>
							<td><a href="/estabelecimento/${e.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listaEstabelecimento}">
			<h2>Não existem Estabelecimentos cadastrados!!!</h2>
		</c:if>

	</div>
</body>
</html>