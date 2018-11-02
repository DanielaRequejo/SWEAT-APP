import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.Graphics;
import java.text.DecimalFormat;

/**
 *Clase encargada de las variables globales persona, moni y select; en las cuales se almacenara
 *el nickname de la persona que inicio sesion, el monitoreo y la opcion seleccionada.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
class VARIABLES{
    
    /**
     *Atributos encargados de almacenar el nickname de la persona, el monitoreo y la opcion seleccionada.
     */
    public static String persona="",moni="",select="";
    
}//VARIABLES

/**
 *Clase encargada de crear las ventanas de inicio de sesion y de registro.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
interface VENTANAS{
    JFrame principal = new LogIn();
    JFrame nuevo = new NEW();
    
}//VENTANAS 

/**
 *Clase encargada de hacer visible la ventana de inicio de sesion.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
public class Proyecto implements VENTANAS {

    /**
     *Main donde se hara visible la ventana principal.
     *
     *@param String En caso de que se desee ejecutar por la linea de comandos.
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */
    public static void main(String[] args){
	principal.setVisible(true);
   
    }//main

}//Proyecto

/**
 *Clase encargada de hacer la ventana de inicio de sesion.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
class LogIn extends JFrame implements VENTANAS{

    /**
     *Atributo tipo JMenuBar encargado de crear la barra del menu.
     */
    private JMenuBar menuBar = new JMenuBar();
    
    /**
     *Atributo tipo JMenu encargado de crear la etiqueta que se visualiza en el menu.
     */
    private JMenu menu = new JMenu("Acerca de");
    
    /**
     *Atributo tipo JMenu encargado de crear el diseno.
     */
    private JMenu diseno = new JMenu("-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º");
    
    /**
     *Atributo tipo JMenu encargado de crear el diseno.
     */
    private JMenu diseno1 = new JMenu("-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º");
    
    /**
     *Atributo tipo JMenu encargado de crear el diseno.
     */
    private JMenu menu1= new JMenu("-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º-º");
    
    /**
     *Atributo tipo JMenuItem encargado de crear el contenido de "Acerca de" al dar click.
     */
    private JMenuItem menuItem = new JMenuItem("Montserrat Devars",KeyEvent.VK_T);
    
    /**
     *Atributo tipo JMenuItem encargado de crear el contenido de "Acerca de" al dar click.
     */
    private JMenuItem menuItem1 = new JMenuItem("David Parra",KeyEvent.VK_T);
    
    /**
     *Atributo tipo JMenuItem encargado de crear el contenido de "Acerca de" al dar click.
     */
    private JMenuItem menuItem2 = new JMenuItem("Daniela Requejo",KeyEvent.VK_T);
    
    /**
     *Atributo tipo JMenuItem encargado de crear el contenido de "Acerca de" al dar click.
     */
    private JMenuBar menuBar1 = new JMenuBar();
    
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta con el titulo de la ventana.
     */
    private JLabel log_in = new JLabel("···Log-In···");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta solicitando el nickname para poder iniciar sesion.
     */
    private JLabel nickname = new JLabel("Nickname");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta solicitando la contrasena para poder iniciar sesion.
     */
    private JLabel contra = new JLabel("Contraseña");
    
    
    /**
     *Atributo tipo JButton encargado de crear el boton que al dar click, abra una nueva ventana en caso de que el usuario no este registrado.
     */
    private JButton regist = new JButton("Registrarse");
    
    /**
     *Atributo tipo JButton encargado de crear el boton para poder iniciar sesion.
     */
    private JButton ingresa = new JButton("Ingresar");
    
    /**
     *Atributo tipo JButton encargado de crear el boton que al dar click, pueda salir del sistema.
     */
    private JButton salir = new JButton("Salir");
    
    
    /**
     *Atributo tipo JTextField encargado de crear la caja donde el usuario podra teclear su nickname.
     */
    private JTextField text1 = new JTextField(10);
    
    /**
     *Atributo tipo JPasswordField encargado de crear la caja donde el usuario podra teclear su contrasena.
     */
    private JPasswordField text2 = new JPasswordField(10);
    
    
    /**
     *Atributo tipo JLabel encargado de crear el fondo de pantalla.
     */
    private JLabel back= new JLabel(new ImageIcon("WDF_925077.jpg"));
    
    private JLabel vacio= new JLabel(" ");
    private JLabel vacio1= new JLabel(" ");
    
    /**
     *Atributo tipo Usuario para guardar el usuario que ingreso.
     */
    private Usuarios p;

    /**
     *Constructor encargado de incializar todos los atributos de la ventana.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */
    public LogIn(){
        
	p = new Usuarios();
    
	//Tipo de letra.
	text1.setFont(new Font("Sawasdee",0,30)); 
	text2.setFont(new Font("Sawasdee",0,30));
	log_in.setFont(new Font("Purisa",Font.BOLD,40));
    
	//Posicion y tipo de letra.
	log_in.setHorizontalAlignment(JLabel.LEFT);
	log_in.setForeground(new Color(0,102,102));
    
	//Tipo de letra y posicion de la etiqueta Nickname.
	nickname.setFont(new Font("Sawasdee",0,18));
	nickname.setHorizontalAlignment(JLabel.CENTER);
    
	//Tipo de letra y posicion de la etiqueta contrasena.
	contra.setFont(new Font("Sawasdee",0,18));
	contra.setHorizontalAlignment(JLabel.CENTER);
    
	//Tipo de letra y posicion de los botones.
	regist.setFont(new Font("Sawasdee",0,20));
	ingresa.setFont(new Font("Sawasdee",0,20));
	ingresa.setForeground(Color.WHITE);
    
	//Tipo de letra y posicion de los botones.
	salir.setFont(new Font("Sawasdee",0,20));
	salir.setForeground(Color.WHITE);
    
	//Fondo y color del fondo del boton registra.
	regist.setBackground(new Color(0,102,102));
	regist.setForeground(Color.WHITE);
    
	//Fondo y color del fondo del boton ingresa.
	ingresa.setBackground(new Color(0,102,102));
	salir.setBackground(new Color(0,102,102));
    
	//Tipo de letra y color del fondo del menu
	menu.setFont(new Font("Sawasdee",0, 18));
	menu.setForeground(Color.WHITE);
    
	//Tipo de letra y tamano de la decoracion del menu.
	menu1.setFont(new Font("Ubuntu Medium",Font.BOLD, 18));
   
	//Tipo de letra y tamano de la decoracion del diseno de la ventana.
	diseno.setFont(new Font("Ubuntu Medium",Font.BOLD, 18));
	diseno1.setFont(new Font("Ubuntu Medium",Font.BOLD, 18));

	//Tamano de la decoracion de la barra del menu.
	menuBar.setBackground(new Color(0,153,153,100));
	menuBar1.setBackground(new Color(0,153,153,100));

	//Agrega el diseno, y menu a la barra del menu.
	menuBar1.add(menu1);
	menuBar.add(diseno);
	menuBar.add(menu);
	menuBar.add(diseno1);
    
	//Agrega los Items al menu.
	menu.add(menuItem);
	menu.add(menuItem1);
	menu.add(menuItem2);
	
	//Crea el JPanel el cuual tendra el contenido creado previamente.
	JPanel content = new JPanel();
    
	//Se coloca fondo y un gridlayout para poder ordenar el contenido.
	content.setBackground(new Color(224,224,224,50));
	content.setLayout(new GridLayout(6,2,1,11));
    
	//Agrega todo el contenido al JPanel.
	content.add(vacio);
	content.add(vacio1);
	content.add(log_in);
	content.add(regist);
	content.add(nickname);
	content.add(text1);
	content.add(contra);
	content.add(text2);
	content.add(ingresa);
	content.add(salir);

	//Se les implementa un actionListener a los elementos necesarios (botones).
	regist.addActionListener(new Registra());
	ingresa.addActionListener(new Ingresa());
	salir.addActionListener(new Salir());

	//Se coloca todo en el GridLayout.
	back.setLayout(new BorderLayout());
	back.add(menuBar,BorderLayout.NORTH);
	back.add(content,BorderLayout.CENTER);
	back.add(menuBar1,BorderLayout.SOUTH);

	//Se coloca todo en el Panel, el titulo y se le activa la accion a la ventana de poder cerrar la ventana.    
	this.setContentPane(back);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Proyecto Final");
	this.setBounds(100,100,700,400);
    
    }//LogIn
    
    /**
     *Clase encargada de hacerla visible la ventana en la que el usuario se podra registrar.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */
    public class Registra implements ActionListener{
     
	/**
	 *Metodo publico encargado crear una nueva ventana y hacerla visible si se dio click en el boton.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */   
	public void actionPerformed(ActionEvent e){
        
	    //Hace visible la ventana principal y crea una nueva ventana de registro
	    principal.setVisible(false);
	    nuevo.setVisible(true);
        
	}//actionPerformed
    
    }//Registra
    
    /**
     *Clase encargada de crear la ventana en la que el usuario podra tener acceso para poder ingresar.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */
    public class Ingresa implements ActionListener{
       
	/**
	 *Metodo publico encargado crear una nueva ventana si se dio click en el boton.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 *@throws MessageDialago En caso de que el usuario ingrese mal su Nickname y/o usuario.
	 */   
	public void actionPerformed(ActionEvent e){

	    try{
        
		//Abre el archivo donde se encuentran los usuarios con su respectiva contraseña    
		File f = new File(text1.getText());
		VARIABLES.persona=text1.getText();
		Datos user=p.Visualizacion(text1.getText());
        
		//En caso de que el usuario exista abrira la ventana de inicio de sesion.
		if(f.exists()&&(user.getContrasena().equals(new String(text2.getPassword())))){
		    principal.setVisible(false);
		    JFrame opci= new HOLA();
		    opci.setVisible(true);
		
		}//if
        
		//En caso de que no exista marcara un mensaje de error.
		else{
		    JOptionPane.showMessageDialog(null,"Su nickname o contrasena es incorrecta");
		
		}//else
	    
	    }//try
        
	    //En caso de que no exista marcara un mensaje de error.
	    catch(Exception a){
		JOptionPane.showMessageDialog(null,"Su nickname o contrasena es incorrecta");
	    
	    }//catch
        
	}//actionperformed
    
    }//Ingresa
   
    /**
     *Clase encargada de terminar el programa en caso de que se de click en el boton de "salir".
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class Salir implements ActionListener{
       
	/**
	 *Metodo publico encargado crear salir al hacer click.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */ 
	public void actionPerformed(ActionEvent e){
	    System.exit(0);
	
	}//ActionPerformed
    
    }//Salir
    
}//LogIn
 
 /**
  *Clase encargada de crear la ventana en la que el usuario podra tener acceso para registrarse.
  *
  *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
  *@version 2.0
  *@since 27/04/2016
  *
  */    
