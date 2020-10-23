package Ejerc10;

public class Administrador extends Empleado{

	private String puesto;
	
	public Administrador(String nombre, String domicilio, String horario,String jefe) {
		super(nombre, domicilio, horario,jefe);
	}
	
	public void setPuesto(String puest) {
		puesto=puest;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void administrar() {
		System.out.println("A TRABAJAR HIJOS DE PUTA");
	}
	
}
