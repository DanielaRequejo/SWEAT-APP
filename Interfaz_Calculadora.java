import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;

public class Interfaz_Calculadora{

    public static void main(String[] args){
	JFrame ventana =new Interfaz();
	ventana.setVisible(true);
    }
}

class Interfaz extends JFrame{
	
    private JLabel label = new JLabel("Calculadora");
    private JLabel label1= new JLabel ("Bienvenido aqui puedes \n ver tu frecuencia cardiaca maxima");
    private JLabel FCM = new JLabel("FCM: ");
    private JLabel zona1 = new JLabel("ZONA 1:");
    private JLabel zona2 = new JLabel("ZONA 2:");
    private JLabel zona3 = new JLabel("ZONA 3:");
    private JLabel zona4 = new JLabel("ZONA 4:");
    private JLabel IMC = new JLabel("IMC :");
    private JTextField fcm= new JTextField(5);
    private JTextField z1= new JTextField(5);
    private JTextField z2= new JTextField(5);
    private JTextField z3= new JTextField(5);
    private JTextField z4= new JTextField(5);
    private JTextField imc= new JTextField(5);
    private JButton regresar = new JButton("REGRESAR");
    private JLabel vacio= new JLabel();
    //notas
    private JLabel n = new JLabel("100%");
    private JLabel n1 = new JLabel("50-60%");
    private JLabel n2 = new JLabel("60-70%");
    private JLabel n3 = new JLabel("70-80%");
    private JLabel n4 = new JLabel("80-90%");
    private JLabel n5 = new JLabel("Indice de masa corporal");
    private JLabel back= new JLabel(new ImageIcon("imagen1.png"));
    Interfaz(){
	label.setFont(new Font("Purisa",Font.BOLD,40));
	label.setForeground(new Color(255,128,0));
	label.setHorizontalAlignment(JLabel.CENTER);
	label1.setFont(new Font("Sawasdee",0,18));
	label1.setHorizontalAlignment(JLabel.CENTER);
	FCM.setFont(new Font("Sawasdee",0,15));
	FCM.setHorizontalAlignment(JLabel.RIGHT);
	zona1.setFont(new Font("Sawasdee",0,15));
	zona1.setHorizontalAlignment(JLabel.RIGHT);
	zona2.setFont(new Font("Sawasdee",0,15));
	zona2.setHorizontalAlignment(JLabel.RIGHT);
	zona3.setFont(new Font("Sawasdee",0,15));
	zona3.setHorizontalAlignment(JLabel.RIGHT);
	zona4.setFont(new Font("Sawasdee",0,15));
	zona4.setHorizontalAlignment(JLabel.RIGHT);
	IMC.setFont(new Font("Sawasdee",0,15));
	IMC.setHorizontalAlignment(JLabel.RIGHT);
	regresar.setBackground(new Color(255,128,0));
	regresar.setFont(new Font("Sawasdee",Font.BOLD,20));
	JPanel content = new JPanel();
	content.setBackground(new Color(224,224,224,100));
	content.setLayout(new GridLayout(6,3,4,4));
	
	content.add(FCM);
	content.add(fcm);
	content.add(n);
	content.add(zona1);
	content.add(z1);
	content.add(n1);
	content.add(zona2);
	content.add(z2);
	content.add(n2);
	content.add(zona3);
	content.add(z3);
	content.add(n3);
	content.add(zona4);
	content.add(z4);
	content.add(n4);
	content.add(IMC);
	content.add(imc);
	content.add(n5);

	JPanel content1 = new JPanel();
	content1.setBackground(new Color(224,224,224,100));
	content1.setLayout(new GridLayout(2,1,1,1));

	content1.add(label);
	content1.add(label1);

	JPanel content2 = new JPanel();
	content2.setBackground(new Color(224,224,224,100));
	content2.setLayout(new GridLayout(1,3,100,1));

	content2.add(vacio);
	content2.add(regresar);
	content2.add(vacio);
	
	JPanel content3 = new JPanel();
	content3.setBackground(new Color(224,224,224,100));
	content3.setLayout(new BorderLayout());
	
	content3.add(content1,BorderLayout.NORTH);
	content3.add(content,BorderLayout.WEST);
	content3.add(content2,BorderLayout.SOUTH);


	regresar.addActionListener(new Regresa());
	back.setLayout(new FlowLayout());
	back.add(content3);
	this.setContentPane(back);
	this.pack();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setBounds(100,100,530,400);
	this.setTitle("Calculadora.PROYECTO_FINAL");
    }
    public class Regresa implements ActionListener{
	public void actionPerformed(ActionEvent e){
	}
    }
}
