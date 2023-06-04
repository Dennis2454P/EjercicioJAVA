package pe.edu.certus.servicio;


import java.util.ArrayList;
import java.util.List;



import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/items")
public class CodeMapping{
	
	
	  List<Items> itemArray = new ArrayList<Items>();
	  
	  public CodeMapping() {
	    itemArray.add(new Items("item1", 1));
	    itemArray.add(new Items("item2", 2));
	    itemArray.add(new Items("item3", 3));
	  }
	 
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<Items> getItems() {
	    return itemArray;
	  }
	
	
	
  /*List<Items> itemArray=new ArrayList<Items>();
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<Items> getItems(){
	  itemArray.add(new Items("item1",1));
	  itemArray.add(new Items("item1",2));
	  itemArray.add(new Items("item1",3));
	return itemArray;	  
  }*/
  @GET
  @Path("/{id}")  
  @Produces({MediaType.APPLICATION_JSON})
  public Items getItemById(@PathParam("id") int id) {
	  for(Items item: itemArray) {
		  if(item.getId()==id) {
			  return item;
		  }
	  }return null;
  }
  

}

