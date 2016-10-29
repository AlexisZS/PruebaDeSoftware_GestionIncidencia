package com.gi.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.gi.entity.Incidencia;

@ManagedBean
@SessionScoped
public class MenuManagedBean {

	private Incidencia incidencia = new Incidencia();

	public String inicio() {
		return "home";
	}

	public String detalle() {
		incidencia = new Incidencia();
		return "detalle";
	}

	public String nuevo() {
		incidencia = new Incidencia();
		return "nuevo";
	}

	public String seguimiento() {
		incidencia = new Incidencia();
		return "seguimiento";
	}

	public String test() {
		return "home2";
	}

	public Incidencia getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(Incidencia incidencia) {
		this.incidencia = incidencia;
	}
}
