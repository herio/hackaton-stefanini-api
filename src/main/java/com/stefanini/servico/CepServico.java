package com.stefanini.servico;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.validation.constraints.NotNull;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.stefanini.dto.CepEnderecoDto;

/**
 * 
 * Classe de servico, as regras de negocio devem estar nessa classe
 *
 * @author
 * 
 */
@Stateless
public class CepServico implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CepEnderecoDto getEnderecoPorCep(@NotNull String cep) {
		String cepSemMascara = cep.replaceAll("\\D+", "");
		WebTarget target = ClientBuilder.newClient().target(String.format("https://viacep.com.br/ws/%s/json/", cepSemMascara));
		return target.request().get(CepEnderecoDto.class);
	}
}