class NEW extends JFrame implements VENTANAS{

    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "registrate".
     */
    private JLabel regist = new JLabel("Regístrate");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "nombre".
     */
    private JLabel nombre = new JLabel("Nombre");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "apellido paterno".
     */
    private JLabel apellido = new JLabel("Apellido Paterno");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "nickname".
     */
    private JLabel nickname = new JLabel("Nickname");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "contrasena".
     */
    private JLabel contra = new JLabel("Contraseña");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "fecha de nacimiento".
     */
    private JLabel fecha = new JLabel("Fecha de Nacimiento  (yyyy-mm-dd)");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "edad".
     */
    private JLabel edad = new JLabel("Edad");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "sexo".
     */
    private JLabel sexo = new JLabel("Sexo M/F");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "correo electronico".
     */
    private JLabel correo = new JLabel("Correo Electronico");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "altura".
     */
    private JLabel altura = new JLabel("Altura (cm)");
    
    /**
     *Atributo tipo Jlabel encargado de crear la etiqueta con la leyenda "peso".
     */
    private JLabel peso = new JLabel("Peso (kg)");
   
    
    /**
     *Atributo tipo JButton encargado de crear el boton con la leyenda "registrarsee".
     */
    private JButton registra = new JButton("Registrarse");
    
    /**
     *Atributo tipo Jlabel encargado de crear el boton con la leyenda "regresa".
     */
    private JButton regresa = new JButton("Regresa");
    
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su nombre.
     */
    private JTextField nom = new JTextField(10);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su apellido paterno.
     */
    private JTextField app = new JTextField(10);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su nickname.
     */
    private JTextField nick = new JTextField(10);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su contrasena.
     */
    private JTextField cont = new JTextField(10);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su fecha de nacimiento.
     */
    private JTextField date = new JTextField(10);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su edad.
     */
    private JTextField anos = new JTextField(3);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su sexo.
     */
    private JTextField sex = new JTextField(2);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su correo electronico.
     */
    private JTextField cor = new JTextField(20);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su altura.
     */
    private JTextField alt = new JTextField(5);
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto donde el usuario podra ingresar su peso.
     */
    private JTextField pes = new JTextField(5);
    
    /**
     *Atributo tipo JLabel encargado de colocar el fondo.
     */
    private JLabel back= new JLabel(new ImageIcon("BlueTiles2560x1600.png"));
    
    /**
     *Atributo tipo Usuario encargado de poder almacenar la informacion del nuevo usuario.
     */
    private Usuarios n;

    
    /**
     *Constructor encargado de inicializar todos los atributos de la ventana.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */
    public NEW(){
        
	n = new Usuarios();
    
	//Fuente y tamano de las etiquetas
	nom.setFont(new Font("Sawasdee",0,18)); 
	app.setFont(new Font("Sawasdee",0,18)); 
	nick.setFont(new Font("Sawasdee",0,18)); 	
	cont.setFont(new Font("Sawasdee",0,18)); 
	date.setFont(new Font("Sawasdee",0,18)); 
	anos.setFont(new Font("Sawasdee",0,18)); 
	cor.setFont(new Font("Sawasdee",0,18)); 
	alt.setFont(new Font("Sawasdee",0,18));
	peso.setFont(new Font("Sawasdee",0,18));
	regist.setFont(new Font("Purisa",Font.BOLD,40));
    
	//Ubicacion del boton
	regist.setForeground(new Color(255,255,255));
	regist.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente del boton
	nombre.setFont(new Font("Sawasdee",0,18));
	nombre.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	apellido.setFont(new Font("Sawasdee",0,18));
	apellido.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	nickname.setFont(new Font("Sawasdee",0,18));
	nickname.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	contra.setFont(new Font("Sawasdee",0,18));
	contra.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	fecha.setFont(new Font("Sawasdee",0,18));
	fecha.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	edad.setFont(new Font("Sawasdee",0,18));
	edad.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	sexo.setFont(new Font("Sawasdee",0,18));
	sexo.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	correo.setFont(new Font("Sawasdee",0,18));
	correo.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	altura.setFont(new Font("Sawasdee",0,18));
	altura.setHorizontalAlignment(JLabel.CENTER);
    
	//Ubicacion y fuente de las cajas de texto
	peso.setFont(new Font("Sawasdee",0,18));
	peso.setHorizontalAlignment(JLabel.CENTER);
    
	//Fondo, letra y tipo de letra de los botones
	registra.setFont(new Font("Sawasdee",0,20));
	registra.setForeground(Color.WHITE);
	registra.setBackground(new Color(0,76,153));
    
	//Fondo, letra y tipo de letra de los botones
	regresa.setFont(new Font("Sawasdee",0,20));
	regresa.setForeground(Color.WHITE);
	regresa.setBackground(new Color(0,76,153));
	
	//Creacion del JPanel, junto con un gridlayout (con fondo) para poder acomodar el contenido
	JPanel content = new JPanel();
	content.setLayout(new GridLayout(11,2,1,1));
	content.setBackground(new Color(224,224,224,120));

	//Se agregan todos los elementos al JPanel
	content.add(nombre);
	content.add(nom);
	content.add(apellido);
	content.add(app);
	content.add(nickname);
	content.add(nick);
	content.add(contra);
	content.add(cont);
	content.add(fecha);
	content.add(date);
	content.add(edad);
	content.add(anos);
	content.add(sexo);
	content.add(sex);
	content.add(correo);
	content.add(cor);
	content.add(altura);
	content.add(alt);
	content.add(peso);
	content.add(pes);
	content.add(registra);
	content.add(regresa);
	
	//Se implementan los action listener para realizar una accion al dar click.
	registra.addActionListener(new Register());
	regresa.addActionListener(new Regresa());
    
	//Creacion del JPanel, con su respectivo fondo.
	JPanel content1 = new JPanel();
	content1.setBackground(new Color(224,224,224,120));
	content1.setLayout(new BorderLayout());
    
	//Se agrega el contenido(botones y etiquetas con cajas de texto) al Layout
	content1.add(regist,BorderLayout.NORTH);
	content1.add(content,BorderLayout.CENTER);

	back.setLayout(new FlowLayout());
	back.add(content1);
    
	//Se agregan la accion de cerrar al dar click al JPanel, al igual que su titulo
	this.setContentPane(back);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setTitle("Sistema de Registro");
	this.setBounds(100,100,600,600);
    
    }//NEW
    
    /**
     *Clase encargada de inicializar las acciones que se realizaran al dar click en un boton.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */
    public class Register implements ActionListener{
        
        /**
	 *Metodo publico encargado crear una ventana de dialogo la cual avisara al usuario que ha sido agregado.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */ 
	public void actionPerformed(ActionEvent e){
            
	    try{
            
		//Crea la ventana, e imprime en pantalla los datos ingresados; posteriormente manda un mensaje de aviso.
		n.Alta(nom.getText(),app.getText(),nick.getText(),cont.getText(),date.getText(),sex.getText(),Integer.parseInt(anos.getText()),cor.getText(),Double.parseDouble(alt.getText()),Double.parseDouble(pes.getText()));
		JOptionPane.showMessageDialog(null,"Has sido agregado correctamente :)");
		nom.setText("");
		app.setText("");
		nick.setText("");
		cont.setText("");
		date.setText("");
		sex.setText("");
		anos.setText("");
		cor.setText("");
		alt.setText("");
		pes.setText("");
            
	    }//try
        
	    catch(Exception a){
            
	    }//catch
        
	}//actionperformed
    
    }//Registrer
  
