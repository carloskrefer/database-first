package com.data.first;
// Generated 20 de out. de 2024 15:41:43 by Hibernate Tools 6.5.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Comprador generated by hbm2java
 */
public class Comprador implements java.io.Serializable {

	private long id;
	private String name;
	private Set vendas = new HashSet(0);
	private Set enderecoCompradors = new HashSet(0);

	public Comprador() {
	}

	public Comprador(long id) {
		this.id = id;
	}

	public Comprador(long id, String name, Set vendas, Set enderecoCompradors) {
		this.id = id;
		this.name = name;
		this.vendas = vendas;
		this.enderecoCompradors = enderecoCompradors;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getVendas() {
		return this.vendas;
	}

	public void setVendas(Set vendas) {
		this.vendas = vendas;
	}

	public Set getEnderecoCompradors() {
		return this.enderecoCompradors;
	}

	public void setEnderecoCompradors(Set enderecoCompradors) {
		this.enderecoCompradors = enderecoCompradors;
	}

}
