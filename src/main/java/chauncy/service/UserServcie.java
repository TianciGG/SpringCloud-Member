package chauncy.service;

import java.util.List;

import chauncy.entity.UserEntity;


public interface UserServcie {
	
	public List<UserEntity> getAllUser();
	
	public UserEntity getUser(Integer id);
}
