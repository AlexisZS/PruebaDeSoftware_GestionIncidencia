package com.gi.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_incidencia database table.
 * 
 */
@Entity
@Table(name="tb_incidencia")
public class Incidencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COD_INC")
	private int codInc;

	@Column(name="COD_AREA")
	private int codArea;

	@Column(name="COD_CAT")
	private int codCat;

	@Column(name="COD_EST")
	private int codEst;

	@Column(name="COD_PRI")
	private int codPri;

	@Column(name="COD_TEC")
	private int codTec;

	@Column(name="COD_USU")
	private int codUsu;

	@Column(name="DES_INC")
	private String desInc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REG")
	private Date fecReg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SOL")
	private Date fecSol;

	@Column(name="RES_INC")
	private String resInc;

	@Column(name="RUTA_DOC")
	private String rutaDoc;

	public Incidencia() {
	}

	public int getCodInc() {
		return this.codInc;
	}

	public void setCodInc(int codInc) {
		this.codInc = codInc;
	}

	public int getCodArea() {
		return this.codArea;
	}

	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}

	public int getCodCat() {
		return this.codCat;
	}

	public void setCodCat(int codCat) {
		this.codCat = codCat;
	}

	public int getCodEst() {
		return this.codEst;
	}

	public void setCodEst(int codEst) {
		this.codEst = codEst;
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

	public int getCodUsu() {
		return this.codUsu;
	}

	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
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

}