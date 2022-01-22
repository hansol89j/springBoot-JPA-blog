<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp" %>

<div class="container">
	<form>
	  <div class="form-group">
	    <label for="username">User Name</label>
	    <input type="text" class="form-control" placeholder="Enter User Name" id="username">
	  </div>
	  
	  <div class="form-group">
	    <label for="email">Email</label>
	    <input type="email" class="form-control" placeholder="Enter Email" id="email">
	  </div>
	  
	  <div class="form-group">
	    <label for="password">Password:</label>
	    <input type="password" class="form-control" placeholder="Enter password" id="password">
	  </div>
	    
	  <div class="form-group form-check">
	    <label class="form-check-label">
	      <input class="form-check-input" type="checkbox"> Remember me
	    </label>
	  </div>
	  <button id="btn-save" class="btn btn-primary">회원가입완료</button>
	</form>
</div>

<script src="/js/user/user.js"></script>
		
<%@include file="../layout/footer.jsp" %>