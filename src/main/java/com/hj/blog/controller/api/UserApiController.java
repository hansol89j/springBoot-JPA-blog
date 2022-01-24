package com.hj.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.hj.blog.dto.ResponseDto;
import com.hj.blog.model.RoleType;
import com.hj.blog.model.User;
import com.hj.blog.service.UserService;

@RestController
public class UserApiController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder encode;

	@PostMapping("/auth/joinProc")
	public ResponseDto<Integer> save(@RequestBody User user) {
		System.out.println("Usercontroller: save 호출됨");
		
		userService.memberJoin(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
	}
}
