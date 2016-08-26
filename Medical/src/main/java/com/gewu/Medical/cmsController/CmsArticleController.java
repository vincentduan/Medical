package com.gewu.Medical.cmsController;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
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

import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.service.ArticleService;
import com.gewu.Medical.service.DepartmentService;
import com.gewu.Medical.service.DoctorService;
import com.gewu.Medical.utils.Page;
import com.gewu.Medical.vo.DoctorVo;


@Controller
@RequestMapping(value = "/cms/article")
public class CmsArticleController {
	
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private DepartmentService departmentService;
	
	private static Logger logger = Logger.getLogger(CmsArticleController.class);
	
	private String path = "article/";

	/*
	 * 医生列表
	 */
	@RequestMapping(value = "listView", method = RequestMethod.GET)
	public String listView(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		Integer pageNo = Integer.parseInt(StringUtils.isNotBlank(request.getParameter("pageNo")) && StringUtils.isNumeric(request.getParameter("pageNo")) ? request.getParameter("pageNo")
				: "1");
		Article article = new Article();
		Page<Article> page = new Page<>();
		page.setPageSize(50);
		page.setPageNo(pageNo);
		articleService.queryByPage(page, article);
		List<Article> articles = page.getResult();
		map.put("articles", articles);
		map.put("page", page);
		return path + "article-list";
	}
	/*
	 * 修改(查看)医生信息页面
	 */
	@RequestMapping(value = "formView", method = RequestMethod.GET)
	public String formView(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		Long id = Long.parseLong(request.getParameter("id"));
		Doctor d = doctorService.findById(id);
		map.put("doctor", d);
		return path + "doctor-form";
	}
	/*
	 * 添加医生
	 */
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response,ModelMap map) {
		Article article = new Article();
		map.put("article", article);
		return path + "article-form";
	}
	
	/*
	 * 添加或修改文章实现
	 */
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modify(HttpServletRequest request) {
		Doctor doctor = (Doctor) request.getSession().getAttribute("doctor");
		Integer doctorid = doctor.getId();
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String category = request.getParameter("category");
		Article article = new Article();
		article.setTitle(title);
		article.setDoctorid(doctorid);
		article.setDoctorName(doctor.getUsername());
		article.setCategory(category);
		article.setDocument(content);
		article.setStatus("0");
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		article.setCreatetime(ts);
		if(StringUtils.isNotEmpty(id+"")){
			article.setId(Integer.parseInt(id));
			articleService.update(article);
		}else{
			articleService.save(article);
		}
		return "redirect:/cms/article/listView";
	}
	/*
	 * 文章查询
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
			//doctorVo.setDepartmentInfo(doctor.getDepartment());
			doctorVo.setRole(doctor.getRole());
			doctorVo.setScore(doctor.getScore());
			doctorVo.setEnglishname(doctor.getEnglishname());
			doctorVo.setAchievement(doctor.getAchievement());
			doctorVo.setAdvantage(doctor.getAdvantage());
			doctorVo.setBackground(doctor.getBackground());
			doctorVo.setBrief(doctor.getBrief());
			doctorVo.setFansnum(doctor.getFansnum());
			doctorVo.setWorkingexp(doctor.getWorkingexp());
			doctorVo.setPersonalclinicinfo(doctor.getPersonalclinicinfo());
			doctorVo.setPrice(doctor.getPrice());
			doctorVos.add(doctorVo);
		}
		return doctorVos;
	}
	
	
	

}