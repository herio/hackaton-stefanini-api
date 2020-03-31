package com.stefanini;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.stefanini.resource.CepResource;
import com.stefanini.resource.EnderecoResource;
import com.stefanini.resource.PerfilResource;
import com.stefanini.resource.PessoaResource;

@ApplicationPath("app")
public class ConfigApplication extends Application {
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(CepResource.class);
		s.add(EnderecoResource.class);
		s.add(PerfilResource.class);
		s.add(PessoaResource.class);
		return s;
	}
}