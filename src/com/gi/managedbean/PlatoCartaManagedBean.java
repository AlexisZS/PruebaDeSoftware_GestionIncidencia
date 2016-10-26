package com.gi.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.gi.entity.PlatoCarta;
import com.gi.service.PlatoCartaService;
import com.google.common.collect.Lists;

@ManagedBean
@SessionScoped
public class PlatoCartaManagedBean {

	
	@ManagedProperty(value = "#{platoCartaService}")
	PlatoCartaService platoCartaService;

	
	public List<PlatoCarta> lisPlatoCarta = new ArrayList<PlatoCarta>();

	
	
	public void setPlatoCartaService(PlatoCartaService platoCartaService) {
		this.platoCartaService = platoCartaService;
	}

	public List<PlatoCarta> getLisPlatoCarta() {
		lisPlatoCarta = Lists.newArrayList(platoCartaService.listPlatoCarta());
		return lisPlatoCarta;
	}

	public void setLisPlatoCarta(List<PlatoCarta> lisPlatoCarta) {
		this.lisPlatoCarta = lisPlatoCarta;
	}

}
