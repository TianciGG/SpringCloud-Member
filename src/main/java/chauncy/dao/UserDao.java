package chauncy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import chauncy.entity.UserEntity;

@Component
public class UserDao {
	
	public List<UserEntity>  getAllUser(){
		List<UserEntity> userList=new ArrayList<UserEntity>();
		for (int i = 0; i <= 20; i++) {
			userList.add(new UserEntity(i, "name:"+i));
		}
		return userList;
	}
}
