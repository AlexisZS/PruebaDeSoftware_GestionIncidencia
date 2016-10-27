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

	@Column(name = "COD_AREA")
	private int codArea;

	@Column(name = "COD_PRI")
	private int codPri;

	@Column(name = "COD_TEC")
	private int codTec;
	
	@Column(name = "DES_INC")
	private String desInc;
	
	@Column(name = "TITU_INC")
	private String tituInc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FEC_REG")
	private Date fecReg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FEC_SOL")
	private Date fecSol;

	@Column(name = "RES_INC")
	private String resInc;

	@Column(name = "RUTA_DOC")
	private String rutaDoc;

	@ManyToOne
	@JoinColumn(name = "COD_CAT")
	private Categoria tbCategoria;

	@ManyToOne
	@JoinColumn(name = "COD_EST")
	private Estado tbEstado;

	@ManyToOne
	@JoinColumn(name = "COD_USU")
	private Usuario tbUsuario;

	public Incidencia() {
	}

	public Integer getCodInc() {
		return this.codInc;
	}

	public void setCodInc(Integer codInc) {
		this.codInc = codInc;
	}

	public int getCodArea() {
		return this.codArea;
	}

	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}

	public int getCodPri() {
		return this.codPri;
	}

	public void setCodPri(int codPri) {
		this.codPri = codPri;
	}

	public int getCodTec() {
		return this.codTec;
	}

	public void setCodTec(int codTec) {
		this.codTec = codTec;
	}

	public String getTituInc() {
		return tituInc;
	}

	public void setTituInc(String tituInc) {
		this.tituInc = tituInc;
	}
	
	public String getDesInc() {
		return this.desInc;
	}

	public void setDesInc(String desInc) {
		this.desInc = desInc;
	}

	public Date getFecReg() {
		return this.fecReg;
	}

	public void setFecReg(Date fecReg) {
		this.fecReg = fecReg;
	}

	public Date getFecSol() {
		return this.fecSol;
	}

	public void setFecSol(Date fecSol) {
		this.fecSol = fecSol;
	}

	public String getResInc() {
		return this.resInc;
	}

	public void setResInc(String resInc) {
		this.resInc = resInc;
	}

	public String getRutaDoc() {
		return this.rutaDoc;
	}

	public void setRutaDoc(String rutaDoc) {
		this.rutaDoc = rutaDoc;
	}

	public Categoria getTbCategoria() {
		return this.tbCategoria;
	}

	public void setTbCategoria(Categoria tbCategoria) {
		this.tbCategoria = tbCategoria;
	}

	public Estado getTbEstado() {
		return this.tbEstado;
	}

	public void setTbEstado(Estado tbEstado) {
		this.tbEstado = tbEstado;
	}

	public Usuario getTbUsuario() {
		return this.tbUsuario;
	}

	public void setTbUsuario(Usuario tbUsuario) {
		this.tbUsuario = tbUsuario;
	}

	@Override
	public String toString() {
		return "Incidencia [codInc=" + codInc + ", codArea=" + codArea
				+ ", codPri=" + codPri + ", codTec=" + codTec + ", desInc="
				+ desInc + ", resInc=" + resInc + ", rutaDoc=" + rutaDoc
				+ ", tbCategoria=" + tbCategoria + ", tbEstado=" + tbEstado
				+ ", tbUsuario=" + tbUsuario + "]";
	}

}