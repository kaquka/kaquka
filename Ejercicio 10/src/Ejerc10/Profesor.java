package Ejerc10;
//agregar ID ;;; agregar info;;;atributo grupo
public class Profesor extends Empleado {

	private String carrera,ID;
	
	public Profesor(String nombre, String domicilio, String horario) {
		super(nombre, domicilio, horario);
	}
	
	public Profesor(String nombre, String domicilio, String horario, String carrera, String ID) {
		super(nombre, domicilio, horario);
		this.carrera=carrera;
		this.ID=ID;
	}
	
	public void setID(String I) {
		ID=I;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setCarrera(String carr) {
		carrera=carr;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public String [] info() {
		
		String []info= {this.getCarrera(),this.getID()};
		
		return info;
	}
	
	public void enseniar() {
		System.out.println("Leo diapositivas");
	}
	
}
