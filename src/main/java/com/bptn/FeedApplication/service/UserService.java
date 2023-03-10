package com.bptn.FeedApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bptn.FeedApplication.jpa.User;
import com.bptn.FeedApplication.repository.UserRepository;
import java.sql.Timestamp;
import java.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserRepository userRepository;

	
	@Autowired
	EmailService emailService;
	
	public List<User> listUsers() {
		return this.userRepository.findAll();
	}

	public Optional<User> findByUsername(String username) {

		return this.userRepository.findByUsername(username);

	}

	public void createUser(User user) {
		this.userRepository.save(user);
	}

	public User signup(User user) {
		user.setUsername(user.getUsername().toLowerCase());
		user.setEmailId(user.getEmailId().toLowerCase());
		user.setEmailVerified(false);
		user.setCreatedOn(Timestamp.from(Instant.now()));
		this.userRepository.save(user);
		
		this.emailService.sendVerificationEmail(user);
		return user;
		
	}

}
