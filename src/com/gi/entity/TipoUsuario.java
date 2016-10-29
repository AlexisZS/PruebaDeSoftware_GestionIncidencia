package com.gi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tb_tipo_usuario database table.
 * 
 */
@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_TIP_USU")
	private Integer codTipUsu;

	@Column(name = "DES_TIPO_USU")
	private String desTipoUsu;

	public Integer getCodTipUsu() {
		return this.codTipUsu;
	}

	public void setCodTipUsu(Integer codTipUsu) {
		this.codTipUsu = codTipUsu;
	}

	public String getDesTipoUsu() {
		return this.desTipoUsu;
	}

	public void setDesTipoUsu(String desTipoUsu) {
		this.desTipoUsu = desTipoUsu;
	}

}