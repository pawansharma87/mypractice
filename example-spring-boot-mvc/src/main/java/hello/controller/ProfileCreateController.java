package hello.controller;

import hello.domain.User;
import hello.service.UserService;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.inject.Inject;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileCreateController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ProfileCreateController.class);
	private final UserService userService;

	// private final UserCreateFormPasswordValidator passwordValidator;

	@Inject
	public ProfileCreateController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/cms", method = RequestMethod.GET)
	public ModelAndView getCreateUserView() {
		LOGGER.debug("Received request for user create view");
		return new ModelAndView("profile", "form", new User());
	}

	@RequestMapping(value = "/cms", method = RequestMethod.POST)
	public String createUser(@RequestParam("resume") MultipartFile file,
			@ModelAttribute("form") @Valid User form, BindingResult result) {
		File f;
		String fName="resume"+File.separator+form.getName()+"exp"+form.getExperience()+".doc";
		f=new File(fName);
		if (!file.isEmpty()) {						
			try {
				
				f.getParentFile().mkdirs();
				f.createNewFile();
				byte[] bytes = file.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(f));
				stream.write(bytes);
				stream.close();
				LOGGER.debug("You successfully uploaded "+ file.getSize() + " into " + file.getName() + "-uploaded !");
				userService.save(new User(form.getDepartment(), form.getName(),
						form.getCompany(), form.getExperience(), form
								.getQualification(), form.getCollege(), fName, form.getRegDate()));
			} catch (Exception e) {
				LOGGER.debug("You failed to upload " + file.getName() + " => " + e.getMessage());
			}
		} else {
			LOGGER.debug("You failed to upload " + file.getName()+ " because the file was empty.");
		}
		return "redirect:/user_list.html";
	}

	@RequestMapping("/user_list.html")
	public ModelAndView getListUsersView() {
		LOGGER.debug("Received request to get user list view");
		ModelMap model = new ModelMap();
		model.addAttribute("users", userService.getList());
		return new ModelAndView("result", model);
	}

}