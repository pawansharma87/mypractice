package org.codehustler.security;

import java.util.Arrays;
import java.util.List;

import org.codehustler.domain.UserModel;
import org.codehustler.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * This class fetches the user's information from MongoDB
 * and populates the {@link User} object with it.
 *
 * @author Alessandro Giannone
 * @version 1.0
 */
@Service
public class LoginService implements UserDetailsService
{
	private UserRepositoryImpl repository;

	@Autowired
	public LoginService( UserRepositoryImpl repository )
	{
		this.repository = repository;
	}

	/**
	 * @see UserDetailsService#loadUserByUsername(String)
	 */
	public UserDetails loadUserByUsername( String username ) throws UsernameNotFoundException
	{
		UserModel user = repository.findUserByUsername( username );

		if( user == null )
			throw new UsernameNotFoundException( "Oops!" );

		List<SimpleGrantedAuthority> authorities = Arrays.asList( new SimpleGrantedAuthority( user.getRole() ) );

		return new User( user.getUsername(), user.getSHA1Password(), authorities );
	}
}
