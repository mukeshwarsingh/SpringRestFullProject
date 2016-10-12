package org.mukesh.controller;

import org.mukesh.response.JsonResponse;
import org.mukesh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UsersService usersService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String getUserDetails(){		
		
		int userId = 1;
		
		return "Hello World!!!";
		//return usersService.getUserDetails(userId);
	}

}
