package Ejerc10;

public class Estudiante extends Persona {

	private String grado,grupo;
	
	public Estudiante(String nombre, String domicilio, String horario, String grado,String grupo) {
		super(nombre, domicilio, horario);
		this.grado=grado;
		this.grupo=grupo;
	}
	
	public Estudiante(String nom, String horario, String grupo, String grado) {
		super(nom,horario);
		this.grado=grado;
		this.grupo=grupo;
	}
	
	
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
		
		String []info= {this.getNombre(),this.getGrado(),this.getGrupo(),this.getHorario()};
		
		return info;
	}
	
	public void estudiar() {
		System.out.println("Hola, estoy estudiando para pendejo");
	}

}
