package com.Springboot.taskproject.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.Springboot.taskproject.bean.User;
import com.Springboot.taskproject.repository.UserRepository;
import com.Springboot.taskproject.service.UserService;

public class UserServiceImpl implements UserService {
@Autowired
public UserRepository userRepository;
	@Override
	public Integer saveuser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user).getid();
	}
}
