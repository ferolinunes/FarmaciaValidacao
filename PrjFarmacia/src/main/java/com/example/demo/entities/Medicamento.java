package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table
public class Medicamento {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)	
	private Long id;
	
	@NotNull
	@Size(min=5, message="Mínimo de 5 caracteres")
	private String nome;
	
	/*@NotNull
	@Size(min=30, message="Mínimo de 30 caracteres")*/
	private String bula;
	
	/*@NotNull
	@Size(max=5, message="Máximo de 5 caracteres")*/
	private int idFornecedor; 
	
	/*@NotNull
	@Size(max=12, message="Máximo de 8 caracteres")*/
	private String dataValidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
	
	
}
