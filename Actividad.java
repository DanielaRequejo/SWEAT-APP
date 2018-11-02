import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *Clase encargada de almacenar la informacion de las actividades realizadas.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
public class Actividad{
   
   /**
   *Atributo encargado de almacenar el tiempo y el muestreo por segundo
   */
    private double muestro_por_segundo,tiempo;
   
   /**
    *Atributo encargado de almacenar la distancia y las calorias
    **/
    private int distancia,calorias;
    
    /**Atributo encargado de almacenar las horas y minutos
     */
    private double minutos,hr;
    
    /**
    *Atributo encargado de almacenar la fecha
    */
    private String fecha;
    /**
    *Atributo encargado de almacenar la hora_inicial
    */
    private String hora_i;
    
    /**Atributo encargado de almacenar la hoa_final*/
    private String hora_f;
    
    //FileInputStream act = new FileInputStream();
  
   /**
     *Constructor Actividad encargada de generar de manera aleatoria ritmos cardiacos y hora.
     */  
    public Actividad(){
        
	minutos=(int)(Math.random()*120+30);
	hr=(int)(Math.random()*12+1);
	tiempo=minutos;
	hora_i=String.valueOf(hr)+" hr";
    
	if(minutos==120){
	    hr=hr+2;
	    hora_f=String.valueOf(hr)+" hr";
	}//if
    
    else if(minutos==60){
	    hr=hr+1;
	    hora_f=String.valueOf(hr)+" hr";
	}//if
    
    else{
	    if(minutos>60){
		hr=hr+1;
		minutos=minutos-60;
		hr=hr+minutos/100;
		hora_f=String.valueOf(hr)+" hr";
	   
        }//if
       
        else{
		hr=hr+minutos/100;
		hora_f=String.valueOf(hr)+" hr";
	    }//else

	}//else

     }//Actividad

    /**
     *Metodo publico por el cual almacena los datos en la capeta de la actividad correspondiente.
     *@param Nick Nickname
     *@throws IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */
    public void Natacion(String Nick) throws Exception{
	int natacion;
	Date fecha=new Date();
	distancia=(int)(Math.random()*3000+500);
	calorias=(int)(Math.random()*420+360);
	FileWriter fout=new FileWriter("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/Natacion/natacion_"+fecha.getMinutes()+":"+fecha.getSeconds()+".txt");

    //Escribe en el archivo
	fout.write("Natacion \n");
	fout.write(fecha.toString()+"\n");
	fout.write(hora_i+"\n");
	fout.write(hora_f+"\n");
	fout.write(tiempo+"\n");
	fout.write(distancia+"\n");
	fout.write(calorias+"\n");
    
	for(double x=0.1;x<=tiempo;x=x+0.1){
	    natacion=(int)(Math.random()*200+50);
	    fout.write(x+"\n");
	    fout.write(natacion+"\n");
	
    }//for
    
	fout.close();
    }//natacion
    
     /**
     *Metodo publico por el cual almacena los datos en la capeta de la actividad correspondiente.
     *@param Nick Nickname
     *@throws IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */
    public void Carrera(String Nick) throws Exception{
	
    int carrera;
	Date fecha=new Date();
	distancia=(int)(Math.random()*3000+500);
	calorias=(int)(Math.random()*560+480);
	FileWriter fout=new FileWriter("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/Carrera/carrera_"+fecha.getMinutes()+":"+fecha.getSeconds()+".txt");

    //Escribe en el archivo
    
	fout.write("Carrera \n");
	fout.write(fecha.toString()+"\n");
	fout.write(hora_i+"\n");
	fout.write(hora_f+"\n");
	fout.write(tiempo+"\n");
	fout.write(distancia+"\n");
	fout.write(calorias+"\n");
    
	for(double x=0.1;x<=tiempo;x=x+0.1){
	    carrera=(int)(Math.random()*170+50);
	    fout.write(x+"\n");
	    fout.write(carrera+"\n");
	
    }//for
	
    fout.close();
   
    }//carrera

     /**
     *Metodo publico por el cual almacena los datos en la capeta de la actividad correspondiente.
     *@param Nick Nickname
     *@throws IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */
    public void Caminata(String Nick) throws Exception{
        
	int caminata;
	Date fecha=new Date();
	distancia=(int)(Math.random()*3000+500);
	calorias=(int)(Math.random()*210+150);
	FileWriter fout=new FileWriter("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/Caminata/caminata_"+fecha.getMinutes()+":"+fecha.getSeconds()+".txt");

    //Escribe en el archivo
	fout.write("Caminata \n");
	fout.write(fecha.toString()+"\n");
	fout.write(hora_i+"\n");
	fout.write(hora_f+"\n");
	fout.write(tiempo+"\n");
	fout.write(distancia+"\n");
	fout.write(calorias+"\n");
    
	for(double x=0.1;x<=tiempo;x=x+0.1){
	    caminata=(int)(Math.random()*180+50);
	    fout.write(x+"\n");
	    fout.write(caminata+"\n");
        
	}//for
    
	fout.close();
    
    }//caminata
    
     /**
     *Metodo publico por el cual almacena los datos en la capeta de la actividad correspondiente.
     *@param Nick Nickname
     *@throws IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */
    public void Bicicleta(String Nick) throws Exception{
        
	int bicicleta;
	Date fecha=new Date();
	distancia=(int)(Math.random()*3000+500);
	calorias=(int)(Math.random()*350+300);
	FileWriter fout=new FileWriter("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/Bicicleta/bicicleta_"+fecha.getMinutes()+":"+fecha.getSeconds()+".txt");

    //Escribe en el archivo.
	fout.write("Bicicleta \n");
	fout.write(fecha.toString()+"\n");
	fout.write(hora_i+"\n");
	fout.write(hora_f+"\n");
	fout.write(tiempo+"\n");
	fout.write(distancia+"\n");
	fout.write(calorias+"\n");
    
	for(double x=0.1;x<=tiempo;x=x+0.1){
	    bicicleta=(int)(Math.random()*150+50);
	    fout.write(x+"\n");
	    fout.write(bicicleta+"\n");
	}//for
	fout.close();
    }//Bicicleta
    
     /**
     *Metodo publico por el cual almacena los datos en la capeta de la actividad correspondiente.
     *@param Nick Nickname
     *@throws IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */
    public void Carga_Actividad(String Nick, String Archivo,String Tipo) throws Exception{
	
    //Lee el archivo.
    File origen = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadN/"+Tipo+"/"+Archivo);
	File destino = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/"+Tipo+"/"+Archivo);
	InputStream in = new FileInputStream(origen);
	OutputStream out= new FileOutputStream(destino);
	byte[] buf = new byte[2000];
	int len;
	
    while((len=in.read(buf))>0){
	    out.write(buf,0,len);
	
    }//while
    
	origen.delete();
	in.close();
	out.close();
    }//carga_actividad
    
}//Actividad

	   
	
	