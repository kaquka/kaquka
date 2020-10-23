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
	
	//Para la primera lista:
	ArrayList <Estudiante> Lista_E = new ArrayList <Estudiante>();  //Para poder agregarlos a la tabla
	private String [] horario= {"Matutino","Vespertino","Nocturno"};
	private String [] columnas= {"Nombre","ID","Grupo","Carrera","Horario"};
	private String [] grupos = {"101","102","201","202","301","302","401","402"};
	private String [] carreras= {"Ciencias","Sociales","Medicina"};
	
	DefaultTableModel Modelo_tablaE = new DefaultTableModel(columnas,0); //objeto que implementa la interfaz "TlableModel"
	JTable TablaE = new JTable(Modelo_tablaE);
	
	JLabel Alum_nom = new JLabel("Nombre");
	JLabel Alum_ID = new JLabel("ID");
	JLabel Alum_grup = new JLabel("Grupo");
	JLabel Alum_carr = new JLabel("Carrera");
	JLabel Alum_hora = new JLabel("Horario");
	
	JTextField camp_nombre = new JTextField();
	JTextField camp_ID = new JTextField();
	JComboBox camp_grupo = new JComboBox(grupos);
	JComboBox camp_carr = new JComboBox(carreras);
	JComboBox camp_hora = new JComboBox(horario);
	JButton botonA = new JButton("Aceptar");
	
	//Para la segunda lista:
	public ArrayList <Profesor> Lista_P = new ArrayList <Profesor>();  //Para poder agregarlos a la tabla
	private String [] columnasP= {"Nombre","ID","Carrera","Horario"};

	DefaultTableModel Modelo_tablaP = new DefaultTableModel(columnasP,0); //objeto que implementa la interfaz "TlableModel"
	JTable TablaP = new JTable(Modelo_tablaP);
	
	JLabel Prof_nom = new JLabel("Nombre");
	JLabel Prof_ID = new JLabel("ID");
	JLabel Prof_carr = new JLabel("Carrera");
	JLabel Prof_hora = new JLabel("Horario");
	
	JTextField camp_nombreP = new JTextField();
	JTextField camp_IDP = new JTextField();
	JComboBox camp_carrP = new JComboBox(carreras);
	JComboBox camp_horaP = new JComboBox(horario);
	JButton botonP = new JButton("Aceptar");
	
	
	public Panel_1() {
		
		setLayout(null);		//desabilita el diseño por defecto del panel
		
		Alum_nom.setBounds(30, 40, 50, 20);		//agregamos las etiquetas
		Alum_ID.setBounds(30, 70, 50, 20);	
		Alum_grup.setBounds(30, 100, 50, 20);
		Alum_carr.setBounds(30, 130, 50, 20);
		Alum_hora.setBounds(30, 160, 50, 20);
	
		add(Alum_nom);
		add(Alum_ID);
		add(Alum_grup);
		add(Alum_carr);
		add(Alum_hora);
		
		camp_nombre.setBounds(90, 40, 80, 20);	//agregamos los campos
		camp_ID.setBounds(90, 70, 80, 20);
		camp_grupo.setBounds(90, 100, 80, 20);
		camp_carr.setBounds(90, 130, 80, 20);
		camp_hora.setBounds(90, 160, 80, 20);
		
		add(camp_nombre);
		add(camp_ID);
		add(camp_grupo);
		add(camp_carr);
		add(camp_hora);
		
		TablaE.setBounds(200, 50, 375, 450);		//agregamos la tabla
		TablaE.setBackground(new Color(212,249,255));
		TablaE.setOpaque(false);
		TablaE.setEnabled(false);
		add(TablaE);
		
		ListaE Evento_lista= new ListaE();
			
		botonA.setBounds(90, 190, 80, 20);		//agregamos el boton
		botonA.addActionListener(Evento_lista);
		add(botonA);
		
		SegundaLista();
		
	}
	
	private class ListaE implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(!camp_nombre.getText().equals("") && !camp_ID.getText().equals("")) {
				
			Estudiante estudiante = new Estudiante(camp_nombre.getText(),
				horario[camp_hora.getSelectedIndex()], grupos[camp_grupo.getSelectedIndex()],
				camp_ID.getText(), carreras[camp_carr.getSelectedIndex()]);
			
			Lista_E.add(estudiante);
			Modelo_tablaE.addRow(estudiante.info());
				
			}else {
				JOptionPane.showConfirmDialog(null, "Campo de nombre o ID vacios");
			}
			
			camp_nombre.setText("");
			camp_ID.setText("");
		}
	}
	
	private class ListaP implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(!camp_nombreP.getText().equals("") && !camp_IDP.getText().equals("")) {
				
			Profesor profesor = new Profesor(camp_nombreP.getText(),camp_IDP.getText(),
				carreras[camp_carrP.getSelectedIndex()], horario[camp_horaP.getSelectedIndex()]);
			
			Lista_P.add(profesor);
			Modelo_tablaP.addRow(profesor.info());
				
			}else {
				JOptionPane.showConfirmDialog(null, "Campo de nombre o ID vacios");
			}
			
			camp_nombreP.setText("");
			camp_IDP.setText("");
		}
	}
	
	private void SegundaLista() {
		
		Prof_nom.setBounds(30, 290, 50, 20);		
		Prof_ID.setBounds(30, 320, 50, 20);	
		Prof_carr.setBounds(30, 350, 50, 20);
		Prof_hora.setBounds(30, 380, 50, 20);
	
		add(Prof_nom);
		add(Prof_ID);
		add(Prof_carr);
		add(Prof_hora);
		
		camp_nombreP.setBounds(90, 290, 80, 20);	//agregamos los campos
		camp_IDP.setBounds(90, 320, 80, 20);
		camp_carrP.setBounds(90, 350, 80, 20);
		camp_horaP.setBounds(90, 380, 80, 20);
		
		add(camp_nombreP);
		add(camp_IDP);
		add(camp_carrP);
		add(camp_horaP);
		
		TablaP.setBounds(610, 50, 310, 450);		//agregamos la tabla
		TablaP.setBackground(new Color(165,255,180));
		TablaP.setOpaque(false);
		TablaP.setEnabled(false);
		add(TablaP);
		
		ListaP Evento_lista2= new ListaP();
			
		botonP.setBounds(90, 410, 80, 20);		//agregamos el boton
		botonP.addActionListener(Evento_lista2);
		add(botonP);
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		setBackground(new Color(239,191,228));
		
		Graphics2D g2= (Graphics2D) g;
		
		g2.setFont(new Font("Arial",Font.BOLD,20));
		g2.setColor(new Color(59,4,141));
		g2.drawString("Alta Alumnos",25, 25);
		
		g2.setFont(new Font("Arial",Font.BOLD,16));
		g2.setColor(new Color(0,0,0));
		g2.drawString("Alumnos",325, 20);
		
		g2.setFont(new Font("Arial",Font.BOLD,12));	//se pone las columnas
		g2.setColor(new Color(0,0,0));
		g2.drawString("Nombre",205, 42);
		g2.drawString("ID",285, 42);
		g2.drawString("Grupo",355, 42);
		g2.drawString("Carrera",430, 42);
		g2.drawString("Carrera",505, 42);
		
		//segunda lista:
		
		g2.setFont(new Font("Arial",Font.BOLD,20));
		g2.setColor(new Color(59,4,141));
		g2.drawString("Alta Profesores",20, 260);
		
		g2.setFont(new Font("Arial",Font.BOLD,16));
		g2.setColor(new Color(0,0,0));
		g2.drawString("Profesores",725, 20);
		
		g2.setFont(new Font("Arial",Font.BOLD,12));	//se pone las columnas
		g2.setColor(new Color(0,0,0));
		g2.drawString("Nombre",615, 42);
		g2.drawString("ID",695, 42);
		g2.drawString("Carrera",765, 42);
		g2.drawString("Horario",840, 42);
	}
}



