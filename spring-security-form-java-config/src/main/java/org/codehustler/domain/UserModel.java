package org.codehustler.domain;

import org.apache.commons.codec.digest.DigestUtils;
import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import com.github.jmkgreen.morphia.annotations.Indexed;

/**
 * The User domain model
 *
 * @author	Alessandro Giannone
 * @version 1.0
 */
@Entity( value="users", noClassnameStored=true, concern="SAFE" )
public class UserModel
{
	@Id
	private ObjectId id;
	@Indexed(unique=true)
	private String username;
	private String password;
	private String role;

	protected UserModel() {}

	public UserModel( String username, String password, String role )
	{
		this.username = username;
		this.password = DigestUtils.sha1Hex( password );
		this.role = role;
	}

	public ObjectId getId() { return id; }
	public String getUsername() { return username; }
	public String getSHA1Password() { return password; }
	public String getRole() { return role; }
}
