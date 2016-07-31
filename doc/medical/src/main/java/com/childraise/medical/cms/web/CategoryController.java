package com.childraise.medical.cms.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.childraise.medical.cms.model.Category;
import com.childraise.medical.cms.service.CategoryService;
/**
 * @author Jason_zh
 * @date 2016年6月10日
 * @version 1.0
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/index")
	public String index(@RequestParam(defaultValue="0") int id,Model model){
		List<Category> cateList = new ArrayList<>();
		
		if (id==0) {
			cateList = categoryService.findlevel1();
		}else {
			cateList = categoryService.findNextLevelById(id);
			Category category = categoryService.findById(id);
			model.addAttribute("category", category);
		}
		
		model.addAttribute("catelist", cateList);
		model.addAttribute("pid", id);
		return "category/index";
	}
	
	@RequestMapping("/form")
	public String add(@RequestParam int pid,Model model){
		Category category = new Category();
		if (pid==0) {
			category.setId(0);
			category.setLevel(0);
			category.setTitle("主目录");
		}else {
			category = categoryService.findById(pid);
		}
		model.addAttribute("category", category);
		return "category/form";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("Category") Category category,Model model){
		categoryService.save(category);
		return "redirect:index.do?id="+category.getId();
	}
}
