package Ejerc10;

public class Persona {
	private String nombre,domicilio,horario;
	
	public Persona(String nombre,String domicilio,String horario) {
		this.nombre=nombre;
		this.domicilio=domicilio;
		this.horario=horario;
	}
	
	public Persona(String nombre, String horario) {
		this.nombre=nombre;
		this.horario=horario;
	}
	
	public void setNombre(String nom) {
		nombre=nom;
	}
	
	public void setHorario(String hor) {
		horario=hor;
	}
	
	public void setDomi(String domi) {
		domicilio=domi;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public String getDomi() {
		return domicilio;
	}
	
	public void asistir() {
		System.out.println("Asisto no me lo creo locooooo");
	}
	
	public String toString(){
		return "Soy: "+nombre+"\nVivo en "+domicilio+"\nMi horario: "+horario;
	}
	
}
