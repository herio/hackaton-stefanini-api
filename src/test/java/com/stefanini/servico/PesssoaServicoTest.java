package com.stefanini.servico;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import com.stefanini.dao.PessoaDao;
import com.stefanini.model.Pessoa;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;

public class PesssoaServicoTest {
	@Injectable
	EntityManager em;
	@Tested
	PessoaServico pessoaServico;
	@Injectable
	@Mocked
	PessoaDao pessoaDao;
	@Injectable
	PessoaPerfilServico pessoaPerfilServico;

	@Test
	public void atualizarCaminhoImagemPessoaTest() {
		// mock das chamadas externas (pessoaDao.encontrar() e pessoaDao.atualizar()) feitas em pessoaServico.atualizarCaminhoImagemPessoa()
		Pessoa pessoa = new Pessoa();
		Pessoa pessoaAtualizada = new Pessoa();
		String caminhoImagem = "caminhoImagem";
		pessoaAtualizada.setImagem(caminhoImagem);
		Optional<Pessoa> pessoaOpt = Optional.of(pessoa);
		new Expectations() {
			{
				pessoaDao.encontrar(1L);
				result = pessoaOpt;
			}
		};
		new Expectations() {
			{
				pessoaDao.atualizar(pessoa);
				result = pessoaAtualizada;
			}
		};

		// faz a chamada ao método a ser testado
		Pessoa pessoaRetornada = pessoaServico.atualizarCaminhoImagemPessoa(1L, caminhoImagem);

		// verifica o resultado da chamada
		Assert.assertEquals(pessoaRetornada.getImagem(), pessoaAtualizada.getImagem());
	}
}
