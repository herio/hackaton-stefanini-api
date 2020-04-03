package com.stefanini.dto;

import org.junit.Assert;
import org.junit.Test;

public class ErroDtoTest {

	@Test
	public void teste() {
		ErroDto dto = new ErroDto("campo", "mensagem", "valor");

		Assert.assertEquals(dto.getCampo(), "campo");
		Assert.assertEquals(dto.getMensagem(), "mensagem");
		Assert.assertEquals(dto.getValor(), "valor");
	}
}
