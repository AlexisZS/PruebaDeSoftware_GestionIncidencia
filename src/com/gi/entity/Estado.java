package com.gi.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_estado database table.
 * 
 */
@Entity
@Table(name="tb_estado")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COD_EST")
	private int codEst;

	@Column(name="DES_EST")
	private String desEst;

	public Estado() {
	}

	public int getCodEst() {
		return this.codEst;
	}

	public void setCodEst(int codEst) {
		this.codEst = codEst;
	}

	public String getDesEst() {
		return this.desEst;
	}

	public void setDesEst(String desEst) {
		this.desEst = desEst;
	}

}