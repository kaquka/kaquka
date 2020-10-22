package Ejerc10;

public class Estudiante extends Persona {

	private int grado;
	private char grupo;
	
	public Estudiante(String nombre, String domicilio, String horario, int grado,char grupo) {
		super(nombre, domicilio, horario);
		this.grado=grado;
		this.grupo=grupo;
	}
	
	public void setGrado(int grad) {
		grado=grad;
	}
	
	public void setGrupo(char grup) {
		grupo=grup;
	}
	
	public char getGrupo() {
		return grupo;
	}
	public int getGrado() {
		return grado;
	}
	
	public void estudiar() {
		System.out.println("Hola, estoy estudiando para pendejo");
	}

}
