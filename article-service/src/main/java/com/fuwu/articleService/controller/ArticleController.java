package com.fuwu.articleService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuwu.articleService.service.proxy.UserServiceProxy;
import com.fuwu.dto.ArticleDTO;
import com.fuwu.dto.UserDTO;

@RestController
public class ArticleController {
	
	@Autowired
	UserServiceProxy userServiceProxy;
	
	@GetMapping("/articles")
	public ArticleDTO getArticle() {
		UserDTO userDTO;
		userDTO = userServiceProxy.getUser();
		return new ArticleDTO(2000l, "好文章", userDTO);
	}

}
