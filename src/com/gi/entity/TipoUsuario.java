package com.gi.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

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

	// bi-directional many-to-one association to TbUsuario
	@OneToMany(mappedBy = "tbTipoUsuario")
	private List<Usuario> tbUsuarios;

	public TipoUsuario() {
	}

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

	public List<Usuario> getTbUsuarios() {
		return this.tbUsuarios;
	}

	public void setTbUsuarios(List<Usuario> tbUsuarios) {
		this.tbUsuarios = tbUsuarios;
	}

	public Usuario addTbUsuario(Usuario tbUsuario) {
		getTbUsuarios().add(tbUsuario);
		tbUsuario.setTbTipoUsuario(this);

		return tbUsuario;
	}

	public Usuario removeTbUsuario(Usuario tbUsuario) {
		getTbUsuarios().remove(tbUsuario);
		tbUsuario.setTbTipoUsuario(null);

		return tbUsuario;
	}

}