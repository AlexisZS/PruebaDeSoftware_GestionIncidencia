package com.gi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the tb_usuarios database table.
 * 
 */
@Entity
@Table(name = "tb_usuarios")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_USU")
	private Integer codUsu;

	@Column(name = "APE_USU")
	private String apeUsu;

	@Column(name = "CON_TOT")
	private String conTot;

	@Column(name = "NOM_USU")
	private String nomUsu;

	@Column(name = "PWD_USU")
	private String pwdUsu;

	@Column(name = "USU_USU")
	private String usuUsu;

	@ManyToOne
	@JoinColumn(name = "COD_TIP")
	private TipoUsuario tbTipoUsuario;

	public Integer getCodUsu() {
		return this.codUsu;
	}

	public void setCodUsu(Integer codUsu) {
		this.codUsu = codUsu;
	}

	public String getApeUsu() {
		return this.apeUsu;
	}

	public void setApeUsu(String apeUsu) {
		this.apeUsu = apeUsu;
	}

	public String getConTot() {
		return this.conTot;
	}

	public void setConTot(String conTot) {
		this.conTot = conTot;
	}

	public String getNomUsu() {
		return this.nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	public String getPwdUsu() {
		return this.pwdUsu;
	}

	public void setPwdUsu(String pwdUsu) {
		this.pwdUsu = pwdUsu;
	}

	public String getUsuUsu() {
		return this.usuUsu;
	}

	public void setUsuUsu(String usuUsu) {
		this.usuUsu = usuUsu;
	}

	public TipoUsuario getTbTipoUsuario() {
		return this.tbTipoUsuario;
	}

	public void setTbTipoUsuario(TipoUsuario tbTipoUsuario) {
		this.tbTipoUsuario = tbTipoUsuario;
	}

}