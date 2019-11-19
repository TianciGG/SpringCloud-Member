package chauncy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chauncy.dao.UserDao;
import chauncy.entity.UserEntity;
import chauncy.service.UserServcie;

@Service
public class UserServiceImpl implements UserServcie{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<UserEntity> getAllUser(){
		return userDao.getAllUser();
	}
	
	@Override
	public UserEntity getUser(Integer id){
		List<UserEntity> userList=getAllUser();
		for(UserEntity user : userList){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
}