    /**
     *Clase encargada de inicializar las acciones que se realizaran al dar click en un boton.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */  
    public class Regresa implements ActionListener{
     
	/**
	 *Metodo publico encargado crear una ventana de inicio de sesion.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */  
	public void actionPerformed(ActionEvent e){
        
	    //Destruye la ventana en la que el usuario se encuentra y crea una nueva ventana de inicio de sesion.
	    nuevo.dispose();
	    principal.setVisible(true);
        
	}//actionPerformed
    
    }//Regresa
	
}//Registrer


/**
 *Clase encargada de crear la ventana principal del usuario al iniciar sesion.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */ 
class HOLA extends JFrame{
    
    /**
     *Atributo tipo JLabel encargado de imprimir en pantalla el saludo al usuario.
     */
    private JLabel hola = new JLabel("Hola "+VARIABLES.persona);
    
    /**
     *Atributos tipo ImageIcon encargados de colocar un icono a la ventana.
     */
    private ImageIcon icono = new ImageIcon("default.png");
    private Image imagen = icono.getImage();
    private ImageIcon photo = new ImageIcon (imagen.getScaledInstance(140,90,Image.SCALE_SMOOTH));
    
    /**
     *Atributos tipo JLabel encargados de colocar la imagen de fondo.
     */
    private JLabel foto = new JLabel(photo);
    private JLabel vacio= new JLabel(" ");
    
    /**
     *Atributo tipo JButton encargado de crear un boton donde el usuario pueda ver su perfil.
     */
    private JButton ver_perfil = new JButton("Ver Perfil");
    
    /**
     *Atributo tipo JButton encargado de crear un boton donde el usuario pueda ver su perfil.
     */
    private JButton salir = new JButton("Salir");
    
    /**
     *Atributo tipo JButton encargado de crear un boton donde el usuario pueda generar una nuevo registro de una nueva actividad.
     */
    private JButton genera = new JButton("Genera");
    
    /**
     *Atributo tipo JTextField encargado de crear una caja donde el usuario pueda ingresar la actividad que desea.
     */
    private JTextField actividad = new JTextField(15);
    
    /**
     *Atributo tipo String encargado de crear las opciones que saldran en pantalla.
     */
    private String[] opciones={"Opciones: ","Calculadora de FCM","Cargar Actividad","Monitoreo"};
    
    /**
     *Atributo tipo JComboBox encargado de crear la lista de opciones que saldra en la ventana.
     */
    private JComboBox opc = new JComboBox(opciones);
    
    /**
     *Atributos tipo ImageIcon encargados de colocar un icono a la ventana.
     */
    private ImageIcon icono1 = new ImageIcon("photo.jpg");
    private Image imagen1 = icono1.getImage();
    private ImageIcon photo1 = new ImageIcon (imagen1.getScaledInstance(900,950,Image.SCALE_SMOOTH));
    
    /**
     *Atributo tipo JLabel encargado de colocar un icono a la ventana.
     */
    private JLabel back= new JLabel(photo1);
    
    /**
     *Atributo tipo JButton encargado de ofrecerle al usuario la informacion.
     */
    private JButton info = new JButton("Info");
     
    /**
     *Constructor encargado de inicializar todos los atributos de la ventana.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */  
    public HOLA(){
     
	//Tamano de la foto   
	foto.setSize(1000,1000);
    
	//Tipo de letra y color.
	hola.setFont(new Font("Purisa",Font.BOLD, 35));
	hola.setForeground(new Color(153,0,0));
    
	//Tipo de letra, color y color de fondo.
	opc.setBackground(new Color(153,0,0,150));
	opc.setFont(new Font("Sawasdee",0, 25));
	opc.setForeground(Color.WHITE);
    
	//Tipo de letra, color y color de fondo.
	ver_perfil.setFont(new Font("Sawasdee",0, 25));
	ver_perfil.setBackground(new Color(153,0,0,150));
	ver_perfil.setForeground(Color.WHITE);
    
	//Tipo de letra, color y color de fondo del boton.
	salir.setFont(new Font("Sawasdee",0, 25));
	salir.setForeground(Color.WHITE);
	salir.setBackground(new Color(153,0,0,150));
    
	//Tipo de letra, color y color de fondo.
	genera.setFont(new Font("Sawasdee",0, 25));
	genera.setBackground(new Color(153,0,0,150));
	genera.setForeground(Color.WHITE);
    
	//Tipo de letra.
	actividad.setFont(new Font("Sawasdee",0,25));
    
	//Tipo de letra, color y color de fondo.
	info.setFont(new Font("Sawasdee",0,25));
	info.setForeground(Color.WHITE);
	info.setBackground(new Color(153,0,0,150));
    
	//Implementacion del action listener en caso de que se le de click a la lista de opciones.
	opc.addActionListener(new Seleccion());

	//Creacion del JPanel e implementacion.
	JPanel content = new JPanel();
	content.setBackground(new Color(224,224,224,100));
	content.setLayout(new GridLayout(4,2,6,6));
	content.add(hola);
	content.add(foto);
	content.add(genera);
	content.add(actividad);
	content.add(opc);
	content.add(ver_perfil);
	content.add(info);
	content.add(salir);
    
	//Implementacion del action listener en caso de que se le de click a los botones.
	ver_perfil.addActionListener(new Ver());
	genera.addActionListener(new GENER());
	info.addActionListener(new INFO());
	salir.addActionListener(new Salir());
    
	//Implementacion del contenido en el Layout.
	content.setPreferredSize(new Dimension(600, 300));
	back.setLayout(new FlowLayout());
	back.add(content);
    
	//Implementacion de la ventana, junto con titulo, tamaño y accion de cerrar.
	this.setContentPane(back);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setTitle("Ventana Principal");
	this.setBounds(100,100,700,400);
    
    }//HOLA
    
    /**
     *Clase encargada de inicializar las acciones que se realizaran al dar click en en la lista de opciones.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class Seleccion implements ActionListener{
     
	/**
	 *Metodo publico encargado crear una ventana dependiendo la opcion que se seleccione.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */   
	public void actionPerformed(ActionEvent e){   
	    String select = (String)opc.getSelectedItem();
        
	    //Si la opcion es "cargar actividad" creara un nuevo JFrame con las actividades existentes.
	    if(select.equals("Cargar Actividad")){
            
		JFrame act = new ACTIVIDAD();
		act.setVisible(true);
        
	    }//actionPerformed
        
	    //Abrira la calculadora.
	    else if(select.equals("Calculadora de FCM")){
		JFrame calc = new CALC();
		calc.setVisible(true);
	    
	    }//elseif
        
	    //Abrira la ventana del monitoreo.
	    else if(select.equals("Monitoreo")){
		JFrame mon = new MONITOREO();
		mon.setVisible(true);
	    
	    }//elseif
        
	}//actionperformed
   
    }//Seleccion
    
    /**
     *Clase encargada de inicializar una ventana en caso de que se diera click al boton "ver perfil".
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class Ver implements ActionListener{
	
	/**
	 *Metodo encargado de abrir una ventana con la informacion personal del usuario
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */
	public void actionPerformed(ActionEvent e){
	    JFrame perfil = new VER();
	    perfil.setVisible(true);
	
	}//actionperformed
    
    }//Ver
    
    /**
     *Clase encargada de inicializar las acciones que se realizaran al dar click en la opcion"nueva actividad".
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class GENER implements ActionListener{
	
	/**
	 *Metodo encargado de abrir una ventana para poder crear una nueva actividad del usuario.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */
	public void actionPerformed(ActionEvent e){
	
	    try {
		String ACT = actividad.getText();
		Actividad a = new Actividad();
	
		//Crea una actividad "Natacion"
		if(ACT.equals("Natacion")){
		    a.Natacion(VARIABLES.persona);
		
		}//if
        
		//Crea una actividad "Carrera"
		else if(ACT.equals("Carrera")){
		    a.Carrera(VARIABLES.persona);
		
		}//elseif
        
		//Crea una actividad "Caminata"
		else if(ACT.equals("Caminata")){
		    a.Caminata(VARIABLES.persona);
		
		}//elseif
        
		//Crea una actividad "Bicicleta"
		else if(ACT.equals("Bicicleta")){
		    a.Bicicleta(VARIABLES.persona);
		
		}//elseif
		
		//Una vez creada la actividad, muestra un mensaje avisando al usuario que la actividad deseada fue creada.
		JOptionPane.showMessageDialog(null,"La actividad "+ACT+" ha sigo generada correctamente..");
		actividad.setText("");
	    
	    }//try
        
	    //En caso de que no se pueda crear, marcara un mensaje de error.
	    catch(Exception a){
		System.out.println(a.getMessage());
	    
	    }//catch
        
	}//actionperformed
    
    }//Gener
    
    /**
     *Clase encargada de inicializar una ventana con la informacion general del sistema.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class INFO  implements ActionListener{
       
	/**
	 *Metodo encargado de abrir una ventana para poder visualizar la informacion general del sistema.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */ 
	public void actionPerformed(ActionEvent e){
	    JFrame infor = new INFORMACION();
	    infor.setVisible(true);
        
	}//actionperformed
    
    }//INFO

    /**
     *Clase encargada de salir del sistema al dar click en el boton "salir".
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class Salir implements ActionListener{
     
	/**
	 *Metodo encargado de salir del sistema al dar click en el boton.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */    
	public void actionPerformed(ActionEvent e){
	    System.exit(0);
	
	}//actionPerformed
    
    }//Salir

}//HOLA

