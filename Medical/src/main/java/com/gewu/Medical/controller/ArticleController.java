package com.gewu.Medical.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.service.ArticleService;
import com.gewu.Medical.service.DoctorService;

@Controller
@RequestMapping(value = "/article")
public class ArticleController {
	
	private static Logger logger = Logger.getLogger(ArticleController.class);
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping(value = "findAllArticles", method = RequestMethod.GET)
	@ResponseBody
	public List<Article> findAllArticles(HttpServletRequest request,
			HttpServletResponse response) {
		List<Article> articles = articleService.findAllArticles();
		return articles;
	}

}
