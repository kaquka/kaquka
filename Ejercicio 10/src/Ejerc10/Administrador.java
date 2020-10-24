package Ejerc10;

public class Administrador extends Empleado{

	private String puesto;
	
	public Administrador(String nombre, String domicilio, String horario,String jefe) {
		super(nombre, domicilio, horario,jefe);
	}
	
	public Administrador(String nombre, String domicilio,String horario) {
		super(nombre, domicilio,horario);
	}
	
	public void setPuesto(String puest) {
		puesto=puest;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void administrar() {
		System.out.println("Estoy administrando, a trabajar");
	}
	
	public String toString() {
		return "Soy "+getNombre()+" y mi puesto es: "+puesto;
	}
	
}
