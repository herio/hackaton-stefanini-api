package com.stefanini.exception;

import org.junit.Assert;
import org.junit.Test;

public class NegocioExceptionTest {

	@Test
	public void teste() {
		NegocioException exc = new NegocioException("mensagem");
		Assert.assertEquals(exc.getMensagem(), "mensagem");
	}
}
