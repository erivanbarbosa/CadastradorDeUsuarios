package modelo;

import java.util.Date;

public class Usuario extends Entidade {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Date dataNascimento;
	private EnumSexo sexo;
	private EnumFormacao formacao;
	private EnumProfissao profissao;
	private String cpf;
	
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EnumSexo getSexo() {
		return sexo;
	}

	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}

	public EnumFormacao getFormacao() {
		return formacao;
	}

	public void setFormacao(EnumFormacao formacao) {
		this.formacao = formacao;
	}

	public EnumProfissao getProfissao() {
		return profissao;
	}

	public void setProfissao(EnumProfissao profissao) {
		this.profissao = profissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
