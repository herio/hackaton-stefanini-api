package com.stefanini.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

	@Test
	public void teste() {
		LocalDate dataNascimento = LocalDate.now();
		String email = "email";
		Set<Endereco> enderecos = new HashSet<>();
		Long id = 1L;
		String caminhoImagem = "caminhoImagem";
		String nome = "nome";
		Set<Perfil> perfils = new HashSet<>();
		Boolean situacao = true;
		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento(dataNascimento);
		pessoa.setEmail(email);
		pessoa.setEnderecos(enderecos);
		pessoa.setId(id);
		pessoa.setImagem(caminhoImagem);
		pessoa.setNome(nome);
		pessoa.setPerfils(perfils);
		pessoa.setSituacao(situacao);

		Assert.assertEquals(pessoa.getDataNascimento(), dataNascimento);
		Assert.assertEquals(pessoa.getEmail(), email);
		Assert.assertEquals(pessoa.getEnderecos(), enderecos);
		Assert.assertEquals(pessoa.getId(), id);
		Assert.assertEquals(pessoa.getImagem(), caminhoImagem);
		Assert.assertEquals(pessoa.getNome(), nome);
		Assert.assertEquals(pessoa.getPerfils(), perfils);
		Assert.assertEquals(pessoa.getSituacao(), situacao);
	}
}
