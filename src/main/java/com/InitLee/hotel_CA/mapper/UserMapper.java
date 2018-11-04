package com.InitLee.hotel_CA.mapper;

import com.InitLee.hotel_CA.entity.User;


public interface UserMapper {

	public void addUser(User user);
	public void findUserByName(String userName);

}
