package com.gewu.Medical.cmsController;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.service.DepartmentService;
import com.gewu.Medical.service.DoctorService;
import com.gewu.Medical.utils.Page;
import com.gewu.Medical.vo.DoctorVo;


@Controller
@RequestMapping(value = "/cms/doctor")
public class CmsDoctorController {
	
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private DepartmentService departmentService;
	private static Logger logger = Logger.getLogger(CmsDoctorController.class);
	private String path = "doctor/";

	/*
	 * 医生列表
	 */
	@RequestMapping(value = "listView", method = RequestMethod.GET)
	public String listView(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("doctor") Doctor doctor, ModelMap map) {
		Integer pageNo = Integer.parseInt(StringUtils.isNotBlank(request.getParameter("pageNo")) && StringUtils.isNumeric(request.getParameter("pageNo")) ? request.getParameter("pageNo")
				: "1");
		Page<Doctor> page = new Page<>();
		page.setPageSize(10);
		page.setPageNo(pageNo);
		doctorService.queryByPage(page, doctor);
		List<Doctor> doctors = page.getResult();
		List<DoctorVo> doctorVos = getDoctorVoList(doctors);
		map.put("doctorVos", doctorVos);
		map.put("page", page);
		return path + "doctor-list";
	}
	/*
	 * 修改(查看)医生信息页面
	 */
	@RequestMapping(value = "formView", method = RequestMethod.GET)
	public String formView(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		Long id = Long.parseLong(request.getParameter("id"));
		Doctor d = doctorService.findById(id);
		List<Doctor> doctors =  new LinkedList<>();
		doctors.add(d);
		List<DoctorVo> doctorVos = getDoctorVoList(doctors);
		map.put("doctorVo", doctorVos.get(0));
		map.put("tagType", 1);//查看或者修改标签页
		return path + "doctor-form";
	}
	/*
	 * 添加医生
	 */
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("doctorVo") DoctorVo doctorVo,ModelMap map) {
		map.put("tagType", 0);
		return path + "doctor-form";
	}
	
	/*
	 * 添加或修改医生实现
	 */
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modify(HttpServletRequest request, HttpServletResponse response) {
		Doctor doctor = new Doctor();
		String username = request.getParameter("username");
		String englistName = request.getParameter("englistName");
		String telphone = request.getParameter("telphone");
		String hospital = request.getParameter("hospital");
		String department = request.getParameter("department");
		String role = request.getParameter("role");
		String score = request.getParameter("score");
		String price = request.getParameter("price");
		String advantage = request.getParameter("advantage");
		String background = request.getParameter("background");
		String achievement = request.getParameter("achievement");
		String workingexp = request.getParameter("workingexp");
		String haspersonalclinic = request.getParameter("haspersonalclinic");
		String personalclinicinfo = request.getParameter("personalclinicinfo");
		doctor.setUsername(username);
		doctor.setEnglishname(englistName);
		doctor.setTelphone(telphone);
		doctor.setHospital(hospital);
		doctor.setDepartment(Integer.parseInt(department));
		doctor.setRole(role);
		doctor.setScore(new BigDecimal(score));
		doctor.setPrice(Integer.parseInt(price));
		doctor.setAdvantage(advantage);
		doctor.setAchievement(achievement);
		doctor.setBackground(background);
		doctor.setWorkingexp(workingexp);
		doctor.setHaspersonalclinic(haspersonalclinic);
		doctor.setPersonalclinicinfo(personalclinicinfo);
		doctor.setIsdel(false);
		String doctorid = request.getParameter("id");
		if(StringUtils.isNotEmpty(doctorid)){
			doctor.setId(Integer.parseInt(doctorid));
			doctorService.update(doctor);
		}else{
			doctorService.save(doctor);
		}
		return "redirect:/cms/doctor/listView";
	}
	/*
	 * 医生查询
	 */
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("doctor") Doctor doctor, ModelMap map) {
		Long id = Long.parseLong(doctor.getId()+"");
		Doctor d = doctorService.findById(id);
		map.addAttribute("doctor", d);
		return path + "doctor-form";
	}
	/*
	 * 删除医生
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse response) {
		String doctorid = request.getParameter("id");
		if(StringUtils.isNotEmpty(doctorid)){
			Long id = Long.parseLong(doctorid);
			Doctor d = doctorService.findById(id);
			d.setIsdel(true);
			doctorService.update(d);
		}
		return "redirect:/cms/doctor/listView";
	}
	private List<DoctorVo> getDoctorVoList(List<Doctor> doctors) {
		List<DoctorVo> doctorVos = new LinkedList<>();
		DoctorVo doctorVo = null;
		for(Doctor doctor:doctors){
			doctorVo = new DoctorVo();
			doctorVo.setId(doctor.getId());
			doctorVo.setUsername(doctor.getUsername());
			doctorVo.setTelphone(doctor.getTelphone());
			doctorVo.setHospital(doctor.getHospital());
			if(doctor.getDepartment()!=null){
				doctorVo.setDepartmentInfo(departmentService.findById(Long.parseLong(doctor.getDepartment()+"")));
			}
			doctorVo.setRole(doctor.getRole());
			doctorVo.setScore(doctor.getScore());
			doctorVo.setEnglishname(doctor.getEnglishname());
			doctorVo.setAchievement(doctor.getAchievement());
			doctorVo.setAdvantage(doctor.getAdvantage());
			doctorVo.setBackground(doctor.getBackground());
			doctorVo.setBrief(doctor.getBrief());
			doctorVo.setEducation(doctor.getEducation());
			doctorVo.setFansnum(doctor.getFansnum());
			doctorVo.setWorkingexp(doctor.getWorkingexp());
			doctorVo.setPersonalclinicinfo(doctor.getPersonalclinicinfo());
			doctorVo.setPrice(doctor.getPrice());
			doctorVos.add(doctorVo);
		}
		return doctorVos;
	}
	
	
	

}