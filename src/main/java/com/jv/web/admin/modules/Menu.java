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
	private String icon;
	private Menu subMenu;
	private boolean selected = false;

	private List<Menu> subMenus;

	public Menu(String id, String name, String url, String description) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.description = description;
	}

	public Menu(String id, String name, String url, String icon, String description) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.icon = icon;
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

	public Menu getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(Menu subMenu) {
		this.subMenu = subMenu;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
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

	public static List<Menu> getDefaultMenus() {

		List<Menu> menus = Lists.newArrayList();
		Menu menu = new Menu("0", "base", "#", "");
		menu.addSubMenu(new Menu("1", "State Colors", "/components/base/state.html", ""));
		menu.addSubMenu(new Menu("2", "Typography", "/components/base/typography.html", ""));

		menus.add(menu);

		menu = new Menu("0", "datatables", "#", "");
		menu.addSubMenu(new Menu("1", "Local Data", "/components/base/data-local.html", ""));
		menu.addSubMenu(new Menu("2", "Local Ajax", "/components/base/data-ajax.html", ""));
		menu.addSubMenu(new Menu("3", "Tables", "/components/base/tables.html", ""));
		menu.addSubMenu(new Menu("4", "Tables2", "/components/base/tables2.html", ""));
		menus.add(menu);
		return menus;

	}

	public static List<Menu> getNuxtMenu() {
		List<Menu> itmes = Lists.newArrayList();
		Menu person = new Menu("0", "个人面板", "#", "");
		person.setSelected(true);
		itmes.add(person);

		Menu person1 = new Menu("01", "个人设置", "#", "type-ico", "");
		Menu person11 = new Menu("011", "个人信息", "info", "", "");
		person11.setSelected(true);
		Menu person12 = new Menu("012", "修改密码", "change-pwd", "", "");
		person1.addSubMenu(person11);
		person1.addSubMenu(person12);

		person.setSubMenu(person1);

		Menu setting = new Menu("1", "系统设置", "#", "");
		itmes.add(setting);

		Menu setting1 = new Menu("02", "系统设置", "#", "type-ico", "");
		Menu setting11 = new Menu("021", "系统信息", "info", "", "");
		setting11.setSelected(true);
		Menu setting12 = new Menu("022", "字典信息", "change-pwd", "", "");
		setting1.addSubMenu(setting11);
		setting1.addSubMenu(setting12);

		setting.setSubMenu(setting1);

		return itmes;
	}

}
