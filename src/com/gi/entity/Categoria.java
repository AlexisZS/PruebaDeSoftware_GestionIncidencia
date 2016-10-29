package com.gi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tb_categoria database table.
 * 
 */
@Entity
@Table(name = "tb_categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_CAT")
	private Integer codCat;

	@Column(name = "DES_CAT")
	private String desCat;

	public Integer getCodCat() {
		return this.codCat;
	}

	public void setCodCat(Integer codCat) {
		this.codCat = codCat;
	}

	public String getDesCat() {
		return this.desCat;
	}

	public void setDesCat(String desCat) {
		this.desCat = desCat;
	}

}