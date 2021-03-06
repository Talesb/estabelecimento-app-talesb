<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
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
		<h2>Cadastramento de Funcionarios</h2>

		<security:authorize access="hasRole('ADMIN')">

			<form action="/funcionario" method="get">
				<button type="submit" class="btn btn-primary">Novo</button>
			</form>

			<hr>
		</security:authorize>

		<c:if test="${not empty listaFuncionarios}">
			<h2>Total de Funcionarios: ${listaFuncionarios.size()}</h2>

			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Login</th>
						<th>Senha</th>
						<th>CPF</th>
						<th>Email</th>
						<th>Telefone</th>
						<th>Estabelecimento</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="s" items="${listaFuncionarios}">
						<tr>
							<td>${s.id}</td>
							<td>${s.nome}</td>
							<td>${s.login}</td>
							<td>${s.senha}</td>
							<td>${s.cpf}</td>
							<td>${s.email}</td>
							<td>${s.telefone}</td>
							<td>${s.nomeEstabelecimento}</td>

							<security:authorize access="hasRole('ADMIN')">
								<td><a href="/funcionario/${s.id}/excluir">excluir</a></td>
							</security:authorize>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listaFuncionarios}">
			<h2>N?o existem Funcionarios cadastrados!!!</h2>
		</c:if>

	</div>
</body>
</html>