/**
 * 
 */
package com.jv.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jv.web.BaseController;
import com.jv.web.admin.modules.Menu;

/**
 * @author jewelvary
 *
 */
@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController{

//	@RequestMapping("")
//	public String root(Locale locale) {
//		return "redirect:/index.html";
//	}
//	@Autowired
//	public Menu menu;

	@RequestMapping("")
	@ResponseBody
	public List<Menu> index() throws Exception {
		List<Menu> menus = Menu.getDefaultMenus();
		return menus;
	}
}
