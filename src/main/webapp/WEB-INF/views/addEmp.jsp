<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<!-- Nav Bar Start -->
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary p-3">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Employee Management</a>
			
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="home">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="addEmp">Add Employee</a></li>
				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
<!-- Nav Bar End -->
<div class="container mt-3">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<div class="card">
				<div class="card-header text-center">
					<h1>Add Employee</h1>
						<c:if test="${not empty msg}">
							<p class="text-center text-success">${msg}</p>
							<c:remove var="msg" scope="session" />
						</c:if>
					</div>
				<div class="card-body">
					<form action="createEmp" method="post">
						<div class="mb-3">
							<label>Enter Full Name</label>
							<input type="text" name="name" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Address</label>
							<input type="text" name="address" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Email</label>
							<input type="text" name="email" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Password</label>
							<input type="text" name="password" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Designation</label>
							<input type="text" name="designation" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Salary</label>
							<input type="text" name="salary" class="form-control">
						</div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
				</div>
			</div>
		</div>
	</div>

</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
</html>