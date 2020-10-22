package Ejerc10;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{

	public Ventana() {
		
		setTitle("Registro");
		setSize(1000,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Panel_1 panel = new Panel_1();
		add(panel);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Ventana marco= new Ventana();
		

	}

}

class Panel_1 extends JPanel{
	
	JLabel ANombre;
	JLabel GradoA = new JLabel("Grado");
	JLabel GrupoA = new JLabel("Grupo");
	JLabel HorarioA = new JLabel("Horario");
		
	JButton botonA = new JButton("Aceptar");
	
	public Panel_1() {
	
		ANombre = new JLabel("Nombre");
		
		add(ANombre);
		ANombre.setBounds(20, 50, 80, 20);
		
		
		add(GradoA);
		add(GrupoA);
		add(HorarioA);
		
		add(botonA);
	}
	
	
}










