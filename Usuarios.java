import java.util.*;
import java.io.*;

/**
 *Clase encargada de crear una carpeta con el Nickname del usuario, y una carpeta para cada actividad,
 *para asi poder almacenar tanto los datos personales, como la informacion de cada actividad de manera ordenada.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
public class Usuarios{
    
    /**
     *Atributo tipo Datos que almacenara los datos del usuario. 
     */
    private Datos User;

    /**
     *Metodo publico el cual da de alta al usuario creando carpetas con su Nick(la general) y la correspondiente con cada actividad.
     *@param Nombre Nombre del usuario.
     *@param Apellido Apellido Paterno del usuario.
     *@param Nick Nickname del usuario.
     *@param Contrasena Contrasena del usuario.
     *@param Fecha Fecha de Nacimiento del usuario.
     *@param Sexo Sexo del usuario.
     *@param Edad Edad del usuario.
     *@param Correo Correo electronico del usuario.
     *@param Altura Altura del usuario.
     *@param Peso Peso del usuario.
     *@exception IOException En caso de que el archivo no se pueda escribir de manera correcta, o no se encuentre en existencia.
     */ 
    public void Alta(String Nombre,String Apellido,String Nick,String Contrasena,String Fecha,String Sexo, int Edad, String Correo,Double Altura,Double Peso) throws Exception{
        
	Date fecha = new Date();
	User= new Datos(Nombre,Apellido,Nick,Contrasena,Fecha,Sexo,Edad,Correo,fecha.toString(),Altura,Peso);
	
	//Crea una carpeta para cada actividad, y un nuevo archivo para almacenar los datos de cada actividad.
	File f = new File(Nick);
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/Natacion");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/Bicicleta");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/Caminata");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/Carrera");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata");
	f.mkdir();
	f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera");
	f.mkdir();

	//Almacena los datos personales del usuario.
    
	FileWriter fout = new FileWriter("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/Datos.txt");
	fout.write(Nombre+"\n"+Apellido+"\n"+Nick+"\n"+Contrasena+"\n"+Fecha+"\n"+Sexo+"\n"+Edad+"\n"+Correo+"\n"+User.getFecha_r()+"\n"+Altura+"\n"+Peso);
	fout.close();
    
    }//Alta
    
    /**
     *Metodo publico por el cual se podra visualizar los datos personales del usuario.
     *@param Nick Nickname del usuario.
     *@exception IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     *@return Datos personales de cada usuario.
     */ 
    public Datos Visualizacion(String Nick) throws Exception{
        
	FileReader fin = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/Datos.txt");
	Scanner src = new Scanner(fin);
	
	//Lee los datos correspondientes al usuario.
	User = new Datos(src.nextLine(),src.nextLine(),src.nextLine(),src.nextLine(),src.nextLine(),src.nextLine(),Integer.parseInt(src.nextLine()),src.nextLine(),src.nextLine(),Double.parseDouble(src.nextLine()),Double.parseDouble(src.nextLine()));
	fin.close();
	return User;
    
    }//Datos
    
    /**
     *Metodo publico el cual se puede modificar los datos del usuario.
     *@param Nick Nickname del usuario.
     *@param Modificacion Campo que se desea modificar.
     *@param Cambio Informacion por la cual se cambiara el dato deseado.
     *@exception IOException En caso de que el archivo no se pueda escribir de manera correcta, o no se encuentre en existencia.
     */ 
    public void Modificacion(String Nick,String Modificacion,String Cambio) throws Exception{
   
	//Lee el archivo donde se encuentran almacenados los datos.
   
	FileReader fin = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/Datos.txt");
	Scanner src = new Scanner(fin);
	User = new Datos(src.nextLine(),src.nextLine(),src.nextLine(),src.nextLine(),src.nextLine(),src.nextLine(),Integer.parseInt(src.nextLine()),src.nextLine(),src.nextLine(),Double.parseDouble(src.nextLine()),Double.parseDouble(src.nextLine()));
	fin.close();

	//En caso de que el dato deseado para modificar sea el nombre, se cambiara.
    
	if(Modificacion.equals("Nombre")){
	    User.setNombre(Cambio);
	
	}//if
    
	//En caso de que el dato deseado para modificar sea el apellido, se cambiara.
	else if(Modificacion.equals("Apellido")){
	    User.setApellido(Cambio);
	
	}//elseif
    
	//En caso de que el dato deseado para modificar sea el nickname, se cambiara.
	else if(Modificacion.equals("Nick")){
	    User.setNick(Cambio);
	
	}//elseif
    
	//En caso de que el dato deseado para modificar sea la contrasena, se cambiara.
	else if(Modificacion.equals("Contrasena")){
	    User.setContrasena(Cambio);
	
	}//elseif
    
	//En caso de que el dato deseado para modificar sea la fecha de nacimiento, se cambiara.
	else if(Modificacion.equals("Fecha de Nacimiento")){
	    User.setFecha(Cambio);
	
	}//elseif
    
	//En caso de que el dato deseado para modificar sea el sexo, se cambiara.
	else if(Modificacion.equals("Sexo")){
	    User.setSexo(Cambio);
	
	}//elseif
    
	//En caso de que el dato deseado para modificar sea la edad, se cambiara.
	else if(Modificacion.equals("Edad")){
	    User.setEdad(Integer.parseInt(Cambio));
	
	}//elseif
    
	//En caso de que el dato deseado para modificar sea el correo, se cambiara.
	else if(Modificacion.equals("Correo")){
	    User.setCorreo(Cambio);
	
	}//elseif
    
	//En caso de que el dato deseado para modificar sea la altura, se cambiara.
	else if(Modificacion.equals("Altura")){
	    User.setAltura(Double.parseDouble(Cambio));
	
	}//elseif
    
	//En caso de que el dato deseado para modificar sea el peso, se cambiara.
	else if(Modificacion.equals("Peso")){
	    User.setPeso(Double.parseDouble(Cambio));
	
	}//elseif
    
	//Almacena la informacion cambiada.
	FileWriter fout = new FileWriter("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/Datos.txt");
	fout.write(User.getNombre()+"\n"+User.getApellido()+"\n"+User.getNick()+"\n"+User.getContrasena()+"\n"+User.getFecha()+"\n"+User.getSexo()+"\n"+User.getEdad()+"\n"+User.getCorreo()+"\n"+User.getFecha_r()+"\n"+User.getALtura()+"\n"+User.getPeso());
	fout.close();
    
    }//Datos Visualizacion
    
    /**
     *Metodo publico el cual se puede dar de baja a un usuario.
     *@param Nick Nickname del usuario.
     *@throws Exception En caso de que no se pueda borrar el directorio.
     */ 
    public void Baja(String Nick){
        
	try{
	    File f = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick);
	    borrarDirectorio(f);
	    f.delete();
	
	}//try
    
	catch(Exception e){
	    System.out.println("Hubo un problema");
	
	}//catch
    
    }//Baja
    
    /**
     *Metodo publico el cual se puede dorrar un directorio el cual contenga .
     *@param Directorio Directorio que se desea eliminar.
     */ 
    public static void borrarDirectorio(File directorio){
	
	//En lista los archivos del directorio.
    
	File[] ficheros = directorio.listFiles();
	
	for(int x=0;x<ficheros.length;x++){
	
	    if(ficheros[x].isDirectory()){
		borrarDirectorio(ficheros[x]);
	
	    }//if
        
	    ficheros[x].delete();
	}//for
    
    }//borrarDirectorio

}//Clase Usuarios

