package br.edu.infnet.estabelecimentoapptalesb.model.domain;

public class EstabelecimentoDTO {
	private Integer id;
	private String login;
	private String senha;
	private String cnpj;
	private String nome;
	private String endereco;
	private boolean edtech;
	private Integer qtdFuncionarios;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isEdtech() {
		return edtech;
	}
	public void setEdtech(boolean edtech) {
		this.edtech = edtech;
	}
	public Integer getQtdFuncionarios() {
		return qtdFuncionarios;
	}
	public void setQtdFuncionarios(Integer qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
