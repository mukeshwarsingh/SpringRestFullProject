package org.mukesh.controller;

import org.mukesh.dto.UserDetails;
import org.mukesh.response.JsonResponse;
import org.mukesh.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("users")
@Api(value="controller user", description="Operations related to user details")
public class UserController {
	
	@Autowired
	IUsersService usersService;
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get user details")
	public JsonResponse getUserDetails(@ApiParam(name="userId", value="user's Id for details to be fetched", required= true)@PathVariable("userId") int userId){		
		
		System.out.println("2nd local test Changes in controller class");
		System.out.println("Direct origin Changes in controller class");
		System.out.println("Changes in controller class");	
		System.out.println("Changes of test branch...");
		System.out.println("In a process to create another branch...");		
		System.out.println("2 commit and push in test branch, merge of local develop branch");
	
		System.out.println("local develop branch commit without push to orgin develop");
		System.out.println("2nd origing/develop commit and push");

		JsonResponse jresponse = usersService.getUserDetails(userId);
		return jresponse;
	}

	
	@RequestMapping(value="/", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse saveUserDetails(@RequestBody UserDetails userDetails){		
		
		JsonResponse jresponse = usersService.saveUserDetails(userDetails);
		return jresponse;
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse savetestDetails(@RequestBody UserDetails userDetails){		
		
		JsonResponse jresponse = usersService.saveUserDetails(userDetails);
		return jresponse;
	}
}
