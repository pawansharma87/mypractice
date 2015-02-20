package org.codehustler.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This class maps the admin URL to the admin.jsp page.
 *
 * @author Alessandro Giannone
 * @version 1.0
 */
@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class AdminController
{
	/**
	 * Maps the admin URL with the admin.jsp page
	 * @return
	 */
	@RequestMapping( value = "/admin", method = RequestMethod.GET )
	public String admin()
	{
		return "admin";
	}
}