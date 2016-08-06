package com.gewu.Medical.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/index")
public class IndexController {
	private static Logger logger = Logger.getLogger(IndexController.class);

	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @author 段丁阳
	 */
	@RequestMapping(value = "guidePic", method = RequestMethod.GET)
	@ResponseBody
	public List<String> menu(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		List<String> guide_pic = new LinkedList<>();
		guide_pic.add("http://localhost:8080/Medical/resources/image/guide_pic1.jpg");
		guide_pic.add("http://localhost:8080/Medical/resources/image/guide_pic2.jpg");
		return guide_pic;
	}
	
	@RequestMapping(value = "main", method = RequestMethod.GET)
	@ResponseBody
	public List<String> main(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		List<String> category = new LinkedList<>();
		category.add("fenlei1");
		category.add("fenlei2");
		return category;
	}
	
	@RequestMapping(value = "fffff", method = RequestMethod.GET)
	public String fuck(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		List<String> category = new LinkedList<>();
		category.add("fenlei1");
		category.add("fenlei2");
		System.out.println("hello");
		return "index";
	}

}