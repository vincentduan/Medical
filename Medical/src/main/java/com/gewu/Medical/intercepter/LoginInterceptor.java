package com.gewu.Medical.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.gewu.Medical.model.Doctor;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	private static final String[] IGNORE_URI = {"/cms/login", "/cms/register"};
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		boolean flag = false;
		String url = request.getRequestURL().toString();
		for (String s : IGNORE_URI) {
            if (url.contains(s)) {
                flag = true;
                break;
            }
        }
		if (!flag) {
			Doctor doctor = (Doctor) request.getSession().getAttribute("doctor");
            if (doctor != null){
            	flag = true;
            }else{
            	response.sendRedirect(request.getContextPath() + "/cms/login");
            	flag = false;
            }
            
        }
        return flag;
	}
}
