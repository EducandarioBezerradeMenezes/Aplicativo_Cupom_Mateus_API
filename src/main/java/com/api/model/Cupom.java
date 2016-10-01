package com.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cupom {
	@Id
	private String coo;
	
	private Date data;
	private String cnpj;
	private double valor;
	
	public Cupom(){}

	public Cupom(String coo, Date data, String cnpj, double valor) {
		super();
		this.coo = coo;
		this.cnpj = cnpj;
		this.data = data;
		this.valor = valor;
	}

	public String getCoo() {
		return coo;
	}
	public void setCoo(String coo) {
		this.coo = coo;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Cupom [coo=" + coo + ", data=" + data + ", cnpj=" + cnpj + ", valor=" + valor + "]";
	}
}
