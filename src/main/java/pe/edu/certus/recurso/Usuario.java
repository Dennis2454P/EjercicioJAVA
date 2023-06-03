package pe.edu.certus.recurso;

public class Usuario {
	String nombre;
	String apellido;
	int edad;
	int salario;
	String puesto;
	Usuario(String nombre,String apellido,int edad, int salario,String puesto){
			this.apellido = apellido;
			this.edad=edad;
			this.nombre=nombre;
			this.salario=salario;
			this.puesto=puesto;
			
	
	}
	
	
	
	
	
	public String getPuesto() {
		return puesto;
	}





	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}





	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}





	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	//setters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	
}
