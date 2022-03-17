<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<!DOCTYPE HTML>
<html>

<head>
<meta charset="uTF-8">
<meta name="viewport" content="width=dievice-width, intitial-scale=1.0">

<link
	href="../../../_bootstrap/_bootstrap/bootstrap-5.1.3-dist/css/bootstrap.min.css"
	rel="stylesheet">



<title>logIn</title>
<style type="text/css">
</style>
</head>
<body>

	<div class="container" style="margin-top: 50px;">
	<div class="row">
		<div class="col">
			<select style="float: right;">
				<option>한국어</option>
				<option>English</option>
				<option>中文</option>
			</select>
		</div>
	</div>
</div>
	<form>

		<div class="container" style="border: 1px solid black; border-radius: 10px; margin-top: 20%;">
					<div style="text-align: center;">
					<input type="image" src="../../../images/logo.png" style="margin:auto;">
					</div>
					<div class="row">
					<div class="container">
		<div class="col">
			<input type="text" placeholder="ID" class="form-control" style="margin-bottom: 20px; margin-top:20px;">
			<input type="text" placeholder="Password" class="form-control" style="margin-bottom: 20px;" >
			<div class="form-check form-switch">
  				<input class="form-check-input" type="checkbox" role="switch" id="autologin" checked>
  				<label class="form-check-label" for="autologin">Auto login</label>
			</div>
		<div class="d-grid gap-2 col">	
  				<button class="btn btn-secondary" type="button">Login</button>
  				<a href=# style="text-align: center; margin-bottom: 30px;">Find ID/Password</a>
		</div>
		</div>
	</div>
		<hr>
		<div class="d-grid gap-2 col">
			<button class="btn btn-success" type="button">Naver</button>
			<button class="btn btn-warning" type="button">KaKao</button>
			<button class="btn btn-danger" type="button">Google</button>
			<button class="btn" type="button" style="background-color: rgb(59,89,152); margin-bottom:10px; color:white;">Facebook</button>
		
		</div>
	</div>	
</div>
						
	</form>

	

	<script
		src="../../../_bootstrap/_bootstrap/bootstrap-5.1.3-dist/js/bootstrap.bundle.min.js">
		
	</script>

</body>
</html>