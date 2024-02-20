<%@page import="model.bean.LibroBean"%>
<%@page import="model.bean.AutoreBean"%>
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
		<h2 class="text-center py-3">Autori</h2>
		<%
		List<LibroBean> libri = (List<LibroBean>) request.getAttribute("result");
		List<AutoreBean> autori = (List<AutoreBean>) request.getAttribute("autori");
		%>

		<div class="homeBtns d-flex justify-content-between">

			<table class="table">
				<tr>
					<th scope="col">Titolo</th>
					<th scope="col">Prezzo</th>
					<th scope="col">Data Pubblicazione</th>
					<th scope="col">BestSeller</th>
					<th scope="col">Autore</th>
				</tr>

				<%
				for (LibroBean libro : libri) {
				%>
				<tr>
					<td><%=libro.getTitoloLibro()%></td>
					<td><%=libro.getPrezzoLibro()%></td>
					<td><%=libro.getDataPubblicazioneLibro()%></td>
					<td><%=libro.isBestSellerLibro()%></td>
				
				</tr>
				<%}%>
				
			<%
				for (AutoreBean autore : autori) {
				%>
				<tr>
					<td><%=autore.getNomeAutore()%></td>
				</tr>
				<%}%>

			</table>
		</div>
	</div>
</body>
</html>
