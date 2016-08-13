package com.gewu.Medical.cmsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/cms")
public class CmsIndexController {
	private static Logger logger = Logger.getLogger(CmsIndexController.class);

	/*
	 * login.jsp
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		return "login";
	}
	
	@RequestMapping(value="register",method = RequestMethod.GET)
	public String regist(){
		return "register";
	}
	

}