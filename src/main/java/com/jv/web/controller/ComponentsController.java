/**
 * 
 */
package com.jv.web.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jv.web.BaseController;

/**
 * @author jewelvary
 *
 */
@Controller
@RequestMapping("/components")
public class ComponentsController extends BaseController{

//	@RequestMapping("")
//	public String root(Locale locale) {
//		return "redirect:/index.html";
//	}

	/** Home page. 
	 * @throws Exception */
	@RequestMapping("/base/{p}.html")
	public String index(@PathVariable String p) throws Exception {
		logger.info(p);
		return "admin/components/"+p;
	}
}
