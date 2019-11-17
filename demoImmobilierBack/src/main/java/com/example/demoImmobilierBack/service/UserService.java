package com.example.demoImmobilierBack.service;

import com.example.demoImmobilierBack.dto.UserDTO;
import com.example.demoImmobilierBack.model.User;

public interface UserService {
	
	UserDTO findByEmailAndPassword(String email, String password);
	
	UserDTO save(UserDTO userDTO);
	
	String checkIfUserExistsAndGoodCredential(UserDTO userDTO);
	
	UserDTO convertUserToUserDTO(User user);
	
	User convertUserDTOToUser(UserDTO userDTO);
	
	String checkEmailAndPasswordAndPasswordConfirm(UserDTO userDTO);

}
