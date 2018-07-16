package com.dubbo.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String getUserName() {
		
		return "hello caicai";
	}
	
	
}
