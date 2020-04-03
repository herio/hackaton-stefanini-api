package com.stefanini.servico;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.stefanini.dao.PessoaDao;
import com.stefanini.model.Pessoa;

@RunWith(MockitoJUnitRunner.class)
public class EnderecoServicoTest {
	@InjectMocks
	private PessoaServico pessoaServico;

	@Mock
	private PessoaDao pessoaDao;

	@Before
	public void setUp() throws Exception {
		pessoaServico = new PessoaServico();
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void atualizarCaminhoImagemPessoaTest() {
		// mock das chamadas externas (pessoaDao.encontrar() e pessoaDao.atualizar()) feitas em pessoaServico.atualizarCaminhoImagemPessoa()
		Pessoa pessoa = new Pessoa();
		Pessoa pessoaAtualizada = new Pessoa();
		String caminhoImagem = "caminhoImagem";
		pessoaAtualizada.setImagem(caminhoImagem);
		Optional<Pessoa> pessoaOpt = Optional.of(pessoa);
		when(pessoaDao.encontrar(1L)).thenReturn(pessoaOpt);
		when(pessoaDao.atualizar(pessoa)).thenReturn(pessoaAtualizada);

		// faz a chamada ao método a ser testado
		Pessoa pessoaRetornada = pessoaServico.atualizarCaminhoImagemPessoa(1L, caminhoImagem);

		// verifica o resultado da chamada
		Assert.assertEquals(pessoaRetornada.getImagem(), pessoaAtualizada.getImagem());
	}
}
