package Ejerc10;

public class Test2 {
	
	public static void main(String[] args) {
		
		Estudiante estudiante1= new Estudiante("Pepe", "veracruz","Vespertino", "402", "201933893", "Ciencias");
		System.out.println(estudiante1.toString());
		estudiante1.asistir();
		estudiante1.estudiar();
		System.out.println("\n");
		
		Profesor prof1=new Profesor("Sech", "Puebla", "Vespertino");
		prof1.setJefe("Alfredo");
		System.out.println(prof1.toString());
		prof1.asistir();
		prof1.enseniar();
		prof1.cobrar();
		System.out.println("\n");
		
		Administrador admin=new Administrador("Sebas", "Puebla","Nocturno");
		admin.setPuesto("Admin");
		System.out.println(admin.toString());
		admin.asistir();
		admin.administrar();

		
		
	}

}
