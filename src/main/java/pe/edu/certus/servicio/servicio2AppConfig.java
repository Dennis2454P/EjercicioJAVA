package pe.edu.certus.servicio;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class servicio2AppConfig extends ResourceConfig {
	public servicio2AppConfig() {
		packages("pe.edu.certus.recurso");
		
	}

}
