package Ejerc10;

public class Test2 {
	
	public static void main(String[] args) {
		
		Estudiante estudiante1= new Estudiante("Pepe", "Vespertino", "402", "201933893", "Ciencias");

		estudiante1.asistir();
		estudiante1.estudiar();
		
		Profesor prof1=new Profesor("Sech", "151654", "Ciencias", "Vespertino");
		prof1.setJefe("Alfredo");
		prof1.asistir();
		prof1.enseniar();
		prof1.cobrar();
		
		Administrador admin=new Administrador("Sebas", "Puebla");
		admin.setPuesto("Admin");
		admin.toString();
		admin.asistir();
		admin.administrar();

		
		
	}

}
