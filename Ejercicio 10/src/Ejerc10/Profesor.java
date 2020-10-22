package Ejerc10;

public class Profesor extends Empleado {

	private String carrera;
	
	public Profesor(String nombre, String domicilio, String horario) {
		super(nombre, domicilio, horario);
	}
	
	public Profesor(String nombre, String domicilio, String horario, String carrera) {
		super(nombre, domicilio, horario);
		this.carrera=carrera;
	}
	
	public void setCarrera(String carr) {
		carrera=carr;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public void enseñar() {
		System.out.println("Leo diapositivas");
	}
	
}
