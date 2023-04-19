package pw2.roberto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class Teste {

	@GET
	@Path("config-property")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {

		@ConfigProperty(name = "Ifrs.pw2", defaultValue = "Valor default")
		String mensagem;

		User usuario = new User();

		usuario.setName("Fulano");

		return usuario.getName() + " " + usuario.getMessage();
	}
}