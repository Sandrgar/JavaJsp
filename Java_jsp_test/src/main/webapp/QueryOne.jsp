<%@page import="model.bean.UtenteBean"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>



<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2 class="text-center py-3">Utenti Giovani</h2>
		<%
		List<UtenteBean> utenti = (List<UtenteBean>) request.getAttribute("result");
		%>

		<div class="homeBtns d-flex justify-content-between">

			<table class="table">
				<tr>
					<th scope="col">Nome</th>
					<th scope="col">Cognome</th>
					<th scope="col">Email</th>
					<th scope="col">� giovane</th>
				</tr>

				<%
				for (UtenteBean utente : utenti) {
				%>
				<tr>
					<td><%=utente.getNomeUtente()%></td>
					<td><%=utente.getCognomeUtente()%></td>
					<td><%=utente.getEmailUtente()%></td>
					<td><%=utente.isYoungUtente()%></td>
				</tr>
				<%}%>

			</table>
		</div>
	</div>
</body>
</html>
