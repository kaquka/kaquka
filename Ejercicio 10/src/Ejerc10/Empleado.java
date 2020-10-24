package Ejerc10;

public class Empleado extends Persona {

	private String jefe;
	
	public Empleado(String nombre, String domicilio, String horario) {
		super(nombre, domicilio, horario);	
	}
	
	public Empleado(String nombre, String domicilio, String horario,String jefe) {
		super(nombre, domicilio, horario);	
		this.jefe=jefe;
	}
	
	public Empleado(String nombre, String horario) {
		super(nombre, horario);	
	}
	
	public void setJefe(String jef) {
		jefe=jef;
	}
	
	public String getJefe() {
		return jefe;
	}
	
	public void cobrar() {
		System.out.println(getJefe()+" vengo por mi cheque");
	}

	
	
}