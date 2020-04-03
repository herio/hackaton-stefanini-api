package com.stefanini.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.stefanini.model.Endereco;
import com.stefanini.model.Perfil;

public class PessoaDtoTest {

	@Test
	public void teste() {
		LocalDate dataNascimento = LocalDate.now();
		String email = "email";
		Set<Endereco> enderecos = new HashSet<>();
		Long id = 1L;
		String nome = "nome";
		Set<Perfil> perfils = new HashSet<>();
		Boolean situacao = true;

		PessoaDto dto = new PessoaDto();
		dto.setDataNascimento(dataNascimento);
		dto.setEmail(email);
		dto.setEnderecos(enderecos);
		dto.setId(id);
		dto.setNome(nome);
		dto.setPerfils(perfils);
		dto.setSituacao(situacao);

		Assert.assertEquals(dto.getDataNascimento(), dataNascimento);
		Assert.assertEquals(dto.getEmail(), email);
		Assert.assertEquals(dto.getEnderecos(), enderecos);
		Assert.assertEquals(dto.getId(), id);
		Assert.assertEquals(dto.getNome(), nome);
		Assert.assertEquals(dto.getPerfils(), perfils);
		Assert.assertEquals(dto.getSituacao(), situacao);
	}
}
