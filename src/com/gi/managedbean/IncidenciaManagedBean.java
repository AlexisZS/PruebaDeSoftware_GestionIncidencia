package com.gi.managedbean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.gi.entity.Categoria;
import com.gi.entity.Estado;
import com.gi.entity.Incidencia;
import com.gi.entity.Usuario;
import com.gi.service.CategoriaService;
import com.gi.service.EstadoService;
import com.gi.service.IncidenciaService;
import com.gi.service.TipoUsuarioService;
import com.gi.service.UsuarioService;
import com.google.common.collect.Lists;

@ManagedBean
@SessionScoped
public class IncidenciaManagedBean {
	// incidenciaManagedBean

	@ManagedProperty(value = "#{incidenciaService}")
	private IncidenciaService incidenciaService;

	@ManagedProperty(value = "#{categoriaService}")
	private CategoriaService categoriaService;

	@ManagedProperty(value = "#{estadoService}")
	private EstadoService estadoService;

	@ManagedProperty(value = "#{tipoUsuarioService}")
	private TipoUsuarioService tipoUsuarioService;

	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioService usuarioService;

	private List<Incidencia> listIncidencia = new ArrayList<Incidencia>();
	private Incidencia incidencia = new Incidencia();

	private List<Categoria> listcategoria = new ArrayList<Categoria>();
	private List<Estado> listEstados = new ArrayList<Estado>();
	private List<Usuario> listUsuarios = new ArrayList<Usuario>();

	public String registrar() {
		incidencia.setFecReg(new Date());
		incidenciaService.registar(incidencia);
		listIncidencia = new ArrayList<Incidencia>();
		incidencia = new Incidencia();
		return "home";
	}

	public String detalle() {
		FacesContext context = FacesContext.getCurrentInstance();
		Map params = context.getExternalContext().getRequestParameterMap();
		String paramId = (String) params.get("codInc");
		incidencia = incidenciaService.detalle(new Integer(paramId));

		return "detalle";
	}
	
	public String detalleUpdate() {
		FacesContext context = FacesContext.getCurrentInstance();
		Map params = context.getExternalContext().getRequestParameterMap();
		String paramId = (String) params.get("codInc");
		incidencia = incidenciaService.detalle(new Integer(paramId));

		return "actualizar";
	}
	
	public String actualizar() {
		incidencia.setFecSol(new Date());
		incidenciaService.registar(incidencia);
		listIncidencia = new ArrayList<Incidencia>();
		incidencia = new Incidencia();
		return "home";
	}

	// --------------------------------------------------------------------------

	public void setEstadoService(EstadoService estadoService) {
		this.estadoService = estadoService;
	}

	public void setTipoUsuarioService(TipoUsuarioService tipoUsuarioService) {
		this.tipoUsuarioService = tipoUsuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public void setCategoriaService(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	public List<Categoria> getListcategoria() {
		listcategoria = Lists.newArrayList(categoriaService.getListCategoria());
		return listcategoria;
	}

	public void setListcategoria(List<Categoria> listcategoria) {
		this.listcategoria = listcategoria;
	}

	public List<Estado> getListEstados() {
		listEstados = Lists.newArrayList(estadoService.getListEstado());
		return listEstados;
	}

	public void setListEstados(List<Estado> listEstados) {
		this.listEstados = listEstados;
	}

	public List<Usuario> getListUsuarios() {
		listUsuarios = Lists.newArrayList(usuarioService.getListUsuario());
		return listUsuarios;
	}

	public void setListUsuarios(List<Usuario> listUsuarios) {
		this.listUsuarios = listUsuarios;
	}

	public Incidencia getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(Incidencia incidencia) {
		this.incidencia = incidencia;
	}

	public void setIncidenciaService(IncidenciaService incidenciaService) {
		this.incidenciaService = incidenciaService;
	}

	public List<Incidencia> getListIncidencia() {
		listIncidencia = Lists.newArrayList(incidenciaService
				.getListIncidencia());
		return listIncidencia;
	}

	public void setListIncidencia(List<Incidencia> listIncidencia) {
		this.listIncidencia = listIncidencia;
	}

}
