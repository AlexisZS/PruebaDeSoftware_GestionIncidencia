package com.gi.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the tb_estado database table.
 * 
 */
@Entity
@Table(name = "tb_estado")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_EST")
	private Integer codEst;

	@Column(name = "DES_EST")
	private String desEst;

	// bi-directional many-to-one association to TbIncidencia
	@OneToMany(mappedBy = "tbEstado")
	private List<Incidencia> tbIncidencias;

	public Estado() {
	}

	public Integer getCodEst() {
		return this.codEst;
	}

	public void setCodEst(Integer codEst) {
		this.codEst = codEst;
	}

	public String getDesEst() {
		return this.desEst;
	}

	public void setDesEst(String desEst) {
		this.desEst = desEst;
	}

	public List<Incidencia> getTbIncidencias() {
		return this.tbIncidencias;
	}

	public void setTbIncidencias(List<Incidencia> tbIncidencias) {
		this.tbIncidencias = tbIncidencias;
	}

	public Incidencia addTbIncidencia(Incidencia tbIncidencia) {
		getTbIncidencias().add(tbIncidencia);
		tbIncidencia.setTbEstado(this);

		return tbIncidencia;
	}

	public Incidencia removeTbIncidencia(Incidencia tbIncidencia) {
		getTbIncidencias().remove(tbIncidencia);
		tbIncidencia.setTbEstado(null);

		return tbIncidencia;
	}

}