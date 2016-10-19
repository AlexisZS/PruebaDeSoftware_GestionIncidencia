package com.gi.entity;

import java.io.Serializable;
import javax.persistence.*;


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

}