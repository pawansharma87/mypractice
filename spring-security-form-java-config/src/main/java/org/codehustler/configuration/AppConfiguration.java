package org.codehustler.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Overall App Configuration
 *
 * @author Alessandro Giannone
 * @version 1.0
 */
@Configuration
@ComponentScan({ "org.codehustler.*" })
@Import({ MvcConfiguration.class, RepositoryConfiguration.class, SecurityConfiguration.class })
public class AppConfiguration
{
}
