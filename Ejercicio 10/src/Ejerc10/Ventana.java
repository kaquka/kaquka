package Ejerc10;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana extends JFrame{
	
	public static final int width=600;	//por si los ocupanos en otras clases
	public static final int high=1000;
	
	public Ventana() {
		
		setTitle("Registro");
		setSize(Ventana.high,Ventana.width);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel_1 panel = new Panel_1();
		add(panel);
		
		setVisible(true);		//va al final de todo para que se visualicen todos los componentes
	}
	
	public static void main(String[] args) {
		
		Ventana marco= new Ventana();		//instancia una ventana
		
	}

}

class Panel_1 extends JPanel{
	
	ArrayList <Estudiante> Lista_E = new ArrayList <Estudiante>();  //Para poder agregarlos a la tabla
	
	private String [] horario= {"Matutino","Vespertino","Nocturno"};
	
	
	
	JLabel Alum_nom = new JLabel("Nombre");
	JLabel Alum_grad = new JLabel("Grado");
	JLabel Alum_grup = new JLabel("Grupo");
	JLabel Alum_hora = new JLabel("Horario");
	
	JTextField camp_nombre = new JTextField();
	JTextField camp_grado = new JTextField();
	JTextField camp_grupo = new JTextField();
	JComboBox camp_hora = new JComboBox(horario);
	
	JButton botonA = new JButton("Aceptar");
	
	
	
	public Panel_1() {
		
		setLayout(null);		//desabilita el diseño por defecto del panel
		
		Alum_nom.setBounds(30, 70, 50, 20);
		Alum_grad.setBounds(30, 100, 50, 20);
		Alum_grup.setBounds(30, 130, 50, 20);
		Alum_hora.setBounds(30, 160, 50, 20);
	
		add(Alum_nom);
		add(Alum_grad);
		add(Alum_grup);
		add(Alum_hora);
		
		camp_nombre.setBounds(90, 70, 80, 20);
		camp_grado.setBounds(90, 100, 80, 20);
		camp_grupo.setBounds(90, 130, 80, 20);
		camp_hora.setBounds(90, 160, 80, 20);
	
		add(camp_nombre);
		add(camp_grado);
		add(camp_grupo);
		add(camp_hora);

		Lista Evento_lista= new Lista();
			
		botonA.setBounds(90, 200, 80, 20);
		botonA.addActionListener(Evento_lista);
		add(botonA);
		
	}
	
	private class Lista implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			Estudiante estudiante = new Estudiante(camp_nombre.getText(),
					horario[camp_hora.getSelectedIndex()], camp_grupo.getText(), camp_grado.getText());
			
			Lista_E.add(estudiante);
			
			
		}
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
	}
	
	
}










