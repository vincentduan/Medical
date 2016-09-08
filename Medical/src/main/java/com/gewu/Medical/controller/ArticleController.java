package com.gewu.Medical.controller;

import java.util.LinkedList;
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
import com.gewu.Medical.model.User;
import com.gewu.Medical.model.UserRelArticle;
import com.gewu.Medical.service.ArticleService;
import com.gewu.Medical.service.DoctorService;
import com.gewu.Medical.service.UserRelArticleService;
import com.gewu.Medical.service.UserService;
import com.gewu.Medical.vo.ArticleVo;

@Controller
@RequestMapping(value = "/article")
public class ArticleController {
	
	private static Logger logger = Logger.getLogger(ArticleController.class);
	
	@Autowired
	private ArticleService articleService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private UserRelArticleService userRelArticleService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "findAllArticles", method = RequestMethod.GET)
	@ResponseBody
	public List<Article> findAllArticles(HttpServletRequest request,
			HttpServletResponse response) {
		List<Article> articles = articleService.findAllArticles();
		return articles;
	}
	/**
	 * 返回文章详细信息，包括文章信息，医生作者信息，浏览过本文的用户信息，浏览过本文的用户还浏览过那些文章
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getArticleById", method = RequestMethod.GET)
	@ResponseBody
	public ArticleVo getArticleById(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		ArticleVo articleVo = new ArticleVo();
		if(user == null){
			articleVo.setMessage("not login,session is null");
			return articleVo;
		}
		String article_id = request.getParameter("id");
		Article article = articleService.findById(Long.parseLong(article_id));
		Integer doctor_id = article.getDoctorid();
		Doctor doctor = doctorService.findById(Long.parseLong(doctor_id+""));
		//根据文章id得到 用户列表信息
		List<UserRelArticle> userRelArticles = userRelArticleService.findUsersByArticleId(article.getId());
		List<Integer> userids = new LinkedList<>();
		for(UserRelArticle userRelArticle:userRelArticles){
			userids.add(userRelArticle.getUserid());
		}
		//得到用户列表
		List<User> users = userService.findByUserIds(userids);
		//根据用户列表得到文章列表
		List<UserRelArticle> userRelArticles2 = userRelArticleService.findArticleByUserIds(userids);
		List<Integer> articleIds = new LinkedList<>();
		for(UserRelArticle userRelArticle:userRelArticles2){
			articleIds.add(userRelArticle.getArticleId());
		}
		//根据文章ids获得文章列表
		List<Article> articles = articleService.findArticlesByArticleIds(articleIds);
		articleVo.setScanAricles(articles);
		articleVo.setDoctor(doctor);
		articleVo.setUser(users);
		articleVo.setArticle(article);
		return articleVo;
	}
	/**
	 * 根据文章小分类，返回ArticleVo
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getArticlesByCategoryChild", method = RequestMethod.GET)
	@ResponseBody
	public List<Article> getArticleByCategoryChild(HttpServletRequest request){
		String categoryChild = request.getParameter("category_child");
		Article article = new Article();
		article.setCategoryChild(Integer.parseInt(categoryChild));
		List<Article> articles = articleService.findArticlesByCondition(article);
		return articles;
	}
	
	/**
	 * 搜索文章
	 * @param request
	 * @return
	 */
	@RequestMapping(value="search", method = RequestMethod.GET)
	@ResponseBody
	public List<Article> searchArticle(HttpServletRequest request){
		String title = request.getParameter("title");
		Article article = new Article();
		article.setTitle(title);
		List<Article> articles = articleService.findArticlesByCondition(article);
		return articles;
	}
	
}
