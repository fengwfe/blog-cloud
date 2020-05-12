package com.fuwu.dto;

public class ArticleDTO {
	
	private Long id;
	private String articleName;
	UserDTO userDTO;
	public ArticleDTO() {
		
	}
	public ArticleDTO(Long id, String articleName, UserDTO userDTO) {
		this.id=id;
		this.articleName=articleName;
		this.userDTO=userDTO;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	
	

}
