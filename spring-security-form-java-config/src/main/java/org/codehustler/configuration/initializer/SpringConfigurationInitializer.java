package org.codehustler.configuration.initializer;

import org.codehustler.configuration.AppConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Spring Configuration Initializer. Allows us to use no XML configuration.
 *
 * @author Alessandro Giannone
 * @version 1.0
 */
public class SpringConfigurationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class[] { AppConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return null;
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[] { "/" };
	}

}