/**
 *Clase encargada de inicializar una ventana con la informacion general del sistema.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */ 
class INFORMACION extends JFrame{
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info= new JLabel("Más información");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info1= new JLabel("Bienvenido al monitoreo de salud instantaneo");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info2= new JLabel("Aqui te daremos una explicacion breve de la app.");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info3= new JLabel("Tu como parte de nuetsra app puedes realizar multiples");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info4= new JLabel("tareas y tener el control de estos.");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info5= new JLabel("1.Monitoreo- Puedes checar el resumen de tus actividades");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info6= new JLabel("realizadas con sus graficas.");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info7= new JLabel("2.Calculadora- De acuerdo a tus datos podras ver tus indice de");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info8= new JLabel("masa corporal y entre otros datos con los datos ingresados en el registro");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info9= new JLabel("3.Perfil- Tu como usuario puedes checar tu perfil y de ");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info10= new JLabel("igual forma actualizar tu informacion.");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info11= new JLabel("4.Cargar Actividad- Tu como usuario puedes cargar la act.");
    
    /**
     *Atributo tipo JLabel la cual contiene informacion relevante del sistema.
     */
    private JLabel info12= new JLabel("deseada ya sea natacion, caminata, carrera, y bicicleta");

    /**
     *Constructor encargado de inicializar los atributos de la ventana.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public INFORMACION(){
      
	//Fuente y ubicacion de la etiqueta.   
	info.setFont(new Font("Purisa",Font.BOLD,40));
	info.setHorizontalAlignment(JTextField.CENTER);
    
	//Fuente y ubicacion de la etiqueta.
	info1.setFont(new Font("Sawasdee",0, 16));
	info1.setHorizontalAlignment(JTextField.CENTER);
    
	//Fuente y ubicacion de la etiqueta.
	info2.setFont(new Font("Sawasdee",0, 16));
	info2.setHorizontalAlignment(JTextField.CENTER);
    
	//Fuente y ubicacion de la etiqueta.
	info3.setHorizontalAlignment(JTextField.CENTER);
	info3.setFont(new Font("Sawasdee",0, 16));
	
	//Fuente y ubicacion de la etiqueta.
	info4.setHorizontalAlignment(JTextField.CENTER);
	info4.setFont(new Font("Sawasdee",0, 16));
	
	//Fuente y ubicacion de las etiquetas.
	info5.setFont(new Font("Sawasdee",0, 16));
	info6.setFont(new Font("Sawasdee",0, 16));
	info7.setFont(new Font("Sawasdee",0, 16));
	info8.setFont(new Font("Sawasdee",0, 16));
	info9.setFont(new Font("Sawasdee",0, 16));
	info10.setFont(new Font("Sawasdee",0, 16));
	info11.setFont(new Font("Sawasdee",0, 16));
	info12.setFont(new Font("Sawasdee",0, 16));

	//Creacion del JPanel, junto con su fondo y GridLayout.
	JPanel content = new JPanel();
	content.setBackground(new Color(255,102,102));
	content.setLayout(new GridLayout(13,1,0,0));
	
	//Anade las etiquetas al JPanel.
	content.add(info);
	content.add(info1);
	content.add(info2);
	content.add(info3);
	content.add(info4);
	content.add(info5);
	content.add(info6);
	content.add(info7);
	content.add(info8);
	content.add(info9);
	content.add(info10);
	content.add(info11);
	content.add(info12);
	

	//Crea la barra de desplazamiento de navegacion para el JPanel.
	JScrollPane Pane = new JScrollPane();
	Pane.setViewportView(content);

	//Crea el titulo a la ventana, junto con la accion de "cerrar".
	this.setLayout(new FlowLayout());
	this.setContentPane(Pane);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setTitle("Más Información");
	this.setBounds(100,100,600,450);

	
    }//INFORMACION

}//INFORMACION

/**
 *Clase encargada de crear la ventana donde contendra todas las actividades.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */ 
class ACTIVIDAD extends JFrame{

    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel label = new JLabel("Cargar");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel vacio = new JLabel(" ");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel vacio1= new JLabel(" ");
    
    /**
     *Atributo tipo String encargado de crear las opciones que se podran visualizar en la lista.
     */
    private String[] opciones={"Opciones: ","Caminata","Natacion","Carrera","Bicicleta"};
    
    /**
     *Atributo tipo JComboBox encargado de crear la lista de opciones de actividad.
     */
    private JComboBox opc= new JComboBox(opciones);
    
    /**
     *Atributo tipo JButton encargado de crear el boton..
     */
    private JButton aceptar= new JButton("Aceptar");
    
    /**
     *Atributo tipo ImageIcon encargado de colocar la imagen a la ventana
     */
    private ImageIcon icono1 = new ImageIcon("swim.jpg");
    
    /**
     *Atributo encargado de colocar la imagen a la ventana
     */
    private Image imagen1 = icono1.getImage();
    
    /**
     *Atributo tipo ImageIcon encargado de colocar la imagen a la ventana
     */
    private ImageIcon photo1 = new ImageIcon (imagen1.getScaledInstance(900,950,Image.SCALE_SMOOTH));
    
    /**
     *Atributo tipo JLabel encargado de crear el espacio donde se colocara la imagen
     */
    private JLabel back= new JLabel(photo1);
    
    /**
     *Atributo para poder agrupar los botones con las opciones.
     */
    private ButtonGroup group=null;
    
    /**
     *Atributo tipo JPanel para poder colocar el contenido en la ventana.
     */
    private JPanel content1 = null,content3=null;

    /**
     *Constructor encargado de inicializar los atributos de la ventana de actividades.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public ACTIVIDAD(){
        
	//Tipo de fuente y color de fuente.    
	label.setFont(new Font("Purisa",Font.BOLD,40));
	label.setForeground(new Color(0,0,0));
    
	//Tipo de fuente y color de fuente.
	opc.setFont(new Font("Sawasdee",0,25));
	opc.setBackground(new Color(245,231,39));
    
	//Tipo de fuente y color de fuente.
	aceptar.setBackground(new Color(245,231,39));
	aceptar.setFont(new Font("Sawasdee",0,30));

	//Creacion y fondo del JPanel.
	JPanel content = new JPanel();
	content.setBackground(new Color(224,224,224,100));
	content.setLayout(new GridLayout(1,2,4,4));
	
	//Agrega la etiqueta y las opciones al JPanel.
	content.add(label);
	content.add(opc);

	//Buscador de archivos
	content1= new JPanel();
	content1.setBackground(new Color(224,224,224,80));
	content1.setLayout(new GridLayout(6,1,1,4));
	content1.setPreferredSize(new Dimension(200, 100));
	content1.add(vacio1);
	
	//Creacion y fondo del JPanel.
	JPanel content2 = new JPanel();
	content2.setBackground(new Color(224,224,224,100));
	content2.setLayout(new GridLayout(1,2,1,6));

	//Agrega el contenido al JPanel.
	content2.add(vacio);
	content2.add(aceptar);

	//Creacion y fondo del JPanel.
	content3 = new JPanel();
	content3.setBackground(new Color(224,224,224,100));
	content3.setLayout(new BorderLayout());
	
	//Agrega el contenido al JPanel.
	content3.add(content,BorderLayout.NORTH);
	content3.add(content1,BorderLayout.CENTER);
	content3.add(content2,BorderLayout.SOUTH);

	//Agrega los action Listener a los radio button y al boton de aceptar.
	opc.addActionListener(new Seleccion1());
	aceptar.addActionListener(new Acepta());

	//Coloca el contenido, titulo, tamano y la accion de cerrar en la ventana.
	back.setLayout(new FlowLayout());
	back.add(content3);
	this.setContentPane(back);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setTitle("Carga Actividad");
	this.setBounds(100,100,600,300);
  
    }//ACTIVIDAD

    /**
     *Metodo encargado de agregar la opcion deseada
     *@param JPanel El panel que se agregara
     *@param ButtonGroup El conjnto de radiobuttons.
     *@param String La actividad deseada.
     */
    public void addOption(JPanel p, ButtonGroup g, String t) {	
  
	//Creacion de botones y se les fija la accion que se realizara dependiendo del boton seleccionado.
	JRadioButton b = new JRadioButton(t);
	b.setActionCommand(t);
    
	//Se coloca fuente y fondo.
	b.setFont(new Font("Sawasdee",0,13));
	b.setBackground(new Color(224,224,224,90));
	//Se agrega el comando deseado.
	p.add(b);
	g.add(b);
  
    }//addOption
    
     /**
      *Clase encargada de crear las acciones dependiendo la opcion seleccionada.
      *
      *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
      *@version 2.0
      *@since 27/04/2016
      *
      */ 
    public class Seleccion1 implements ActionListener{
	
