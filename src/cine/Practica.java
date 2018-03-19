package cine;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practica extends javax.swing.JFrame{
	
	
	//contenedor principal
	Container panelPrincipal;
	
	//contenedores 
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	JPanel panel7;
	JPanel panel8;
	
	//etiquetas
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	
	//botones 
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JButton boton8;
	JButton boton9;
	JButton boton10;
	
	//cajas de texto
	JTextField field1;
	
	//casillas desplegables
	JComboBox jComboBox1;
	JComboBox jComboBox2;
	JComboBox jComboBox3;
	
	//creo una arrayList para los jtext
	ArrayList<JTextField> listatext = new ArrayList<JTextField>();
	
	public Practica(){
		this.initComponents();
	}
	
	public void initComponents(){
		this.panelPrincipal = this.getContentPane();
		this.setSize(926, 600);
		this.setLocationRelativeTo(null);
		this.panelPrincipal.setLayout(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		//panel de arriba
		this.panel1 = new panelArriba("cinepolis-logo");
		this.panel1.setBounds(0, 0, this.getWidth(), 150);
		
		this.panelPrincipal.add(this.panel1);
		
		//panel de dinero
		 this.panel2 = new JPanel();
	     this.panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dinero"));
	     this.panel2.setBounds(0, 160, 400, 50);
	     this.label1 = new JLabel("Dinero en caja: $0");
	     this.panel2.add(this.label1);
	     this.panelPrincipal.add(this.panel2);
	     
	     //panel silla de reservas panel 3
	     this.panel3 = new JPanel();
	     this.panel3.setLayout(null);
	     this.panel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Silla de la reserva"));
	     this.panel3.setBounds(0, 210, 400, 200);
	     
	     //label seleccionar silla panel 3
	     this.label2 = new JLabel("Seleccionar Silla:");
	     this.label2.setBounds(80, 30, 100, 20);
	     this.panel3.add(this.label2);
	     
	     //añado el combo box 1 panel 3
	     this.jComboBox1 = new JComboBox();
	     this.jComboBox1.setBounds(80, 50, 80, 20);
	     this.jComboBox1.addItem("General");
	     this.panel3.add(this.jComboBox1);
	     
	     //añado el combo box 2 al panel 3
	     this.jComboBox2 = new JComboBox();
	     this.jComboBox2.setBounds(80, 80, 80, 20);
	     this.jComboBox2.addItem("A");
	     this.panel3.add(this.jComboBox2);
	     
	   //añado el combo box 2 al panel 3
	     this.jComboBox3 = new JComboBox();
	     this.jComboBox3.setBounds(80, 110, 80, 20);
	     this.jComboBox3.addItem("1");
	     this.panel3.add(this.jComboBox3);
	     
	     //lalbel 3 panel 3
	     this.label3 = new JLabel("Sillas reservadas:");
	     this.label3.setBounds(190, 30, 110, 20);
	     this.panel3.add(this.label3);
	     
	     //jtextfield panel 3
	     this.field1 = new JTextField();
	     this.field1.setBounds(190, 50, 130, 100);
	     this.panel3.add(this.field1);
	     
	     //boton panel 3
	     this.boton1 = new JButton("Agregar silla");
	     this.boton1.setBounds(190, 160,130,30);
	     this.panel3.add(this.boton1);   
	     
	     this.panelPrincipal.add(this.panel3);
	     
	     //panel 4 reserva
	     this.panel4 = new JPanel();
	     this.panel4.setLayout(null);
	     this.panel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva"));
	     this.panel4.setBounds(0, 410, 400, 50);
	     
	     //boton 1 panel 4 
	     this.boton2 = new JButton("Eliminar");
	     this.boton2.setBounds(10, 20, 100, 20);
	     this.panel4.add(this.boton2);
	     
	     //boton 2 panel 4
	     this.boton3 = new JButton("Guardar reserva");
	     this.boton3.setBounds(120, 20, 130, 20);
	     this.panel4.add(this.boton3);
	     
	     //boton 3 panel 4
	     this.boton4 = new JButton("Cargar reserva");
	     this.boton4.setBounds(260, 20, 130, 20);
	     this.panel4.add(this.boton4);
	     
	     this.panelPrincipal.add(this.panel4);
	     
	     //panel 5 agregar reserva
	     this.panel5 = new JPanel();
	     this.panel5.setLayout(null);
	     this.panel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagar rerserva"));
	     this.panel5.setBounds(0, 460, 400, 50);
	     
	     //boton 1 panel 5
	     this.boton5 = new JButton("Pagar en efectivo");
	     this.boton5.setBounds(5, 20, 195, 20);
	     this.panel5.add(this.boton5);
	     
	     //boton 2 panel 5
	     this.boton6 = new JButton("Pagar con tarjeta");
	     this.boton6.setBounds(200, 20, 195, 20);
	     this.panel5.add(this.boton6);
	     
	     this.panelPrincipal.add(this.panel5);
	     
	     //panel 6 manejo tarjetas
	     this.panel6 = new JPanel();
	     this.panel6.setLayout(null);
	     this.panel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Manejo tarjetas"));
	     this.panel6.setBounds(0, 510, 400, 50);
	     
	     //boton 1 panel 6 
	     
	     this.boton7 = new JButton("Crear Tarjeta");
	     this.boton7.setBounds(5, 20, 195, 20);
	     this.panel6.add(this.boton7);
	     
	     //boton 2 panel 6
	     this.boton8 = new JButton("Recargar Tarjeta");
	     this.boton8.setBounds(200, 20, 195, 20);
	     this.panel6.add(this.boton8);
	     
	     this.panelPrincipal.add(this.panel6);
	     
	     //panel 7 sala
	     
	     this.panel7 = new JPanel();
	     this.panel7.setLayout(null);
	     this.panel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Sala"));
	     this.panel7.setBounds(400,160, 510, 345);
	     
	     //etiqueta pantall panel 7
	     
	     this.label4 = new JLabel("PANTALLA");
	     
	     this.label4.setFont(new Font(null,0,20));
	     this.label4.setBorder(javax.swing.border.LineBorder.createBlackLineBorder());
	     this.label4.setHorizontalAlignment(JLabel.CENTER);
	     this.label4.setBounds(120, 20,300, 30);
	     this.panel7.add(this.label4);
	     
	     //genero los 220 Jtext 
	     this.generarJText();
	     
	     //los agrego a mi panel 7
	     
	     for(JTextField field : this.listatext){
	    	 this.panel7.add(field);
	     }
	     this.panelPrincipal.add(this.panel7);
	     
	     //panel 8 opciones
	     this.panel8 = new JPanel();
	     this.panel8.setLayout(null);
	     this.panel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
	     this.panel8.setBounds(400,510,510 , 50);
	     
	     //botones 1 panel 8
	     this.boton8 = new JButton("Opcion 1");
	     this.boton8.setBounds(5, 20, this.panel8.getWidth()/2, 20);
	     this.panel8.add(this.boton8);
	     
	     //boton 2 panel 
	     this.boton9 = new JButton("Opcion 2");
	     this.boton9.setBounds(this.panel8.getWidth()/2, 20, 250, 20);
	     this.panel8.add(this.boton9);
	     this.panelPrincipal.add(this.panel8);
		
	}
	
	
	public void generarJText(){
		
		String [] nA = {"A0","B0","C0","D0","E0","F0","G0","H0",
				"I0","J0","K0"};
		
		int j = 0;
		int posx = 5;
		int posy = 120;
		int var = 0;
		for (int i = 0; i < 220;i++){
			
			//si llego al final del panel reinicio
			//la posicion en x desde el inicio
			//a la posicion en y le sumo 20 para que no queden
			//encimados los jText
			if(posx >= this.panel7.getWidth()-10){
				posx = 5;
				posy += 20;
				
				//sumo 1 a variable que recorrera el arreglo de strings
				j += 1;
				
				//reinicio el contador
				var = 0;
				
			}
			var+=1;
			//creo una variabel de tipo Jtext 
			JTextField field = new JTextField(nA[j]+var);
			//le asigno una posicion en x, y ancho y altura
			field.setBounds(posx,posy , 25,20);
			//cambio el tamaño de las letras
			field.setFont(new Font(null,0,8));
			//lo agrego a mi lista
			this.listatext.add(field);
			posx += 25;
			
		}
	}
	
	public static void main(String [] args){
		new Practica().setVisible(true);
	}
}

class panelArriba extends JPanel{
	
	private String nombre;
	
	public panelArriba(String nombre){
		this.nombre = nombre;
	}
	
	public void paintComponent(Graphics g){
		Dimension tam = this.getSize();
		ImageIcon fondo = new ImageIcon(this.getClass().getResource("/imagen/"+this.nombre+".jpg"));
		g.drawImage(fondo.getImage(), 0, 0, tam.width, tam.height, null, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
	
}