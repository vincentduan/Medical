package com.gewu.Medical.cmsController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gewu.Medical.model.Department;
import com.gewu.Medical.service.DepartmentService;
import com.gewu.Medical.service.DoctorService;


@Controller
@RequestMapping(value = "/cms/department")
public class CmsDepartmentController {
	
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private DepartmentService departmentService;
	private static Logger logger = Logger.getLogger(CmsDepartmentController.class);
	private String path = "department/";
	
	@RequestMapping(value = "getAllDepartment", method = RequestMethod.GET)
	@ResponseBody
	public List<Department> findDoctorsByDepartment(HttpServletRequest request,
			HttpServletResponse response) {
		List<Department> departments = departmentService.getAllDepartment();
		return departments;
	}
}