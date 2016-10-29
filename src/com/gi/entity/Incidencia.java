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
	private Categoria categoria;

	@ManyToOne
	@JoinColumn(name = "COD_EST")
	private Estado estado;

	@ManyToOne
	@JoinColumn(name = "COD_USU")
	private Usuario usuario;

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
		Date date = null;
		if (fecReg != null) {
			date = new Date(fecReg.getTime());
		}
		return date;
	}

	public void setFecReg(Date fecReg) {
		if (fecReg != null) {
			this.fecReg = new Date(fecReg.getTime());
		} else {
			this.fecReg = null;
		}
	}

	public Date getFecSol() {
		Date date = null;
		if (fecSol != null) {
			date = new Date(fecSol.getTime());
		}
		return date;
	}

	public void setFecSol(Date fecSol) {
		if (fecSol != null) {
			this.fecSol = new Date(fecSol.getTime());
		} else {
			this.fecSol = null;
		}
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Incidencia [codInc=" + codInc + ", codArea=" + codArea
				+ ", codPri=" + codPri + ", codTec=" + codTec + ", desInc="
				+ desInc + ", tituInc=" + tituInc + ", fecReg=" + fecReg
				+ ", fecSol=" + fecSol + ", resInc=" + resInc + ", rutaDoc="
				+ rutaDoc + ", categoria=" + categoria + ", estado=" + estado
				+ ", usuario=" + usuario + "]";
	}
	
	
	

}