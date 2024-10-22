package com.data.first;
// Generated 20 de out. de 2024 15:41:43 by Hibernate Tools 6.5.1.Final

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Venda generated by hbm2java
 */
public class Venda implements java.io.Serializable {

	private long id;
	private Endereco endereco;
	private Comprador comprador;
	private Timestamp dataHoraVenda;
	private String statusEntrega;
	private Float valorVenda;
	private Set avaliacaos = new HashSet(0);

	public Venda() {
	}

	public Venda(long id, Endereco endereco, Comprador comprador) {
		this.id = id;
		this.endereco = endereco;
		this.comprador = comprador;
	}

	public Venda(long id, Endereco endereco, Comprador comprador, Timestamp dataHoraVenda, String statusEntrega,
			Float valorVenda, Set avaliacaos) {
		this.id = id;
		this.endereco = endereco;
		this.comprador = comprador;
		this.dataHoraVenda = dataHoraVenda;
		this.statusEntrega = statusEntrega;
		this.valorVenda = valorVenda;
		this.avaliacaos = avaliacaos;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Comprador getComprador() {
		return this.comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Timestamp getDataHoraVenda() {
		return this.dataHoraVenda;
	}

	public void setDataHoraVenda(Timestamp dataHoraVenda) {
		this.dataHoraVenda = dataHoraVenda;
	}

	public String getStatusEntrega() {
		return this.statusEntrega;
	}

	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}

	public Float getValorVenda() {
		return this.valorVenda;
	}

	public void setValorVenda(Float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Set getAvaliacaos() {
		return this.avaliacaos;
	}

	public void setAvaliacaos(Set avaliacaos) {
		this.avaliacaos = avaliacaos;
	}

}
