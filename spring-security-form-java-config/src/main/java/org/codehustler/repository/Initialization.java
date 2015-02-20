package org.codehustler.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.jmkgreen.morphia.AdvancedDatastore;
import com.github.jmkgreen.morphia.Morphia;
import com.github.jmkgreen.morphia.mapping.MappingException;

/**
 * This class makes sure our User model is mapped to Morphia.
 *
 * @author Alessandro
 * @version 1.0
 */
@Component
public class Initialization
{
	@Autowired
	public Initialization( Morphia morphia, AdvancedDatastore datastore )
	{
		try
		{
			// Map MongoDB objects to Morphia
			morphia.mapPackage( "io.startkit.domain" );

			// Ensure we add the indexes
			// Note: this is only here for the tutorial purpose.
			// This should not be called every time the application is initialised
			// otherwise there will be a lot of wasted time re-indexing the Database.
			datastore.ensureIndexes();
		}
		catch( MappingException ex )
		{
			throw ex;
		}
	}
}
