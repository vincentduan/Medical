package com.ddy.Medical.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/doctor")
public class DoctorController {
	
	@RequestMapping(value = "findDoctorByCategory", method = RequestMethod.GET)
	@ResponseBody
	public String findDoctorByCategory(HttpServletRequest request,
			HttpServletResponse response){
		String doctors = "doctor1";
		return doctors;
	}
	

}
