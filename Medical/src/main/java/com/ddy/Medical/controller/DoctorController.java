package com.ddy.Medical.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddy.Medical.model.Doctor;
import com.ddy.Medical.service.DoctorService;

@Controller
@RequestMapping(value = "/doctor")
public class DoctorController {
	
	private static Logger logger = Logger.getLogger(DoctorController.class);
	
	@Autowired
	private DoctorService doctorService;
	/**
	 * 根据科室id 得到当前科室的所有医生
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "findDoctorsByDepartment", method = RequestMethod.GET)
	@ResponseBody
	public List<Doctor> findDoctorsByDepartment(HttpServletRequest request,
			HttpServletResponse response) {
		int departmentid = Integer.parseInt(request.getParameter("departmentid"));
		List<Doctor> doctors = doctorService.findDoctorsByDepartment(departmentid);
		return doctors;
	}
	
	@RequestMapping(value = "findAllDoctors", method = RequestMethod.GET)
	@ResponseBody
	public List<Doctor> findAllDoctors(HttpServletRequest request,
			HttpServletResponse response) {
		List<Doctor> doctors = doctorService.findAllDoctors();
		return doctors;
	}

}
