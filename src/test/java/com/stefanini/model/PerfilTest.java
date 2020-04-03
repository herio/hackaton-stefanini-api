package com.stefanini.model;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

public class PerfilTest {

	@Test
	public void teste() {
		LocalDateTime dataHoraAlteracao = LocalDateTime.now();
		LocalDateTime dataHoraInclusao = LocalDateTime.now();
		String descricao = "descricao";
		Long id = 1L;
		String nome = "nome";
		Perfil perfil = new Perfil();
		perfil.setDataHoraAlteracao(dataHoraAlteracao);
		perfil.setDataHoraInclusao(dataHoraInclusao);
		perfil.setDescricao(descricao);
		perfil.setId(id);
		perfil.setNome(nome);

		Assert.assertEquals(perfil.getDataHoraAlteracao(), dataHoraAlteracao);
		Assert.assertEquals(perfil.getDataHoraInclusao(), dataHoraInclusao);
		Assert.assertEquals(perfil.getDescricao(), descricao);
		Assert.assertEquals(perfil.getId(), id);
		Assert.assertEquals(perfil.getNome(), nome);
	}
}
