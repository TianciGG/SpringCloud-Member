package chauncy.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chauncy.entity.UserEntity;
import chauncy.service.UserServcie;

@RestController
@RequestMapping("/userApi")
public class UserApiController {
	
	@Autowired
	private UserServcie userService;
	
	@RequestMapping("/getUser")
	public UserEntity getUser(Integer userId){
		return userService.getUser(userId);
	}
}