	/**
	 *Metodo encargado de abrir una ventana para poder crear una nueva actividad.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */
	public void actionPerformed(ActionEvent e){
        
	    VARIABLES.select = (String)opc.getSelectedItem();
	    File f= null;
	    File[] ficheros= null;
        
	    //Abre la carpeta correspondiente a la actividad y crea una nueva.
        
	    if(VARIABLES.select.equals("Natacion")){
		f= new File("/home/ic14dpm/JAVA/PROYECTO/"+VARIABLES.persona+"/ActividadN/Natacion");
		ficheros=f.listFiles();
		group = new ButtonGroup();
        
		content1.removeAll();
		content1.add(vacio1);
        
		for(int x=0;x<ficheros.length;x++){
		    addOption(content1,group,ficheros[x].getName());
		
		}//for
        
		//Actualiza el contenido.
        
		SwingUtilities.updateComponentTreeUI(content1);
	    
	    }//if
        
	    else if(VARIABLES.select.equals("Caminata")){
		f= new File("/home/ic14dpm/JAVA/PROYECTO/"+VARIABLES.persona+"/ActividadN/Caminata");
		ficheros=f.listFiles();
		group = new ButtonGroup();
        
		content1.removeAll();
		content1.add(vacio1);
        
		for(int x=0;x<ficheros.length;x++){
		    addOption(content1,group,ficheros[x].getName());
		
		}//for
        
		SwingUtilities.updateComponentTreeUI(content1);
	    
	    }//elseif
        
	    else if( VARIABLES.select.equals("Carrera")){
		f= new File("/home/ic14dpm/JAVA/PROYECTO/"+VARIABLES.persona+"/ActividadN/Carrera");
		ficheros=f.listFiles();
		group = new ButtonGroup();
        
		content1.removeAll();
		content1.add(vacio1);
		
		for(int x=0;x<ficheros.length;x++){
		    addOption(content1,group,ficheros[x].getName());
		
		}//for
		
		SwingUtilities.updateComponentTreeUI(content1);
	    
	    }//elseif
        
	    else if( VARIABLES.select.equals("Bicicleta")){
		f= new File("/home/ic14dpm/JAVA/PROYECTO/"+VARIABLES.persona+"/ActividadN/Bicicleta");
		ficheros=f.listFiles();
		group = new ButtonGroup();
		
		content1.removeAll();
		content1.add(vacio1);
		
		for(int x=0;x<ficheros.length;x++){
		    addOption(content1,group,ficheros[x].getName());
		
		}//for
		
		SwingUtilities.updateComponentTreeUI(content1);
	    
	    }//elseif
	
	}//actionperformed
    
    }//Seleccion1
    
    public class Acepta implements ActionListener{
	public void actionPerformed(ActionEvent e){
	    ButtonModel b = group.getSelection();
	    String t = "";
	    Actividad act= new Actividad();
        
	    try{
		if (b!=null){
		    t = b.getActionCommand();
		    VARIABLES.moni=t;
		    act.Carga_Actividad(VARIABLES.persona,t,(String)opc.getSelectedItem());
		    JOptionPane.showMessageDialog(null,"Su actividad ha sido agregada correctamente");
		    dispose();
		
		}//if
        
		else{
		    JOptionPane.showMessageDialog(null,"No ha seleccionado ninguna Actividad..");
		
		}//else
        
	    }//try
        
	    catch(Exception a){
            
	    }//catch
	    
	}//actionperformed
    
    }//Acepta

}//Acepta
	
/**
 *Clase encargada de crear las ventana de la calculadora de la frecuencia cardiaca maxima.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
class CALC extends JFrame{

    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel label = new JLabel("Calculadora");
   
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel label1= new JLabel ("Bienvenido aqui puedes \n ver tu frecuencia cardiaca maxima");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel FCM = new JLabel("FCM: ");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel zona1 = new JLabel("ZONA 1:");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel zona2 = new JLabel("ZONA 2:");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel zona3 = new JLabel("ZONA 3:");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel zona4 = new JLabel("ZONA 4:");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel IMC = new JLabel("IMC :");
    
    /**
     *Atributo tipo JTextField encargado de crear el cuadro de texto donde el usuario podra ingresar los datos correspondientes.
     */
    private JTextField fcm= new JTextField(5);
    
    /**
     *Atributo tipo JTextField encargado de crear el cuadro de texto donde el usuario podra ingresar los datos correspondientes.
     */
    private JTextField z1= new JTextField(5);
    
    /**
     *Atributo tipo JTextField encargado de crear el cuadro de texto donde el usuario podra ingresar los datos correspondientes.
     */
    private JTextField z2= new JTextField(5);
    
    /**
     *Atributo tipo JTextField encargado de crear el cuadro de texto donde el usuario podra ingresar los datos correspondientes.
     */
    private JTextField z3= new JTextField(5);
    
    /**
     *Atributo tipo JTextField encargado de crear el cuadro de texto donde el usuario podra ingresar los datos correspondientes.
     */
    private JTextField z4= new JTextField(5);
    
    /**
     *Atributo tipo JTextField encargado de crear el cuadro de texto donde el usuario podra ingresar los datos correspondientes.
     */
    private JTextField imc= new JTextField(5);
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel vacio= new JLabel();
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel n = new JLabel("100%");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel n1 = new JLabel("50-60%");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel n2 = new JLabel("60-70%");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel n3 = new JLabel("70-80%");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel n4 = new JLabel("80-90%");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel n5 = new JLabel("Indice de masa corporal");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta que contendra la imagen.
     */
    private JLabel back= new JLabel(new ImageIcon("imagen1.png"));

    /**
     *Constructor encargado de inicializar todos los atributos de la calculadora.
     **/
    public CALC(){
    
	//Fuente, posicion y color de fuente    
	label.setFont(new Font("Purisa",Font.BOLD,40));
	label.setForeground(new Color(255,128,0));
	label.setHorizontalAlignment(JLabel.CENTER);
    
	//Fuente, posicion y color de fuente   
	label1.setFont(new Font("Sawasdee",0,18));
	label1.setHorizontalAlignment(JLabel.CENTER);
    
	//Fuente, posicion y color de fuente   
	FCM.setFont(new Font("Sawasdee",0,15));
	FCM.setHorizontalAlignment(JLabel.RIGHT);
    
	//Fuente, posicion y color de fuente   
	zona1.setFont(new Font("Sawasdee",0,15));
	zona1.setHorizontalAlignment(JLabel.RIGHT);
    
	//Fuente, posicion y color de fuente   
	zona2.setFont(new Font("Sawasdee",0,15));
	zona2.setHorizontalAlignment(JLabel.RIGHT);
    
	//Fuente, posicion y color de fuente   
	zona3.setFont(new Font("Sawasdee",0,15));
	zona3.setHorizontalAlignment(JLabel.RIGHT);
    
	//Fuente, posicion y color de fuente   
	zona4.setFont(new Font("Sawasdee",0,15));
	zona4.setHorizontalAlignment(JLabel.RIGHT);
    
	//Fuente, posicion y color de fuente   
	IMC.setFont(new Font("Sawasdee",0,15));
	IMC.setHorizontalAlignment(JLabel.RIGHT);
    
	//Creacion del JPanel el cual contendra todos los elementos.   
	JPanel content = new JPanel();
    
	//Coloca el color del fondo, y el GridLayout.
	content.setBackground(new Color(224,224,224,100));
	content.setLayout(new GridLayout(6,3,4,4));
	
	//Agrega todos los elemntos al JPanel.
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
    
	//Posicion de los elementos.
	fcm.setHorizontalAlignment(JTextField.CENTER);
	z1.setHorizontalAlignment(JTextField.CENTER);
	z2.setHorizontalAlignment(JTextField.CENTER);
	z3.setHorizontalAlignment(JTextField.CENTER);
	z4.setHorizontalAlignment(JTextField.CENTER);
	imc.setHorizontalAlignment(JTextField.CENTER);
    
	//Indica el formato de los elementos, y con cuantos decimales.
	DecimalFormat df = new DecimalFormat("000.00"); 
	DecimalFormat df1 = new DecimalFormat("00.00");
    
	try{
	    Calculadora c= new Calculadora(VARIABLES.persona);
	    fcm.setText(String.valueOf(c.FCM()));
	    double[] zone = new double[5];
	    zone=c.Zonas();
	
	    //Coloca el valor de las zonas en la ventana.
	    z1.setText(String.valueOf(df1.format(zone[0]))+"-"+String.valueOf(df.format(zone[1])));
	    z2.setText(String.valueOf(df.format(zone[1]))+"-"+String.valueOf(df.format(zone[2])));
	    z3.setText(String.valueOf(df.format(zone[2]))+"-"+String.valueOf(df.format(zone[3])));
	    z4.setText(String.valueOf(df.format(zone[3]))+"-"+String.valueOf(df.format(zone[4])));
	
        
	    //Dependiendo del valor, se coloca una leyenda con la zona en la que se encuentra el usuario.
	    if(c.IMC()<18.5){
		imc.setText(String.valueOf(df1.format(c.IMC()))+" /Peso Bajo");
	    
	    }//if
        
	    else if(c.IMC()>18.5&&c.IMC()<24.9){
            
		imc.setText(String.valueOf(df1.format(c.IMC()))+" /Peso Normal");
	    
	    }//elseif
        
	    else if(c.IMC()>25&&c.IMC()<29.9){
		imc.setText(String.valueOf(df1.format(c.IMC()))+" /Sobrepeso");
	   
	    }//elseif
        
	    else if(c.IMC()>30&&c.IMC()<34.9){
		imc.setText(String.valueOf(df1.format(c.IMC()))+" /Obesidad grado 1");
	    
	    }//elseif
        
	    else if(c.IMC()>35&&c.IMC()<39.9){
		imc.setText(String.valueOf(df1.format(c.IMC()))+" /Obesidad grado 2");
	    
	    }//elseif
        
	    else if(c.IMC()>=40){
		imc.setText(String.valueOf(df1.format(c.IMC()))+" /Obesidad grado 3");
	   
	    }//elseif
        
	}//try
    
	//En caso de que no exista la persona, marcara un mensaje de error. 
	catch(Exception x){
	    System.out.println("No existe persona");
	}//catch
    
	//Creacion del JPanel, con su respectivo color el cual contendra las zonas.
	JPanel content1 = new JPanel();
	content1.setBackground(new Color(224,224,224,100));
	content1.setLayout(new GridLayout(2,1,1,1));

    
	//Agrega los elemetos al JPanel.
	content1.add(label);
	content1.add(label1);

	//Creacion del JPanel, con su respectivo color el cual contendra las zonas.
	JPanel content2 = new JPanel();
	content2.setBackground(new Color(224,224,224,100));
	content2.setLayout(new GridLayout(1,3,100,1));

	//Agrega los elemetos al JPanel.
	content2.add(vacio);
	content2.add(vacio);
	
    
	//Creacion del JPanel, con su respectivo color el cual contendra las zonas.
	JPanel content3 = new JPanel();
	content3.setBackground(new Color(224,224,224,100));
	content3.setLayout(new BorderLayout());
	
	//Agrega los elemetos al JPanel.
	content3.add(content1,BorderLayout.NORTH);
	content3.add(content,BorderLayout.WEST);
	content3.add(content2,BorderLayout.SOUTH);

	//Coloca el contenido en el Layout.
	back.setLayout(new FlowLayout());
	back.add(content3);
	
	//Se coloca el contenido, con su respectivo titulo y accion de cerrar. 
	this.setContentPane(back);
	this.pack();
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setBounds(100,100,532,350);
	this.setTitle("Calculadora.PROYECTO_FINAL");
    
    }//calc

}//calc

