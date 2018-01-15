package com.jv.web.admin.modules;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
public class Menu {

	private String name;
	private String description;
	private String id;
	private String url;

	private List<Menu> subMenus;
	
	public Menu(String id, String name, String url, String description) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.description = description;
	}
	
	public Menu() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void addSubMenu(Menu menu) {
		if (subMenus == null) {
			subMenus = Lists.newArrayList();
		}
		subMenus.add(menu);
	}
	
	public static List<Menu> getDefaultMenus(){
		List<Menu> menus = Lists.newArrayList();
		Menu menu = new Menu("0", "base", "#","");
		menu.addSubMenu(new Menu("1", "State Colors", "/components/base/state.html",""));
		menu.addSubMenu(new Menu("2", "Typography", "/components/base/typography.html",""));
		
		menus.add(menu);
		
		menu = new Menu("0", "base1", "#","");
		menu.addSubMenu(new Menu("1", "State Colors1", "/components/base/state.html",""));
		menu.addSubMenu(new Menu("2", "Typography1", "/components/base/typography.html",""));
		menus.add(menu);
		return menus;
		
	}

}
