<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp" %>

<div class="container">
	<form>
		<input type="hidden" value="${principal.user.id}" id="id"/>
		<div class="form-group">
		  <label for="username">User Name</label>
		  <input type="text" value="${principal.user.username}" class="form-control" placeholder="Enter User Name" id="username">
		</div>
		
		<c:if test="${empty principal.user.oauth}">
			<div class="form-group">
			  <label for="password">Password:</label>
			  <input type="password"  class="form-control" placeholder="Enter password" id="password">
			</div>
		</c:if>
		
		<div class="form-group">
		  <label for="email">Email</label>
		  <input type="email" value="${principal.user.email}" class="form-control" placeholder="Enter Email" id="email" readonly>
		</div>
		
		
	</form>
	<button id="btn-save" class="btn btn-primary">회원수정완료</button>
</div>

<script src="/js/user/user.js"></script>
		
<%@include file="../layout/footer.jsp" %>