/**
 *Clase encargada de crear la ventana donde el usuario podra editar sus datos personales.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */ 
class VER extends JFrame{
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel ver = new JLabel("Ver Perfil");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */
    private JLabel vacio = new JLabel("");
  
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta.
     */  
    private JButton cambia = new JButton("Cambiar Datos");
  
    /**
     *Atributo tipo JTable encargado de crear la tabla.
     */  
    private JTable tabla;
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta que contendra la imagen.
     */
    private JLabel back= new JLabel(new ImageIcon("Track.jpg"));
    
    /**
     *Atributo tipo Datos donde se almacenaran todos los datos de informacion personal que existen almacenados del usuario.
     */
    private Datos a;
    
    /**
     *Atributo tipo Usuarios donde se almacenaran todos los usuarios.
     */
    private Usuarios b;
    
    /**
     *Constructor encargado de inicializar los atributos de la ventana.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public VER(){
	
	b= new Usuarios();
    
	//Tipo de letra y posicion
	ver.setFont(new Font("Purisa",0,40));
	ver.setHorizontalAlignment(JTextField.CENTER);
	
	//Tipo de letra
	cambia.setFont(new Font("Sawasdee",0,18));
	
	ver.setForeground(new Color(102,0,0));
	
	//Tipo de letra y posicion
	cambia.setBackground(new Color(102,0,0));
	cambia.setForeground(new Color(255,255,255));
	
	try{
	    a=b.Visualizacion(VARIABLES.persona);
	    String[] column={"Nombre: ",a.getNombre()};
	    Object[][] data={{"Nombre: ",a.getNombre()},{"Apellido: ",a.getApellido()},{"Nickname: ",a.getNick()},{"Contrasena: ",a.getContrasena()},{"Fecha de nacimiento: ",a.getFecha()},{"Sexo: ",a.getSexo()},{"Edad: ",String.valueOf(a.getEdad())},{"Correo electronico: ",a.getCorreo()},{"Fecha de registro: ",a.getFecha_r()},{"Altura: ",String.valueOf(a.getALtura())},{"Peso: ",String.valueOf(a.getPeso())}};
	    
	    //Creacion de la tabla
	    tabla = new JTable(data,column);
	    
	    tabla.setFont(new Font("URW Gothic L",Font.BOLD,15));
	    tabla.setBackground(new Color(224,224,224,100));
	
	    //Creacion del JPanel
	    JPanel content = new JPanel();
	    content.setBackground(new Color(224,224,224,100));
	    content.setLayout(new GridLayout(1,2,1,5));
	
	    //Agrega los elementos al JPanel
	    content.add(cambia);
	    content.add(vacio);
	    
	    //Creacion del JPanel y agrega los elementos.
	    JPanel content1 = new JPanel();
	    content1.setBackground(new Color(224,224,224,120));
	    content1.setPreferredSize(new Dimension(350, 300));
	    content1.setLayout(new BorderLayout());
	    content1.add(ver,BorderLayout.NORTH);
	    content1.add(tabla,BorderLayout.CENTER);
	    content1.add(content,BorderLayout.SOUTH);
	
	    //Se implementa el actionListener
	    cambia.addActionListener(new Cambia());
	
	    back.setLayout(new FlowLayout());
	    back.add(content1);
	
	    //Se implementa todo, al igual que el titulo de la ventana. 
	    this.setContentPane(back);
	    this.pack();
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    this.setBounds(100,100,400,350);
	    this.setTitle("Informacion del usuario");
	
	}//try
    
	//En caso de que el usuario no exista, mandara un mensaje de error.
	catch(Exception x){
	    System.out.println("Usuario no existe");
	    System.out.println(x.getMessage());
	}//catch
    
    }//VER
    
    /**
     *Clase encargada de los acciones que realizara la ventana de edicion del perfil al darle click.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class Cambia implements ActionListener{
     
	/**
	 *Metodo encargado de crear la ventana para cambiar los datos al dar click en el boton.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */    
	public void actionPerformed(ActionEvent e){
	    dispose();
	    JFrame mod = new CAMBIA();
	    mod.setVisible(true);
	
	}//cambia
    
    }//cationperformed
    
}//ver

/**
 *Clase encargada crear la ventana para poder cambiar datos personales.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */ 
class CAMBIA extends JFrame{
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel perfil = new JLabel("Cambia Perfil");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel select= new JLabel("Seleccione");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel vacio1= new JLabel("");
    
    /**
     *Atributo tipo String encargado de almacenar las opciones existentes.
     */
    private String[] opciones={"Opciones: ","Nombre","Apellido","Nick","Contrasena","Fecha de Nacimiento","Sexo","Edad","Correo","Altura","Peso"};
    
    /**
     *Atributo encargado de crear la lista de opciones.
     */
    private JComboBox opc = new JComboBox(opciones);
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel mod = new JLabel("Modificacion");
    
    /**
     *Atributo tipo JTextField encargado de crear la caja de texto correspondiente.
     */
    private JTextField text = new JTextField(10); 
    
    /**
     *Atributo tipo JButton encargado de crear el boton correspondiente.
     */
    private JButton modifica = new JButton("Modifica");
    
    /**
     *Atributo tipo JButton encargado de crear el boton correspondiente.
     */
    private JButton elimina = new JButton("Eliminar Perfil");
    
    /**
     *Atributo tipo ImageIcon encargado de colocar la imagen correspondiente.
     */
    private ImageIcon icono1 = new ImageIcon("climb.jpg");
    /**
     *Atributo tipo ImageIcon encargado de colocar la imagen correspondiente.
     */
    private Image imagen1 = icono1.getImage();
    /**
     *Atributo tipo ImageIcon encargado de colocar la imagen correspondiente.
     */
    private ImageIcon photo1 = new ImageIcon (imagen1.getScaledInstance(800,400,Image.SCALE_SMOOTH));
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente para la imagen.
     */
    private JLabel back= new JLabel(photo1);
    
    /**
     *Atributo tipo Usuarios encargado de almacenar los usuarios existentes.
     */
    private Usuarios b;

