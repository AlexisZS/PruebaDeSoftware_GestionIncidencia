package com.gi.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MenuManagedBean {

	public String inicio() {
		return "home";
	}

	public String detalle() {
		return "detalle";
	}

	public String nuevo() {
		return "nuevo";
	}

	public String seguimiento() {
		return "seguimiento";
	}

}
