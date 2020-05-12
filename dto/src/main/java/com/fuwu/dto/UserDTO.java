package com.fuwu.dto;

public class UserDTO {
	private Long id;
	private String userName;
	private int port;
	
	public UserDTO() {
		
	}
	public UserDTO(Long id, String userName, int port) {
		this.id=id;
		this.userName=userName;
		this.port=port;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
