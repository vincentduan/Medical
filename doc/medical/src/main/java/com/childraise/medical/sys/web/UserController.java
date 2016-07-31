/**
 * 
 */
package com.childraise.medical.sys.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.childraise.medical.cms.model.Category;
import com.childraise.medical.sys.model.User;
import com.childraise.medical.sys.service.UserService;
import com.childraise.utils.MD5;

/**
 * @author Jason_zh
 * @date 2016年6月2日
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello world";
	}
	
	@ResponseBody
	@RequestMapping(value="/register",method=RequestMethod.POST,produces = "application/json")
	public String register(@RequestParam String telephone,@RequestParam String password,HttpSession session){
		Map<String, Object> map = new HashMap<String, Object>();
		session.setAttribute("phone", telephone);
		session.setAttribute("password", password);
		/*发送短信注册验证码
		 * 
		 */
		//发送成功
		if(true)
			map.put("status", "1001");
		else
			map.put("status", "1002");
		return JSON.toJSONString(map,true);
	}
	
	@ResponseBody
	@RequestMapping("/register_auth")
	public Map<String, Object> register_auth(@RequestParam Integer authcode,HttpSession session){
		Map<String, Object> map = new HashMap<String, Object>();
		/*判断验证码是否正确
		 * 
		 */
		//验证码正确
		if(authcode==123456){
			String phone = (String) session.getAttribute("phone");
			String password = MD5.GetMD5Code((String) session.getAttribute("password"));
			int res = userService.register(phone,password);
			if (res==1) 
				map.put("status", "1001");
			else
				map.put("status", "1003");
		}else {
			map.put("status", "1002");
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public Map<String, Object> login(@RequestParam String telephone,@RequestParam String password){
		Map<String, Object> map = new HashMap<String, Object>();
		User user = userService.getUserByPhone(telephone);
		if(user==null){
			map.put("status", "1002");
			return map;
		}
		
		password = MD5.GetMD5Code(password);
		if(user.getPassword().equals(password)){
			map.put("status", "1001");
			map.put("uid", user.getId());
		}
		else
			map.put("status", "1003");
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/forget")
	public Map<String, Object> forget(@RequestParam String telephone,HttpSession session){
		Map<String, Object> map = new HashMap<String, Object>();
		User user = userService.getUserByPhone(telephone);
		if(user!=null){
			session.setAttribute("phone", telephone);
			map.put("status", "1001");
			/*发送重置密码验证
			 * 
			 */
		}
		else
			map.put("status", "1002");
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("forget_auth")
	public Map<String, Object> forget_auth(@RequestParam int authcode,@RequestParam String password,HttpSession session){
		Map<String, Object> map = new HashMap<String, Object>();
		//验证重置密码
		if(authcode==123456){
			password = MD5.GetMD5Code(password);
			String phone = (String) session.getAttribute("phone");
			int res = userService.updatePassword(password,phone);
			if(res==1)
				map.put("status", "1001");
			else
				map.put("status", "1003");
		}else {
			map.put("status", "1002");
		}
		
		return map;
	}
	
	@RequestMapping("/index")
	public String index(Model model){
		List<User> list = userService.findAllUsers();
		model.addAttribute("userlist", list);
		return "user/index";
	}
}
