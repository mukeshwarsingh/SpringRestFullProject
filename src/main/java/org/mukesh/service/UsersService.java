/**
 * 
 */
package org.mukesh.service;

import org.mukesh.dao.UserDAO;
import org.mukesh.dto.UserDetails;
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

	public UserDetails getUserDetails(int actorId) {
		// TODO Auto-generated method stub
		userDetails = userDao.getUserDetails(actorId);
		return userDetails;
	}

}
