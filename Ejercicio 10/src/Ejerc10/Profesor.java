package Ejerc10;

public class Profesor extends Empleado {

	private String carrera,ID;
	
	public Profesor(String nom,String ID, String carr, String hora) {
		super(nom,hora);
		carrera=carr;
		this.ID= ID;
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
		
		String []info= {this.getNombre(),this.getID(),this.getCarrera(),this.getHorario()};
		
		return info;
	}
	
	public void enseniar() {
		System.out.println("Leo diapositivas");
	}
	
}
