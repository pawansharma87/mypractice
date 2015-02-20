package org.codehustler.repository;

import org.bson.types.ObjectId;
import org.codehustler.domain.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.jmkgreen.morphia.AdvancedDatastore;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.github.jmkgreen.morphia.query.Query;

/**
 * Simple repository implementation which extends the Morphia {@link BasicDAO}
 *
 * @author Alessandro Giannone
 * @version 1.0
 */
@Component
public class UserRepositoryImpl extends BasicDAO<UserModel, ObjectId>
{
	@Autowired
	public UserRepositoryImpl( AdvancedDatastore datastore )
	{
		super( datastore );
	}

	/**
	 * Finds the UserModel which has a matching username
	 * @param username
	 * @return
	 */
	public UserModel findUserByUsername( String username )
	{
		Query<UserModel> query = createQuery();
		query.field( "username" ).equal( username );
		return find( query ).get();
	}
}