/**
 *Clase encargada de recibir y asignarle un valor a los atributos con los datos del usuario.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */

class Datos{
    
    /**
     *Atributos tipo String que contienen el nombre, apellido paterno, nickname (o nombre del usuario), contrasena, fecha, sexo, correo y fecha de registro.
     */
    private String Nombre,Apellido,Nick,Contrasena,Fecha,Sexo,Correo,Fecha_r;
    
    /**
     *Atributo tipo integer que contiene la edad.
     */
    private int Edad;
    
    /**
     *Atributos tipo double que contienen la altura y peso.
     */
    private Double Altura,Peso;

    
    /**
     *Constructor Datos con once parametros de entrada para inicializar las variables Nombre, Apellido, Nick, Contrasena, Fecha, Sexo, Edad, Correo, Fecha_r, Altura, Peso.
     *@param Nombre Nombre del usuario.
     *@param Apellido Apellido paterno del usuario.
     *@param Nick Nombre de usuario.
     *@param Contrasena Contrasena del usuario.
     *@param Fecha Fecha de nacimiento del usuario.
     *@param Sexo Sexo (Masculino o Femenino) del usuario.
     *@param Edad Edad del usuario.
     *@param Correo Correo electronico del usuario.
     *@param Fecha_r Fecha de Registro en el sistema.
     *@param Altura Altura del usuario.
     *@param Peso Peso del usuario.
     */
    public Datos(String Nombre,String Apellido,String Nick,String Contrasena,String Fecha,String Sexo, int Edad, String Correo,String Fecha_r,Double Altura,Double Peso){
	
	this.Nombre=Nombre;
	this.Apellido=Apellido;
	this.Nick=Nick;
	this.Contrasena=Contrasena;
	this.Fecha=Fecha;
	this.Sexo=Sexo;
	this.Edad=Edad;
	this.Correo=Correo;
	this.Fecha_r=Fecha_r;
	this.Altura=Altura;
	this.Peso=Peso;
    
    }//Datos
    
