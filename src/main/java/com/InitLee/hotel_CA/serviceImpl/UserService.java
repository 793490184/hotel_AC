package com.InitLee.hotel_CA.serviceImpl;

import com.InitLee.hotel_CA.entity.User;
import com.InitLee.hotel_CA.mapper.UserMapper;
import com.InitLee.hotel_CA.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public void register(String name, String password) {
		User user = new User(name, password);
		userMapper.addUser(user);
	}

	@Override
	public void login(String userName) {

	}
}