    /**
     *Constructor encargado de los acciones que realizara la ventana de edicion del perfil al darle click.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */
    public CAMBIA(){
        
	b= new Usuarios();
    
	//Tipo de fuente y posicion
	perfil.setFont(new Font("Purisa",0,40));
	perfil.setHorizontalAlignment(JTextField.CENTER);
	select.setFont(new Font("Sawasdee",0,20));
	select.setHorizontalAlignment(JTextField.CENTER);
	opc.setFont(new Font("Sawasdee",0,20));
	mod.setFont(new Font("Sawasdee",0,20));
	mod.setHorizontalAlignment(JTextField.CENTER);
	text.setFont(new Font("Sawasdee",0,18));
	modifica.setFont(new Font("Sawasdee",0,20));
	elimina.setFont(new Font("Sawasdee",0,20));
	perfil.setForeground(new Color(255,255,102));
	
	//Color de fondo de cada elemento
	opc.setBackground(new Color(255,255,102,150));
	modifica.setBackground(new Color(255,255,102,150));
	elimina.setBackground(new Color(255,255,102,150));
		
	//Creacion del JPanel con su respectivo fondo y GridLayout    
	JPanel content= new JPanel();
	content.setBackground(new Color(224,224,224,120));
	content.setLayout(new GridLayout(4,2,5,5));
	
	//Agrega los elementos al JPanel
	content.add(perfil);
	content.add(elimina);
	content.add(select);
	content.add(opc);
	content.add(mod);
	content.add(text);
	content.add(vacio1);
	content.add(modifica);
	
	//Implementa los actionListener a los botones
	elimina.addActionListener(new Elimina());
	modifica.addActionListener(new Modifica());
	
	back.setLayout(new FlowLayout());
	back.add(content);

	//Se implementa el contenido junto con su titulo a la ventanq.
	this.setContentPane(back);
	this.pack();
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setBounds(100,100,800,330);
	this.setTitle("Modificacion del perfil");
   
    }//CAMBIA
   
    /**
     *Clase encargada de los acciones que realizara la ventana de edicion del perfil al darle click.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class Modifica implements ActionListener{
    
	/**
	 *Metodo encargado de crear mensajes de dialogo en caso de que se haya modificado de manera correcta.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */
	public void actionPerformed(ActionEvent e){
	   
	    try{
		b.Modificacion(VARIABLES.persona,(String)opc.getSelectedItem(),text.getText());
		JOptionPane.showMessageDialog(null,"Se modifico correctamente");
		//Desaparece la ventana
		dispose();
	    
	    }//try
        
	    catch(Exception a){
		System.out.println("Hubo un problema");
	    
	    }//catch
	    
	}//actionPerformed
    
    }//Modifica
    
    /**
     *Clase encargada de los acciones que realizara la ventana de baja de perfil al darle click.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class Elimina implements ActionListener{
	/**
	 *Metodo encargado de crear mensajes de dialogo en caso de que se haya dado de baja de manera correcta.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */
	public void actionPerformed(ActionEvent e){
	    try{
		b.Baja(VARIABLES.persona);
		JOptionPane.showMessageDialog(null,"Se dio de baja correctamente");
		System.exit(0);
	    
	    }//try
        
	    catch(Exception a){
		System.out.println("Hubo un problema");
	    
	    }//catch
	
	}//actionPerformed
    
    }//Elimina
    
}//CAMBIA

/**
 *Clase encargada crear la ventana para poder ver el monitoreo.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */  
class MONITOREO extends JFrame{
    
    /**
     *Atributo tipo JButton encargado de crear el boton correspondiente.
     */
    private JButton resumen= new JButton ("Resumen");
     
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel label = new JLabel("Monitoreo");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel minimo1 = new JLabel("Minimo");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel maximo1 = new JLabel("Maximo");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel vacio = new JLabel("  ");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel promedio1 = new JLabel("Promedio");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel tiempo1 = new JLabel("Tiempo");
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel dist_t = new JLabel("Distancia vs Tiempo");
     
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel rit_t = new JLabel("Ritmo vs Tiempo");
    
    /**
     *Atributo tipo ImagenIcon encargado de colocar la imagen.
     */
    private ImageIcon icono1 = new ImageIcon("foot.png");
   
    /**
     *Atributo tipo ImagenIcon encargado de colocar la imagen.
     */
    private Image imagen1 = icono1.getImage();
    
    /**
     *Atributo tipo ImagenIcon encargado de colocar la imagen.
     */
    private ImageIcon photo1 = new ImageIcon (imagen1.getScaledInstance(700,500,Image.SCALE_SMOOTH));
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */ 
    private JLabel back= new JLabel(photo1);
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel maximo;
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel minimo;
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel promedio;
    
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel tiempototal;
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel act = new JLabel("Actividad: ");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel acti;
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel ca = new JLabel("Calorias: ");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel ca2;
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel d = new JLabel("Distancia: ");
    /**
     *Atributo tipo JLabel encargado de crear la etiqueta correspondiente.
     */
    private JLabel d2;
    /**
     *Atributo tipo JFile Reader encargado de poder leer el archivo.
     */
    private FileReader f=null;
    
    /**
     *Atributo tipo String encargado de almacenar la informacion que no sea necesaria para el monitoreo.
     */
    private String basura="";
    
    /**
     *Atributo tipo integer encargado de almacenar la distancia.
     */
    private int dist;
    
    /**
     *Atributo tipo double encargado de almacenar los minutos.
     */
    private double min;
   
    /**
     *Atributo tipo double encargado de almacenar el tiempo.
     */
    private double time;
    
    /**
     *Atributo tipo int encargado de almacenar el ritmo caridaco.
     */
    private int rithm;
    
    /**
     *Atributo tipo int encargado de almacenar las calorias.
     */
    private int cal;
    
    /**
     *Atributo tipo JPanel encargado de crear el Jpanel para las graficas.
     */
    private JPanel dist_temp =null;
    /**
     *Atributo tipo JPanel encargado de crear el Jpanel para las graficas.
     */
    private JPanel rithm_temp = null;
  
