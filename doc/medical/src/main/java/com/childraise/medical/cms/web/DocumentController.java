/**
 * 
 */
package com.childraise.medical.cms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.childraise.medical.cms.model.Category;
import com.childraise.medical.cms.service.CategoryService;
import com.childraise.medical.cms.service.DocumentService;
import com.childraise.medical.sys.model.Document;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ12ÈÕ
 * @version 1.0
 */
@Controller
@RequestMapping("/doc")
public class DocumentController {
	@Autowired
	private DocumentService documentService;
	@Autowired
	private CategoryService categoryService;
	
	@ModelAttribute("document")
	public Document get(@RequestParam(required=false) Integer id) {
		if (id==null || id.equals("")){
			return new Document();
		}else{
			return documentService.get(id);
		}
	}
	
	@RequestMapping("/index")
	public String index(Model model){
		List<Document> doclist = documentService.getAllDoc();
		model.addAttribute("doclist",doclist);
		return "document/index";
	}
	
	@RequestMapping("/content")
	public String content(@RequestParam int id,Model model){
		Document document = documentService.get(id);
		model.addAttribute("document",document);
		return "document/content";
	}
	
	@RequestMapping("/form")
	public String form(Model model){
		List<Category> list = categoryService.findAllCate();
		model.addAttribute("catelist", list);
		return "document/form";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("document") Document document,Model model){
		documentService.save(document);
		return "redirect:index.do";
	}
	
}
