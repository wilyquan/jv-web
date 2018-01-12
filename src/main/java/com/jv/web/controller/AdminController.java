/**
 * 
 */
package com.jv.web.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jv.web.BaseController;

/**
 * @author jewelvary
 *
 */
@Controller
@RequestMapping("/")
public class AdminController extends BaseController{

	@RequestMapping("")
	public String root(Locale locale) {
		return "redirect:/index.html";
	}

	/** Home page. 
	 * @throws Exception */
	@RequestMapping("/index.html")
	public String index() throws Exception {
		throw new Exception("Sam 错误");
//		
//		return "admin/index";
	}
}
