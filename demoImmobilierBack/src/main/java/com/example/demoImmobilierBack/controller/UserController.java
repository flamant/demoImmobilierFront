package com.example.demoImmobilierBack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoImmobilierBack.dto.UserDTO;
import com.example.demoImmobilierBack.dto.UserDTOWithMesssage;
import com.example.demoImmobilierBack.service.UserService;

@RestController
@RequestMapping({"/api/user"})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",
    method = RequestMethod.POST,
    produces = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE},
    consumes = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody UserDTOWithMesssage login(@RequestBody UserDTO userDTO){
    	UserDTOWithMesssage userDTOWithMesssage = new UserDTOWithMesssage();
    	String message = userService.checkIfUserExistsAndGoodCredential(userDTO);
    	if (message.isEmpty()) {
    		userDTO = userService.findByEmailAndPassword(userDTO.getEmail(), userDTO.getPassword());
    		userDTO.setPassword("");
    	} else {
    		userDTOWithMesssage.setMessage(message);
    	}
        return userDTOWithMesssage;
    }
    
    @RequestMapping(value = "/createUser",
    method = RequestMethod.POST
//    produces = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE},
//    consumes = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE}
    )
    public @ResponseBody UserDTO save(@RequestBody UserDTO userDTO){
    	UserDTO userDTOWithMesssage = new UserDTO();
    	String message = userService.checkEmailAndPasswordAndPasswordConfirm(userDTO);
    	if (message != null && message.length() == 0) {
    		userDTOWithMesssage = userService.save(userDTO);
    	}
    	userDTOWithMesssage.setMessage(message);
    	return userDTOWithMesssage;
    }


}