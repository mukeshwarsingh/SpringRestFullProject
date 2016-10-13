/**
 * 
 */
package org.mukesh.service;

import javax.ws.rs.core.Response;

import org.mukesh.dao.UserDAO;
import org.mukesh.dto.UserDetails;
import org.mukesh.response.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mukeshwar Singh
 *
 */
@Service("usersService")
public class UsersService implements IUsersService {
	
	@Autowired
	UserDAO userDao; 
	
	private UserDetails userDetails;

	public JsonResponse getUserDetails(int actorId) {
		// TODO Auto-generated method stub
		JsonResponse jresponse = null;
		userDetails = userDao.getUserDetails(actorId);
		
		jresponse = JsonResponse.instance(Response.Status.OK.getStatusCode(),
				"correct details",
				"correct details", userDetails);
		
		
		return jresponse;
	}
	
	public JsonResponse saveUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		JsonResponse jresponse = null;
		int userId = userDao.saveUserDetails(userDetails);
		
		jresponse = JsonResponse.instance(Response.Status.OK.getStatusCode(),
				"correct details",
				"correct details", userId);
		
		return jresponse;
	}

}
