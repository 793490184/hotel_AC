package com.InitLee.hotel_CA.service;

import com.InitLee.hotel_CA.entity.User;

public interface IUserService {
	public void register(String name, String password);
	public void login(String userName);
}
