package com.example.demoImmobilierBack.dto;

public class UserDTOWithMesssage {
	UserDTO userDTO;
	String message;
	
	public UserDTOWithMesssage(UserDTO userDTO, String message) {
		this.userDTO = userDTO;
		this.message = message;
	}
	
	public UserDTOWithMesssage() {}
	
	
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
