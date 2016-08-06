package com.gewu.Medical.cmsController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.service.DoctorService;
import com.gewu.Medical.utils.Page;


@Controller
@RequestMapping(value = "/cms/doctor")
public class CmsDoctorController {
	
	@Autowired
	private DoctorService doctorService;
	private static Logger logger = Logger.getLogger(CmsDoctorController.class);
	private String path = "doctor/";

	/*
	 * 医生列表
	 */
	@RequestMapping(value = "listView", method = RequestMethod.GET)
	public String listView(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		Integer pageNo = Integer.parseInt(StringUtils.isNotBlank(request.getParameter("pageNo")) && StringUtils.isNumeric(request.getParameter("pageNo")) ? request.getParameter("pageNo")
				: "1");
		Page<Doctor> page = new Page<>();
		page.setPageSize(2);
		page.setPageNo(pageNo);
		Doctor doctor = new Doctor();
		doctorService.queryByPage(page, doctor);
		List<Doctor> doctors = page.getResult();
		for(Doctor d:doctors){
			System.out.println(d.getUsername());
		}
		map.put("page", page);
		return path + "doctor-list";
	}
	/*
	 * 修改(添加)医生信息页面
	 */
	@RequestMapping(value = "formView", method = RequestMethod.GET)
	public String formView(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		return "main";
	}
	/*
	 * 修改医生实现
	 */
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modify(HttpServletRequest request, HttpServletResponse response) {
		return "main";
	}
	/*
	 * 医生查询
	 */
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		return "main";
	}
	/*
	 * 删除医生
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		return "main";
	}
	
	
	
	

}