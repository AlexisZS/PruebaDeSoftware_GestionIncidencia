package com.gi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}