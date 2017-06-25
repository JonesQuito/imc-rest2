package br.com.apirest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import br.com.apirest.modelo.Imc;

@Path("/services")
public class ServicesRest {

	@GET
	@Path("/getimc")
	@Produces("application/json")
	public Imc getImcObject(@QueryParam("peso") double peso, @QueryParam("altura") double altura,
			@QueryParam("sexo") String sexo) {
		Imc imc = new Imc(peso, altura, sexo);
		return imc;
	}

	@GET
	@Path("/imc")
	@Produces("application/text")
	public String getTexto() {

		return "Retornando um texto qualquer!!";
	}

}