    /**
     *Metodo publico el cual le asigna un valor al atributo Nombre.
     *@param Nombre Nombre del usuario.
     */ 
    public void setNombre(String Nombre){
	this.Nombre=Nombre;
    
    }//setNombre
    
    /**
     *Metodo publico el cual le asigna un valor al atributo Apellido.
     *@param Apellido Apellido Paterno del usuario.
     */
    public void setApellido(String Apellido){
	this.Apellido=Apellido;
    
    }//setApellido
    
    /**
     *Metodo publico el cual le asigna un valor al atributo Nick.
     *@param Nick Nickname del Usuario.
     */
    public void setNick(String Nick){
	this.Nick=Nick;
    
    }//setNick
    
    /**
     *Metodo publico el cual le asigna un valor al atributo Contrasena.
     *@param Contrasena Contrasena del Usuario.
     */ 
    public void setContrasena(String Contrasena){
	this.Contrasena=Contrasena;
    
    }//setContrasena
    
    /**
     *Metodo publico el cual le asigna un valor al atributo Fecha.
     *@param Fecha Fecha de nacimiento del Usuario.
     */  
    public void setFecha(String Fecha){
	this.Fecha=Fecha;
    
    }//setFecha
    
    /**
     *Metodo publico el cual le asigna un valor al atributo Sexo.
     *@param Sexo Sexo del Usuario, ya sea Femenino o Masculino.
     */ 
    public void setSexo(String Sexo){
	this.Sexo=Sexo;
    
    }//setSexo
    
     /**
      *Metodo publico el cual le asigna un valor al atributo Edad.
      *@param Edad Edad del Usuario.
      */ 
    public void setEdad(int Edad){
	this.Edad=Edad;
    
    }//setEdad
    
    /**
     *Metodo publico el cual le asigna el valor del atributo Correo.
     *@param Correo Correo del usuario.
     */  
    public void setCorreo(String Correo){
	this.Correo=Correo;
    
    }//esetCorreo
    
    /**
     *Metodo publico el cual le asigna el valor del atributo Altura.
     *@param Altura La altura del usuario,
     */
    public void setAltura(Double Altura){
	this.Altura=Altura;
    
    }//setAltura
    
    /**
     *Metodo publico el cual le asigna el valor del atributo Peso.
     *@param El peso del usuario.
     */    
    public void setPeso(Double Peso){
	this.Peso=Peso;
    
    }//setPeso
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Nombre.
     *@return El nombre del usuario.
     */
    public String getNombre(){
	return this.Nombre;
    
    }//getNombre
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Apellido paterno.
     *@return El apellido paterno del usuario.
     */
    public String getApellido(){
	return this.Apellido;
    
    }//getApellido
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Nick.
     *@return El nickname del usuario.
     */
    public String getNick(){
	return this.Nick;
    
    }//getNick
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Contrasena.
     *@return El contrasena del usuario.
     */
    public String getContrasena(){
	return this.Contrasena;
    
    }//getContrasena
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Fecha.
     *@return La fecha de nacimiento del usuario.
     */
    public String getFecha(){
	return this.Fecha;
    
    }//getFecha
    
     /**
      *Metodo publico del cual se obtiene el valor del atributo Sexo.
      *@return El sexo del usuario
      */
    public String getSexo(){
	return this.Sexo;
    
    }//getSexo
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Edad.
     *@return La edad del usuario.
     */
    public int getEdad(){
	return this.Edad;
    
    }//getEdad
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Correo.
     *@return El correo electronico del usuario.
     */
    public String getCorreo(){
	return this.Correo;
    
    }//getCorreo
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Fecha_r.
     *@return La fecha en la que se registro el usuario.
     */
    public String getFecha_r(){
	return this.Fecha_r;
    
    }//getFecha_r
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Altura.
     *@return La altura del usuario.
     */
    public Double getALtura(){
	return this.Altura;
    
    }//getALtura
    
    /**
     *Metodo publico del cual se obtiene el valor del atributo Peso.
     *@return El peso del usuario.
     */
    public Double getPeso(){
	return this.Peso;
    
    }//getPeso

}//Datos
