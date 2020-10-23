package Ejerc10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
	private String [] columnas= {"Nombre","Grado","Grupo","Horario"};
	
	DefaultTableModel Modelo_tablaE = new DefaultTableModel(columnas,1); //objeto que implementa la interfaz "TlableModel"
	JTable TablaE = new JTable(Modelo_tablaE);
	
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
		
		Alum_nom.setBounds(30, 60, 50, 20);
		Alum_grad.setBounds(30, 90, 50, 20);
		Alum_grup.setBounds(30, 120, 50, 20);
		Alum_hora.setBounds(30, 150, 50, 20);
	
		add(Alum_nom);
		add(Alum_grad);
		add(Alum_grup);
		add(Alum_hora);
		
		camp_nombre.setBounds(90, 60, 80, 20);
		camp_grado.setBounds(90, 90, 80, 20);
		camp_grupo.setBounds(90, 120, 80, 20);
		camp_hora.setBounds(90, 150, 80, 20);
	
		add(camp_nombre);
		add(camp_grado);
		add(camp_grupo);
		add(camp_hora);
		
		TablaE.setBounds(200, 50, 300, 450);
		TablaE.setBackground(new Color(204,238,255));
		add(TablaE);
		
		ListaE Evento_lista= new ListaE();
			
		botonA.setBounds(90, 200, 80, 20);
		botonA.addActionListener(Evento_lista);
		add(botonA);
		
	}
	
	private class ListaE implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			Estudiante estudiante = new Estudiante(camp_nombre.getText(),
					horario[camp_hora.getSelectedIndex()], camp_grupo.getText(), camp_grado.getText());
			
			Lista_E.add(estudiante);
			
			Modelo_tablaE.addRow(estudiante.info());
			
			camp_nombre.setText("");
			camp_grupo.setText("");
			camp_grado.setText("");
		}
		

	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setBackground(Color.LIGHT_GRAY);
		
		Graphics2D g2= (Graphics2D) g;
		
		g2.setFont(new Font("Arial",Font.BOLD,20));
		g2.setColor(new Color(59,0,179));
		g2.drawString("Alta Alumnos",25, 25);
		
	}
	
	
}










