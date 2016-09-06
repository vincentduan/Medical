package com.gewu.Medical.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gewu.Medical.model.User;
import com.gewu.Medical.service.DoctorService;
import com.gewu.Medical.service.UserService;
import com.gewu.Medical.vo.UserVo;


@Controller
@RequestMapping(value = "/index")
public class IndexController {
	
	private static Logger logger = Logger.getLogger(IndexController.class);
	
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private UserService userService;
	
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
		guide_pic.add("http://101.200.233.227:8080/Medical/resources/image/guide_pic1.jpg");
		guide_pic.add("http://101.200.233.227:8080/Medical/resources/image/guide_pic2.jpg");
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
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	@ResponseBody
	public UserVo login(HttpServletRequest request) {
		String telphone = request.getParameter("telphone");
		String password = request.getParameter("password");
		User user = new User();
		user.setTelphone(telphone);
		user.setPassword(password);
		User u = userService.queryByCondiction(user);
		UserVo userVo = new UserVo();
		if(u!=null){
			userVo.setUser(u);
			userVo.setStatus("100");
			userVo.setMessage("success");
			request.getSession().setAttribute("user", user);
		}
		else{
			userVo.setUser(null);
			userVo.setStatus("101");
			userVo.setMessage("wrong telphone or password");
		}
		return userVo;
	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	@ResponseBody
	public UserVo register(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String telphone = request.getParameter("telphone");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setTelphone(telphone);
		User u = new User();
		u.setUsername(username);
		User u_temp = userService.queryByCondiction(u);
		User u2 = new User();
		u2.setTelphone(telphone);
		User u_temp2 = userService.queryByCondiction(u2);
		UserVo userVo = new UserVo();
		if(u_temp!=null || u_temp2 != null){
			userVo.setStatus("104");
			userVo.setMessage("username or telphone have already exist");
		}else{
			userService.save(user);
			userVo.setUser(user);
			userVo.setStatus("103");
			userVo.setMessage("success");
		}
		return userVo;
	}

}