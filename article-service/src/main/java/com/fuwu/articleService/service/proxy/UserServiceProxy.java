package com.fuwu.articleService.service.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.fuwu.dto.UserDTO;


@FeignClient(name="user-service")
//@RibbonClient(name="user-service")
public interface UserServiceProxy {
	
	@GetMapping("/users")
	public UserDTO getUser();

}
