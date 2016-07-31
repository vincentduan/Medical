/**
 * 
 */
package com.childraise.medical.sys.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.childraise.medical.cms.model.Category;
import com.childraise.medical.cms.service.CategoryService;
import com.childraise.medical.cms.service.DocumentService;
import com.childraise.medical.sys.model.Archive;
import com.childraise.medical.sys.model.Document;
import com.childraise.medical.sys.model.User;
import com.childraise.medical.sys.service.SystemService;

/**
 * @author Jason_zh
 * @date 2016年6月3日
 * @version 1.0
 */
@Controller
public class SystemController {

	@Autowired
	private SystemService systemService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private DocumentService documentService;
	
	@ResponseBody
	@RequestMapping("/guide_page")
	public List<String> guide_page(@RequestParam Integer guidepageNum){
		List<String> list = systemService.getGuidePage(guidepageNum);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/main_content")
	public Map<String, Object> main_content(){
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<String> adList = systemService.getAdPage();
		map.put("ad", adList);
		
		List<Category> categories = categoryService.findlevel1();
		Map<Integer, Object> cateMap = new HashMap<>();
		for (Category category : categories) {
			List<String> cateList = new ArrayList<>();
			cateList.add(category.getTitle());
			cateList.add(category.getIntro());
			cateMap.put(category.getId(), cateList);
		}
		
		map.put("category", cateMap);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/sub_content")
	public Map<String, Object> sub_content(@RequestParam Integer category_id){
		Map<String, Object> map = new HashMap<>();
		Map<Integer, Object> cateMap = new HashMap<>();
			
		List<Category> categories = categoryService.findByPid(category_id);
		for (Category category : categories) {
			Map<String, Object> idMap = new HashMap<>();
			idMap.put("name", category.getTitle());
			List<Category> categories2 = categoryService.findByPid(category.getId());
			Map<Integer, Object> infomMap = new HashMap<>();   
			for (Category category2 : categories2) {
				infomMap.put(category2.getId(), category2.getTitle());
			}
			idMap.put("info", infomMap);
			
			cateMap.put(category.getId(), idMap);
		}
		/*Map<String, Object> infomMap = new HashMap<>();
		infomMap.put("10", "婴儿湿疹");
		infomMap.put("11", "脐带护理");
		infomMap.put("12", "预防臂红");
		
		idMap.put("name", "新生儿");
		idMap.put("info", infomMap);
		
		cateMap.put("5", idMap);*/
		map.put("category", cateMap);
		
		List<String> popList = new ArrayList<>();
		popList.add("宝宝身高");
		popList.add("奶粉");
		popList.add("腹泻");
		map.put("popsearch", popList);
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/personal_center")
	public Map<String, Object> personal_center(@RequestParam int uid,@RequestParam String info){
		Map<String, Object> map = new HashMap<>();
		
		User user = systemService.selectUser(uid);
		switch (info) {
		case "health_record":
			Archive archive = systemService.getArchive(uid);
			map.put("info", "health_record");
			map.put("content", archive);
			break;
		case "account":
			map.put("info", "account");
			map.put("remain", user.getAccount_m());
			break;
		case "vip":
			map.put("info", "vip");
			map.put("is_vip", user.getIs_vip());
			break;
		case "collection":
			user = systemService.selectUserWithColl(uid);
			Map<Integer, Object> collectMap = new HashMap<>();
			List<Document> docList = user.getCollection();
			for (Document document : docList) {
				collectMap.put(document.getId(), document.getTitle());
			}
			map.put("info", "collection");
			map.put("collecct", collectMap);
			break;
		default:
			break;
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/document")
	public Map<String, Object> content(@RequestParam int id){
		Document document = documentService.get(id);
		Map<String, Object> map = new HashMap<>();
		map.put("titled", document.getTitle());
		map.put("content", document.getContent());
		return map;
	}
}
