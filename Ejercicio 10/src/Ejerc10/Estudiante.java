package Ejerc10;
//agregar ID ;;; modificar info
public class Estudiante extends Persona {

	private String grupo,ID,Carrera;
	
	public Estudiante(String nombre, String domicilio, String horario,String grupo,String ID,String Carrera) {
		super(nombre, domicilio, horario);
		this.grupo=grupo;
		this.ID=ID;
		this.Carrera=Carrera;
	}
	
	public Estudiante(String nom, String horario, String grupo, String ID,String Carrera) {
		super(nom,horario);
		this.grupo=grupo;
		this.ID=ID;
		this.Carrera=Carrera;
	}
	
	public void setCarrera(String Car) {
		Carrera=Car;
	}
	
	public String getCarrera() {
		return Carrera;
	}
	
	
	public void setGrupo(String grup) {
		grupo=grup;
	}
	
	public String getGrupo() {
		return grupo;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID= ID;
	}
	
	public String [] info() {
		
		String []info= {this.getNombre(),this.getID(),this.getGrupo(),
				this.getCarrera(),this.getHorario()};
		return info;
	}
	
	public void estudiar() {
		System.out.println("Hola, estoy estudiando");
	}

}
