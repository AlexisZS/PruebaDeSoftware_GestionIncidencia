package com.gi.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the tb_incidencia database table.
 * 
 */
@Entity
@Table(name = "tb_incidencia")
public class Incidencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_INC")
	private Integer codInc;

	@Column(name = "CATEGORIA")
	private String categoria;

	@Column(name = "RES_INC")
	private String resInc;

	@Column(name = "ESTADO")
	private String estado;

	@Column(name = "AREA")
	private String area;

	@Column(name = "PRIORIDAD")
	private String prioridad;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FEC_REG")
	private Date fecReg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FEC_SOL")
	private Date fecSol;

	@Column(name = "TITU_INC")
	private String tituInc;

	@Column(name = "DES_INC")
	private String desInc;

	@Column(name = "RUTA_DOC")
	private String rutaDoc;

	@Column(name = "USUARIO")
	private String usuario;

	@Column(name = "TECNICO")
	private String tecnico;

	public Integer getCodInc() {
		return codInc;
	}

	public void setCodInc(Integer codInc) {
		this.codInc = codInc;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getResInc() {
		return resInc;
	}

	public void setResInc(String resInc) {
		this.resInc = resInc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getTituInc() {
		return tituInc;
	}

	public void setTituInc(String tituInc) {
		this.tituInc = tituInc;
	}

	public String getDesInc() {
		return desInc;
	}

	public void setDesInc(String desInc) {
		this.desInc = desInc;
	}

	public String getRutaDoc() {
		return rutaDoc;
	}

	public void setRutaDoc(String rutaDoc) {
		this.rutaDoc = rutaDoc;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public Date getFecReg() {
		Date date = null;
		if (fecReg != null) {
			date = new Date(fecReg.getTime());
		}
		return date;
	}

	public void setFecReg(Date fecReg) {
		if (fecReg != null) {
			this.fecReg = new Date(fecReg.getTime());
		} else {
			this.fecReg = null;
		}
	}

	public Date getFecSol() {
		Date date = null;
		if (fecSol != null) {
			date = new Date(fecSol.getTime());
		}
		return date;
	}

	public void setFecSol(Date fecSol) {
		if (fecSol != null) {
			this.fecSol = new Date(fecSol.getTime());
		} else {
			this.fecSol = null;
		}
	}

}