    /**
     *Constructor encargado de inicializar los atributos.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public MONITOREO(){
	try{
	    //Tipo de letra y Posicion
	    label.setFont(new Font("Purisa",0,40));
	    label.setHorizontalAlignment(JTextField.CENTER);
        
	    //Tipo de letra y Posicion
	    resumen.setFont(new Font("Sawasdee",0,20));
	    minimo1.setFont(new Font("Sawasdee",0,18));
	    maximo1.setFont(new Font("Sawasdee",0,18));
	    promedio1.setFont(new Font("Sawasdee",0,18));
	    tiempo1.setFont(new Font("Sawasdee",0,18));
	    
	    //Tipo de letra y Posicion
	    dist_t.setFont(new Font("Sawasdee",0,18));     
	    dist_t.setHorizontalAlignment(JTextField.CENTER);
        
	    //Tipo de letra y Posicion
	    rit_t.setFont(new Font("Sawasdee",0,18));   
	    rit_t.setHorizontalAlignment(JTextField.CENTER);
        
	    label.setForeground(new Color(153,76,0));
        
	    resumen.setBackground(new Color(153,76,0));
	    resumen.setForeground(new Color(255,255,255));
        
	    //Lee el archivo
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+VARIABLES.persona+"/ActividadC/"+VARIABLES.select+"/"+VARIABLES.moni);
        
	    Scanner src = new Scanner(f);
	    int i=0,h=1,cont=0;
	    int prom=0;
	    int[] r= new int[3000];
	    int[] t= new int[3000];
        
	    basura=src.nextLine();
	    acti=new JLabel(basura);
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Lee los datos necesarios para la grafica
	    min=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    d2= new JLabel(String.valueOf(dist)+" m");
	    cal=Integer.parseInt(src.nextLine());
	    ca2 = new JLabel(String.valueOf(cal)+ " cal");
	    time=Double.parseDouble(src.nextLine());
	    int max=Integer.parseInt(src.nextLine());
	    int mini=max;
	    prom=prom+max;
	    t[i]=(int)time;
	    r[i]=max;
        
	    //Lee los datos necesarios para la grafica
	    while(src.hasNextLine()){
            
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
        
		if(rithm>max){
		    max=rithm;
		
		}//if
        
		if(rithm<mini){
		    mini=rithm;
		
		}//if
        
		prom=prom+rithm;
		i++;
        
		if(cont==10){
		    t[h]=(int)time;
		    r[h]=rithm;
		    cont=1;
		    h++;
		
		}//if
        
		cont++;
        
	    }//while
        
	    //Crea la grafica correspondiente
	    dist_temp = new GRAFICA_DVT(dist,min);
	    dist_temp.setPreferredSize(new Dimension(20, 20));
	    
	    rithm_temp= new GRAFICA_RVT(r,t,(int)min);
	    rithm_temp.setPreferredSize(new Dimension(10, 50));

	    //Coloca los valores correspondientes en las etiquetas
	    maximo=new JLabel(String.valueOf(max)+" l/s");
	    minimo=new JLabel(String.valueOf(mini)+" l/s");
	    promedio=new JLabel(String.valueOf(prom/i)+ " l/s" );
	    tiempototal=new JLabel(String.valueOf(min)+" m"); 
	    
	    //Posicion
	    maximo1.setHorizontalAlignment(JTextField.CENTER);
	    minimo1.setHorizontalAlignment(JTextField.CENTER);
	    promedio1.setHorizontalAlignment(JTextField.CENTER);
	    tiempo1.setHorizontalAlignment(JTextField.CENTER);
	    
	    act.setHorizontalAlignment(JTextField.CENTER);
	    ca.setHorizontalAlignment(JTextField.CENTER);
	    d.setHorizontalAlignment(JTextField.CENTER);
	    
	    //Tipo de letra.
	    maximo.setFont(new Font("Sawasdee",0,18));
	    minimo.setFont(new Font("Sawasdee",0,18));
	    promedio.setFont(new Font("Sawasdee",0,18));
	    tiempototal.setFont(new Font("Sawasdee",0,18));
	    
	    act.setFont(new Font("Sawasdee",0,18));
	    acti.setFont(new Font("Sawasdee",0,18));
	    ca.setFont(new Font("Sawasdee",0,18));
	    ca2.setFont(new Font("Sawasdee",0,18));
	    d.setFont(new Font("Sawasdee",0,18));
	    d2.setFont(new Font("Sawasdee",0,18));
	    
	    JPanel content= new JPanel();
	    
	    content.setBackground(new Color(224,224,224,120));
	    content.setLayout(new GridLayout(2,2,5,5));
	    
	    //Agrega el contenido.
	    content.add(label);
	    content.add(resumen);
	    content.add(dist_t);
	    content.add(rit_t);
	    
	    //Crea y Agrega todo al JPanel
	    JPanel content1= new JPanel();
	    content1.setBackground(new Color(224,224,224,120));
	    content1.setLayout(new GridLayout(1,2,1,1));
	    content1.setPreferredSize(new Dimension(200, 200));

	    content1.add(dist_temp);
	    content1.add(rithm_temp);

	    //Crea JPanel
	    JPanel content2= new JPanel();
	    content2.setBackground(new Color(224,224,224,120));
	    content2.setLayout(new GridLayout(4,8,5,5));
	    
	    //Agrega todo al JPanel
	    content2.add(act);
	    content2.add(acti);
	    content2.add(maximo1);
	    content2.add(maximo);
	    content2.add(minimo1);
	    content2.add(minimo);
	    content2.add(promedio1);
	    content2.add(promedio);
	    content2.add(tiempo1);
	    content2.add(tiempototal);
	    content2.add(ca);
	    content2.add(ca2);
	    content2.add(d);
	    content2.add(d2);
	    
	    //Crea JPanel
	    JPanel content4= new JPanel();
	    content4.setBackground(new Color(224,224,224,120));
	    content4.setLayout(new BorderLayout());
	    
	    //Agrega todo al JPanel
	    content4.add(content, BorderLayout.NORTH);
	    content4.add(content1, BorderLayout.CENTER);
	    content4.add(content2, BorderLayout.SOUTH);
	    
	    resumen.addActionListener(new Resumen());
	    
	    back.setLayout(new FlowLayout());
	    back.add(content4);
	    
	    this.setContentPane(back);
	    this.pack();
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    this.setBounds(100,100,700,500);
	    this.setTitle("Monitoreo");
    	
        }//try
        
        catch(Exception a){
	    System.out.println(a.getMessage());
	
	}//catch 
    
    }//monitoreo

    /**
     *Clase encargada de los acciones que realizara la ventana de baja de monitoreo al darle click.
     *
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public class Resumen implements ActionListener{
	/**
	 *Metodo encargado de crear mensajes de dialogo en caso de que se haya deseado ver el resumen.
	 *@param ActionEvent Recibe el evento que se realizo en el boton (si se dio click)
	 */  
	public void actionPerformed(ActionEvent e){
        
	    //Destruye la ventana anterior y crea una nueva.
	    dispose();
	    JFrame res = new RESUMEN();
	    res.setVisible(true);
        
	}//actionperformed
    
    }//Resumen
    
}//Monitoreo


/**
 *Clase encargada crear la grafica "Distancia vs Tiempo".
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */ 
class GRAFICA_DVT extends JPanel{
    
    /**
     *Atributo tipo integer que contendra la distancia
     */
    private int dist;
    
    /**
     *Atributo tipo integer que contendra los minutos
     */
    private double min;
    
    /**
     *Constructor encargado de inicializar los atributos.
     *@param dist Distancia
     *@param min Minutos
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public GRAFICA_DVT(int dist, double min){
	
	super();
	this.dist=dist;
	this.min=min;
    
    }//Grafica_DVT
    
    /**
     *Metodo que crea la linea de la grafica
     *@param Graphics Datos para graficar.
     */
    public void paint(Graphics g) {
	g.drawLine(0,200,200-(int)dist/1000,(int)min/10);
    
    }//paint
}//Grafica_DVT

 /**
  *Clase encargada crear la grafica "Ritmocardiaco vs Tiempo".
  *
  *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
  *@version 2.0
  *@since 27/04/2016
  *
  */ 
class GRAFICA_RVT extends JPanel{
    
    /**
     *Atributo tipo arreglo que contendra el ritmo cardiaco.
     */
    private int[] ritmo = new int[3000];
    
    /**
     *Atributo tipo arreglo que contendra el minimo.
     */
    private int[] min = new int[3000];
   
    /**
     *Atributo tipo integer que contendra el tiempo.
     */
    private int tiempo;
    
    /**
     *Constructor encargado de inicializar los atributos.
     *@param ritmo Arreglo con el ritmo cardiaco
     *@param min Arreglo con el minimo
     *@param tiempo Tiempo
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public GRAFICA_RVT(int[] ritmo, int[] min,int tiempo){
	
	//Crea un objeto con el metodo paint,
	super();
	
	this.ritmo=ritmo;
	this.min=min;
	this.tiempo=tiempo;
    
    }//Grafica_RVT
    
    /**
     *Metodo encargado de graficar
     *@param Graphics contenido para poder graficar
     */
    
    public void paint(Graphics g) {

	g.drawPolyline(min, ritmo,tiempo);
   
    }//paint

}//Grafica_RVT

/**
 *Clase encargada crear la ventana con el resumen.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */ 
class RESUMEN extends JFrame{
    
    /**
     *Atributo encargado de crear la etiqueta correspondiente    
     */
    private JLabel label = new JLabel("Resumen");
    /**
     *Atributo encargado de crear la etiqueta correspondiente    
     */
    private JLabel vacio = new JLabel("");
    
    /**
     *Atributo encargado de crear la tabla correspondiente    
     */
    private JTable tabla;
    private JLabel back= new JLabel(new ImageIcon("rock.jpg"));
    
    private int[] d= new int[4];
    private int[] m1= new int[4];
    private int[] m2= new int[4];
    private int[] c= new int[4];
    private double[] p= new double[4];
    
    private Historial b;

    /**
     *Constructor encargado de inicializar los atributos.
     *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
     *@version 2.0
     *@since 27/04/2016
     *
     */ 
    public RESUMEN(){
	
	b= new Historial();
	
	//Fuente y orientacion
	label.setFont(new Font("Purisa",0,40));
	label.setHorizontalAlignment(JTextField.CENTER);
	label.setForeground(new Color(0,0,102));
	
	try{
        
	    d=b.Distancia(VARIABLES.persona);
	    m1=b.Minimo(VARIABLES.persona);
	    m2=b.Maximo(VARIABLES.persona);
	    p=b.Promedio(VARIABLES.persona);
	    c=b.Calorias(VARIABLES.persona);
	
	    String[] column={"","Natacion","Carrera","Caminata","Bicicleta"};
	    Object[][] data={{"","Natacion","Carrera","Caminata","Bicicleta"},{"Distancia",String.valueOf(d[0]),String.valueOf(d[1]),String.valueOf(d[3]),String.valueOf(d[2])},{"Máximo",String.valueOf(m2[0]),String.valueOf(m2[1]),String.valueOf(m2[2]),String.valueOf(m2[3])},{"Minimo",String.valueOf(m1[0]),String.valueOf(m1[1]),String.valueOf(m1[2]),String.valueOf(m1[3])},{"Promedio",String.valueOf(p[0]),String.valueOf(p[1]),String.valueOf(p[2]),String.valueOf(p[3])},{"Calorias",String.valueOf(c[0]),String.valueOf(c[1]),String.valueOf(c[3]),String.valueOf(c[2])}};
	    
	    //Crea tabla
	    tabla = new JTable(data,column);
	    
	    //Fuente
	    tabla.setFont(new Font("URW Gothic L",Font.BOLD,15));
	    tabla.setBackground(new Color(224,224,224,100));
	
	    //Creacion del JPanel
	    JPanel content= new JPanel();
	
	    //Inserta los elementos.
	    content.setBackground(new Color(224,224,224,120));
	    content.setLayout(new GridLayout(2,1,5,5));
	    content.setPreferredSize(new Dimension(400, 250));
	    content.add(label);
	    content.add(tabla);

	    back.setLayout(new FlowLayout());
	    back.add(content);
	     
	    //Coloca el JPanel en la ventana, y se le anade el titulo
	    this.setContentPane(back);
	    this.pack();
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    this.setBounds(100,100,500,330);
	    this.setTitle("Resumen");
	     

	}//try
    
	catch(Exception e){
	    System.out.println(e.getMessage());

	}//catch
	    
    }//Resumen

}//Resumen
