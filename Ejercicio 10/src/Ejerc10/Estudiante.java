package Ejerc10;
//agregar ID ;;; modificar info
public class Estudiante extends Persona {

	private String grado,grupo,ID;
	
	public Estudiante(String nombre, String domicilio, String horario, String grado,String grupo,String ID) {
		super(nombre, domicilio, horario);
		this.grado=grado;
		this.grupo=grupo;
		this.ID=ID;
	}
	
	public Estudiante(String nom, String horario, String grupo, String grado) {
		super(nom,horario);
		this.grado=grado;
		this.grupo=grupo;
	}
	
	//
	
	
	public void setGrado(String grad) {
		this.grado=grad;
	}
	
	public void setGrupo(String grup) {
		grupo=grup;
	}
	
	public String getGrupo() {
		return grupo;
	}
	public String getGrado() {
		return grado;
	}
	
	public String [] info() {
		
		String []info= {this.getNombre(),this.getGrado(),this.getGrupo(),this.ID};
		
		return info;
	}
	
	public void estudiar() {
		System.out.println("Hola, estoy estudiando para pendejo");
	}

}
