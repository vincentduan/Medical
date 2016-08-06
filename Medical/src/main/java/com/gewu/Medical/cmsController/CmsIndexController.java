package com.gewu.Medical.cmsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/cms/system")
public class CmsIndexController {
	private static Logger logger = Logger.getLogger(CmsIndexController.class);

	/*
	 * main.jsp
	 */
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String menu(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		return "main";
	}
	

}