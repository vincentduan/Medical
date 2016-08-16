package com.gewu.Medical.cmsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.service.DepartmentService;
import com.gewu.Medical.service.DoctorService;


@Controller
@RequestMapping(value = "/cms")
public class CmsIndexController {
	private static Logger logger = Logger.getLogger(CmsIndexController.class);
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private DepartmentService departmentService;
	/*
	 * login.jsp
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String doLogin(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Doctor d = new Doctor();
		d.setUsername(username);
		d.setPassword(password);
		Doctor doctor = doctorService.queryByCondiction(d);
		if(doctor==null){
			return "login";
		}
		request.getSession().setAttribute("doctor", doctor);
		return "redirect:/cms/doctor/listView";
	}
	
	@RequestMapping(value="register",method = RequestMethod.GET)
	public String regist(){
		return "register";
	}
	@RequestMapping(value="register",method = RequestMethod.POST)
	public String dRegist(HttpServletRequest request, HttpServletResponse response, ModelMap map){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String telphone = request.getParameter("telphone");
		Doctor d = new Doctor();
		d.setUsername(username);
		Doctor doctor = doctorService.queryByCondiction(d);
		Doctor d2 = new Doctor();
		d2.setTelphone(telphone);
		Doctor doctor2 = doctorService.queryByCondiction(d2);
		if(doctor!=null || doctor2 != null){
			map.addAttribute("error", "username or telphone already exist");
			return "register";
		}else{
			Doctor d3 = new Doctor();
			d3.setUsername(username);
			d3.setTelphone(telphone);
			d3.setPassword(password);
			doctorService.save(d3);
		}
		return "redirect:/cms/login";
	}
	

}