package org.mukesh.service;


import org.mukesh.dto.UserDetails;
import org.mukesh.response.JsonResponse;

public interface IUsersService {
	
	public JsonResponse getUserDetails(int actorId);
	
	public JsonResponse saveUserDetails(UserDetails userDetails);

}
