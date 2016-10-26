package com.gi.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_categoria database table.
 * 
 */
@Entity
@Table(name="tb_categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COD_CAT")
	private int codCat;

	@Column(name="DES_CAT")
	private String desCat;

	//bi-directional many-to-one association to TbIncidencia
	@OneToMany(mappedBy="tbCategoria")
	private List<Incidencia> tbIncidencias;

	public Categoria() {
	}

	public int getCodCat() {
		return this.codCat;
	}

	public void setCodCat(int codCat) {
		this.codCat = codCat;
	}

	public String getDesCat() {
		return this.desCat;
	}

	public void setDesCat(String desCat) {
		this.desCat = desCat;
	}

	public List<Incidencia> getTbIncidencias() {
		return this.tbIncidencias;
	}

	public void setTbIncidencias(List<Incidencia> tbIncidencias) {
		this.tbIncidencias = tbIncidencias;
	}

	public Incidencia addTbIncidencia(Incidencia tbIncidencia) {
		getTbIncidencias().add(tbIncidencia);
		tbIncidencia.setTbCategoria(this);

		return tbIncidencia;
	}

	public Incidencia removeTbIncidencia(Incidencia tbIncidencia) {
		getTbIncidencias().remove(tbIncidencia);
		tbIncidencia.setTbCategoria(null);

		return tbIncidencia;
	}

}