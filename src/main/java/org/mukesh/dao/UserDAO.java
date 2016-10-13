package org.mukesh.dao;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.mukesh.dto.UserDetails;
import org.mukesh.mapper.UserDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDAO extends JdbcDaoSupport implements IUserDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	SessionFactory sessionFactory;
	
	public UserDetails getUserDetails(int actorId) {
		// TODO Auto-generated method stub
		UserDetails userDetails;
		
		userDetails = new UserDetails(1, "Mukeshwar", "Singh", new Date());
		//userDetails = getJdbcTemplate().queryForObject("select * from sakila.actor where actor_id=?", new Object[]{actorId}, new UserDetailsMapper());
		
		return userDetails;
	}
	
	public int saveUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		
		int actoryId = (int)sessionFactory.getCurrentSession().save(userDetails);
		
		return actoryId;
	}

	

}
