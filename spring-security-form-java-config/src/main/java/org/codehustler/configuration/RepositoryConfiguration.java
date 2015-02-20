package org.codehustler.configuration;

import java.net.UnknownHostException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.github.jmkgreen.morphia.AdvancedDatastore;
import com.github.jmkgreen.morphia.Morphia;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;

/**
 * Loads the relevant repository classes
 *
 * @author Alessandro Giannone
 * @version 1.0
 */
@Configuration
public class RepositoryConfiguration
{
	private String dbName = "codehustler";
	private String mongoDbAddress = "127.0.0.1";

	@Bean
	public Morphia getMorphia() throws UnknownHostException
	{
		return new Morphia();
	}

	@Bean
	public AdvancedDatastore getAdvancedDatastore() throws UnknownHostException
	{
		return getMorphia().createAdvancedDatastore( getMongo(), dbName );
	}

	@Bean
	public MongoClient getMongo() throws UnknownHostException
	{
		MongoClientOptions options = MongoClientOptions.builder()
				.connectionsPerHost( 150 )
				.threadsAllowedToBlockForConnectionMultiplier( 150 )
				.autoConnectRetry( true )
				.writeConcern( WriteConcern.ERRORS_IGNORED ).build();

		ServerAddress severAddress = new ServerAddress( mongoDbAddress );

		return new MongoClient( severAddress, options );
	}


	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
		driverManagerDataSource.setUrl( "jdbc:mysql://localhost:3306/codehustler" );
		driverManagerDataSource.setUsername( "root" );
		driverManagerDataSource.setPassword( "password" );
		return driverManagerDataSource;
	}
}
