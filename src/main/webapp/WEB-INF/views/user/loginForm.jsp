<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="../layout/header.jsp" %>

<div class="container">
	<form>
		<div class="form-group">
			<label for="username">Username</label> 
			<input type="text" name="username" class="form-control" placeholder="Enter username" id="username">
		</div>
				
		<div class="form-group">
			<label for="password">Password</label> 
			<input type="password" name="password" class="form-control" placeholder="Enter password" id="password">
		</div>
	</form>
	<button id="btn-login" class="btn btn-primary">로그인</button>
</div>

<script src="/js/user/user.js"></script>
<%@include file="../layout/footer.jsp" %>
