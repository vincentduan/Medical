package com.gewu.Medical.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gewu.Medical.vo.Status;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@RequestMapping(value = "regist", method = RequestMethod.GET)
	@ResponseBody
	public Status regist(HttpServletRequest request,
			HttpServletResponse response){
		Status status = new Status();
		status.setStatus("100");
		return status;
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	@ResponseBody
	public String login(HttpServletRequest request,
			HttpServletResponse response){
		String userName = request.getParameter("username");
		String pasword = request.getParameter("password");
		Status status = new Status();
		status.setStatus("100");
		return userName;
	}
	/**
	 * forget password
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "forgetPassword", method = RequestMethod.GET)
	@ResponseBody
	public Status forgetPassword(HttpServletRequest request,
			HttpServletResponse response){
		Status status = new Status();
		status.setStatus("1001");
		return status;
	}

}
