package org.mukesh.controller;

import org.mukesh.dto.UserDetails;
import org.mukesh.response.JsonResponse;
import org.mukesh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UsersService usersService;
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse getUserDetails(@PathVariable("userId") int userId){		
		
		JsonResponse jresponse = usersService.getUserDetails(userId);
		return jresponse;
	}

	
	@RequestMapping(value="/", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse saveUserDetails(@RequestBody UserDetails userDetails){		
		
		JsonResponse jresponse = usersService.saveUserDetails(userDetails);
		return jresponse;
	}
}
