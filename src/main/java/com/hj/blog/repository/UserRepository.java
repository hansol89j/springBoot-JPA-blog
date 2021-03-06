package com.hj.blog.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hj.blog.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
}
