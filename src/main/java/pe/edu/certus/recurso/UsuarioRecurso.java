package pe.edu.certus.recurso;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.springframework.http.MediaType;
@Path("/usuarios")
public class UsuarioRecurso {
  List<Usuario> usuarios=new ArrayList<Usuario>();
  List<String> puestos = new ArrayList<>();
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<Usuario> getUsuarios(){
	  usuarios.add(new Usuario("luis","perez",19,500,""));
	  usuarios.add(new Usuario("jose","perez",16,500,""));
	  usuarios.add(new Usuario("atahualpa","rojas",22,500,""));
	return usuarios;
	
	  
  }
  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  public List<Usuario> guardarUsuario(Usuario usuario){
	  usuarios.add(new Usuario("condor","kanki",82,500,""));
	  usuarios.add(usuario);
	  return usuarios;
  }
  @GET
  @Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  
  
  public List<Usuario> getPuestosDeTrabajo() {   
    puestos.add("Dependiente");
    puestos.add("Independiente");
    puestos.add("Depenediente");
    return usuarios;
  }
}
