package com.gi.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.gi.entity.Incidencia;
import com.gi.service.IncidenciaService;
import com.google.common.collect.Lists;

@ManagedBean
@SessionScoped
public class IncidenciaManagedBean {

	@ManagedProperty(value = "#{incidenciaService}")
	IncidenciaService incidenciaService;

	List<Incidencia> listIncidencia = new ArrayList<Incidencia>();
	

	// --------------------------------------------------------------------------

	public void setIncidenciaService(IncidenciaService incidenciaService) {
		this.incidenciaService = incidenciaService;
	}

	public List<Incidencia> getListIncidencia() {
		 listIncidencia = Lists.newArrayList(incidenciaService.getListIncidencia());
		 return listIncidencia;
	}

	public void setListIncidencia(List<Incidencia> listIncidencia) {
		this.listIncidencia = listIncidencia;
	}

	
	
}
