/**
 * 
 */
package com.childraise.medical.sys.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.childraise.medical.sys.service.DoctorService;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ2ÈÕ
 * @version 1.0
 */
@Controller
@RequestMapping("doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
}
