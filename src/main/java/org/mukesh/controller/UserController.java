package org.mukesh.controller;

import org.mukesh.response.JsonResponse;
import org.mukesh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest")
public class UserController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="/users/{userId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE )
	public JsonResponse getUserDetails(@PathVariable("userId") int userId){		
		
		return usersService.getUserDetails(userId);
	}

}
