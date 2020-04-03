package com.stefanini.dto;

import org.junit.Assert;
import org.junit.Test;

public class CepEnderecoDtoTest {

	@Test
	public void teste() {
		CepEnderecoDto dto = new CepEnderecoDto();
		dto.setBairro("bairro");
		dto.setCep("cep");
		dto.setComplemento("complemento");
		dto.setErro("erro");
		dto.setGia("gia");
		dto.setIbge("ibge");
		dto.setLocalidade("localidade");
		dto.setLogradouro("logradouro");
		dto.setUf("uf");
		dto.setUnidade("unidade");

		Assert.assertEquals(dto.getBairro(), "bairro");
		Assert.assertEquals(dto.getCep(), "cep");
		Assert.assertEquals(dto.getComplemento(), "complemento");
		Assert.assertEquals(dto.getErro(), "erro");
		Assert.assertEquals(dto.getGia(), "gia");
		Assert.assertEquals(dto.getIbge(), "ibge");
		Assert.assertEquals(dto.getLocalidade(), "localidade");
		Assert.assertEquals(dto.getLogradouro(), "logradouro");
		Assert.assertEquals(dto.getUf(), "uf");
		Assert.assertEquals(dto.getUnidade(), "unidade");
	}
}
