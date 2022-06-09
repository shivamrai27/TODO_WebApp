
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="components/boots_cdn.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>

	<h1 class="text-center text-success">TASK</h1>
	
	<!-- SUCCESS MSG -->
	
	<%
		String suc = (String) session.getAttribute("suc");
	if (suc != null) {
	%>
	<div class="alert alert-success text-center" role="alert"><%=suc%></div>
	<%
		session.removeAttribute("suc");
	}
	%>
	
	
	<div class="container">
		<table class="table table-striped" border="1px">
			<thead class="bg-success text-white">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Task</th>
					<th scope="col">Status</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Java</td>
					<td>Pending</td>
					<td><a href="" class="btn btn-sm btn-success">Edit</a> <a
						href="" class="btn btn-sm btn-danger">Delete</a></td>
				</tr>

			</tbody>
		</table>
	</div>
</body>
</html>