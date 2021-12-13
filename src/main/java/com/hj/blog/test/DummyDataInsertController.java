package com.hj.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hj.blog.model.RoleType;
import com.hj.blog.model.User;
import com.hj.blog.repository.UserRepository;

@RestController
public class DummyDataInsertController {
	
	@Autowired //의존성 주입 DI
	private UserRepository userRepository;
	@PostMapping("/dummy/join")
	public String join(User user) {
		System.out.println("id: " + user.getId());
		System.out.println("username: " + user.getUsername());
		System.out.println("password: " + user.getPassword());
		System.out.println("email : " + user.getEmail());
		System.out.println("Role : " + user.getRole());
		System.out.println("CreateDate : " + user.getCreateDate());
		
		
		user.setRole(RoleType.USER);
		userRepository.save(user);
		return "회원가입이 완료되었습니다.";
	}
}
