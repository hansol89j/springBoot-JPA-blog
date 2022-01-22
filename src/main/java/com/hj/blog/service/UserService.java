package com.hj.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hj.blog.model.User;
import com.hj.blog.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void memberJoin(User user) {
		try {
			userRepository.save(user);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Userservice: memberJoin()" + e.getMessage());
		}
	}
}
