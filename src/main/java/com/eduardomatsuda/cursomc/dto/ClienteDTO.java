package com.eduardomatsuda.cursomc.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.eduardomatsuda.cursomc.domain.Cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class ClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "É obrigatório o preenchimento do campo nome")
	@Length(min=5, max=120, message="O tamanho deve ter entre 5 e 120 caracteres")
	private String nome;
	
	@NotEmpty(message = "É obrigatório o preenchimento do campo email")
	@Email(message = "E-mail inválido")
	private String email;
	
	public ClienteDTO() {
	}
	
	public ClienteDTO(Cliente obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setMome(String mome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
