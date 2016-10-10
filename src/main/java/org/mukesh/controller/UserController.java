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
@RequestMapping("/rest")
public class UserController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public JsonResponse getUserDetails(){		
		
		int userId = 1;
		return usersService.getUserDetails(userId);
	}

}
