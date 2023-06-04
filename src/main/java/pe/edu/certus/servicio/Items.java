package pe.edu.certus.servicio;

public class Items {

	String Items;
	int id;
	public Items(String items, int id) {
		
		this.Items = items;
		this.id = id;
	}
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	
}
