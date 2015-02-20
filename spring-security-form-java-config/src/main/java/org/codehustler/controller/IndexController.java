package org.codehustler.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This class maps the index URL to the index.jsp page.
 *
 * @author Alessandro Giannone
 * @version 1.0
 */
@Controller
@PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
public class IndexController
{
	/**
	 * Maps the index URL with the index.jsp page
	 * @return
	 */
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String index()
	{
		return "index";
	}
}