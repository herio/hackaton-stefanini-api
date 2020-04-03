package com.stefanini.model;

import org.junit.Assert;
import org.junit.Test;

public class EnderecoTest {

	@Test
	public void teste() {
		String bairro = "bairro";
		String cep = "cep";
		String complemento = "complemento";
		Long id = 1L;
		Long idPessoa = 1L;
		String localidade = "localidade";
		String logradouro = "logradouro";
		String uf = "uf";
		Endereco endereco = new Endereco();
		endereco.setBairro(bairro);
		endereco.setCep(cep);
		endereco.setComplemento(complemento);
		endereco.setId(id);
		endereco.setIdPessoa(idPessoa);
		endereco.setLocalidade(localidade);
		endereco.setLogradouro(logradouro);
		endereco.setUf(uf);

		Assert.assertEquals(endereco.getBairro(), bairro);
		Assert.assertEquals(endereco.getCep(), cep);
		Assert.assertEquals(endereco.getComplemento(), complemento);
		Assert.assertEquals(endereco.getId(), id);
		Assert.assertEquals(endereco.getIdPessoa(), idPessoa);
		Assert.assertEquals(endereco.getLocalidade(), localidade);
		Assert.assertEquals(endereco.getLogradouro(), logradouro);
		Assert.assertEquals(endereco.getUf(), uf);
	}
}
