package com.jv.web.admin.modules;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@ImportResource(value = "classpath:data/menu.xml")
@Component
public class Menu {
	public List<Map> data;

	public List<Map> getData() {
		return data;
	}

	public void setData(List<Map> data) {
		this.data = data;
	}
	
	public String toString() {
		return data.toString();
	}

}
