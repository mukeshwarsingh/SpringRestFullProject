package org.mukesh.dao;

import org.mukesh.dto.UserDetails;

public interface IUserDAO {

	public UserDetails getUserDetails(int actorId);
	
	public int saveUserDetails(UserDetails userDetails);
}
