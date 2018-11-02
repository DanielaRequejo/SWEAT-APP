import java.io.*;
import java.util.*;

/**
 *Clase encargada de sacar el maximo, minimo, promedio, total de calorias quemadas,
 *total del ritmo cardiaco, por actividad, por el usuario.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 9/05/2016
 *
 */
public class Historial{

    /**
     *Atributo tipo File con el que se abrira el archivo para crear el archivo donde se almacenara los maximos,minimos, totales y promedios. 
     */
    private File file=null;
    
    /**
     *Atributo arreglo tipo File donde se almacenaran todos los archivos existentes de cada actividad. 
     */
    private File[] archivos=null;
    
    /**
     *Atributo tipo FileReades con el que se podra leer todos los archivos existentes. 
     */
    private FileReader f=null;
    
    /**
     *Atributo tipo integer donde se almacenaran los maximos, minimos, distancia recorrida y el total de calorias quemadas. 
     */
    private int i=0,max,min,dist=0,cal_total=0;
    
    /**
     *Atributo tipo double donde se almacenara los minutos y el promedio. 
     */
    private double minutos,prom=0;
    
    /**
     *Atributo tipo string donde se almacenaran los datos que se leeran del archivo pero que no serviran
     *para realizar los calculos necesarios. 
     */
    private String basura;
    
    /**
     *Metodo publico en el que se calculara la distancia total recorrida en diferentes actividades.
     *@param Nick Nickname del usuario.
     *@return La distancia total recorrida.
     *@exception IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */ 
    public int[] Distancia(String Nick) throws Exception{
    
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Natacion".  
	int[] distancia = new int[4];
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion");
	archivos=file.listFiles();
    
	//Lee el contenido de los archivos de la actividad "Natacion".   
	for(int x=0;x<archivos.length;x++){    
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	    
	    //Almacena los datos que no son necesarios para sacar la distancia total (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Se leen los minutos y la distancia(en metros), posteriormente se cierra el archivo.      
	    minutos=Double.parseDouble(src.nextLine());
	    dist=dist+Integer.parseInt(src.nextLine());
	    f.close();
        
	}//for
    
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Carrera". 
	distancia[0]=dist;
	dist=0;
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera");
	archivos=file.listFiles();
	
	//Lee el contenido de los archivos de la actividad "Carrera".  
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	  
	    //Almacena los datos que no son necesarios para sacar la distancia total (como la fecha y hora en la que se realizo).  
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Se leen los minutos y la distancia(en metros), posteriormente se cierra el archivo. 
	    minutos=Double.parseDouble(src.nextLine());
	    dist=dist+Integer.parseInt(src.nextLine());
	    f.close();
	
	}//for
	
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Bicicleta". 
	distancia[1]=dist;
	dist=0;
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta");
	archivos=file.listFiles();
	
	//Lee el contenido de los archivos de la actividad "Bicicleta".  
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	   
	    //Almacena los datos que no son necesarios para sacar la distancia total (como la fecha y hora en la que se realizo). 
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Se leen los minutos y la distancia(en metros), posteriormente se cierra el archivo. 
	    minutos=Double.parseDouble(src.nextLine());
	    dist=dist+Integer.parseInt(src.nextLine());
	    f.close();
	
	}//for
    
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Caminata". 
	distancia[2]=dist;
	dist=0;
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata");
	archivos=file.listFiles();
	
	//Lee el contenido de los archivos de la actividad "Caminata".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	   
	    //Almacena los datos que no son necesarios para sacar la distancia total (como la fecha y hora en la que se realizo).  
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Se leen los minutos y la distancia(en metros), posteriormente se cierra el archivo. 
	    minutos=Double.parseDouble(src.nextLine());
	    dist=dist+Integer.parseInt(src.nextLine());
	    f.close();
	
	}//for
	
	distancia[3]=dist;
	return distancia;
    
    }//Distancia

     /**
      *Metodo publico el que se calculara el maximo de frecuencia cardiaca en diferentes actividades.
      *@param Nick Nickname del usuario.
      *@return El maximo de frecuencia cardiaca.
      *@exception IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
      */ 
    public int[] Maximo(String Nick) throws Exception{
       
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Natacion".    
	int temp=0;
	int[] maximo = new int[4];
	double time;
	int rithm;
      
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion");
	archivos=file.listFiles();
	  
	//Lee el contenido de los archivos de la actividad "Natacion".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
    
	    //Almacena los datos que no son necesarios para sacar el maximo (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
    
	    //Se leen los minutos,calorias quemadas, el tiempo, maximo y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	    time=Double.parseDouble(src.nextLine());
	    max=Integer.parseInt(src.nextLine());
	    temp=max;
	  
	    //Lee el archivo hasta el final hasta sacar el valor maximo.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
	
		if(rithm>max){
		    max=rithm;
		  
		}//if
	      
	    }//while
          
	    if(temp<max){
		temp=max;
	      
	    }//if
          
	}//for
      
	maximo[0]=temp;

	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Carrera".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera");
	archivos=file.listFiles();
	  
	//Lee el contenido de los archivos de la actividad "Carrera".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
    
	    //Almacena los datos que no son necesarios para sacar el maximo (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
    
	    //Se leen los minutos,calorias quemadas, el tiempo, maximo y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	    time=Double.parseDouble(src.nextLine());
	    max=Integer.parseInt(src.nextLine());
	    temp=max;
	  
	    //Lee el archivo hasta el final hasta sacar el valor maximo.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
	
		if(rithm>max){
		    max=rithm;
		  
		}//if
          
	    }//while    
	
	    if(temp<max){
		temp=max;
	      
	    }//if
	  
	}//for
      
	maximo[1]=temp;
	  
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Caminata".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata");
	archivos=file.listFiles();
      
	//Lee el contenido de los archivos de la actividad "Caminata".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	      
	    //Almacena los datos que no son necesarios para sacar el maximo (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	      
	    //Se leen los minutos,calorias quemadas, el tiempo, maximo y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	    time=Double.parseDouble(src.nextLine());
	    max=Integer.parseInt(src.nextLine());
	    temp=max;
	  
	    //Lee el archivo hasta el final hasta sacar el valor maximo.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
	
		if(rithm>max){
		    max=rithm;
	
		}//if
	
	    }//while
          
	    if(temp<max){
		temp=max;
	      
	    }//if
	  
	}//for
      
	maximo[2]=temp;
	  
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Bicicleta".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta");
	archivos=file.listFiles();
	  
	//Lee el contenido de los archivos de la actividad "Bicicleta".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
    
	    //Almacena los datos que no son necesarios para sacar el maximo (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
    
	    //Se leen los minutos,calorias quemadas, el tiempo, maximo y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	    time=Double.parseDouble(src.nextLine());
	    max=Integer.parseInt(src.nextLine());
	    temp=max;
	  
	    //Lee el archivo hasta el final hasta sacar el valor maximo.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
	
		if(rithm>max){
		    max=rithm;
	
		}//if
	
	    }//while    
	
	    if(temp<max){
		temp=max;
	
	    }//if
          
	}//for
      
	maximo[3]=temp;
	  
	return maximo;
    
    }//Maximo

    /**
     *Metodo publico en el que se calculara el minimo de frecuencia cardiaca en diferentes actividades.
     *@param Nick Nickname del usuario.
     *@return El minimo de frecuencia cardiaca.
     *@exception IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */ 
    public int[] Minimo(String Nick) throws Exception{
        
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Natacion".   
	int temp=0;
	int[] minimo = new int[4];
	double time;
	int rithm;
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion");
	archivos=file.listFiles();
      
	//Lee el contenido de los archivos de la actividad "Natacion".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
          
	    //Almacena los datos que no son necesarios para sacar el minimo (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
    
	    //Se leen los minutos,calorias quemadas, el tiempo, minimo y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	    time=Double.parseDouble(src.nextLine());
	    min=Integer.parseInt(src.nextLine());
	    temp=min;
          
	    //Lee el archivo hasta el final hasta sacar el valor minimo.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
          
		if(rithm<min){
		    min=rithm;
		  
		}//if
	      
	    }//while
          
	    if(temp<min){
		temp=min;
	    }//if
          
	}//for
      
	minimo[0]=temp;
	  
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Carrera".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera");
	archivos=file.listFiles();
      
	//Lee el contenido de los archivos de la actividad "Carrera".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
    
	    //Almacena los datos que no son necesarios para sacar el minimo (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
    
	    //Se leen los minutos,calorias quemadas, el tiempo, minimo y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	    time=Double.parseDouble(src.nextLine());
	    min=Integer.parseInt(src.nextLine());
	    temp=min;
	  
	    //Lee el archivo hasta el final hasta sacar el valor minimo.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
	
		if(rithm<min){
		    min=rithm;
	
		}//if
	
	    }//while    
	
	    if(temp<min){
		temp=min;
          
	    }//if
          
	}//for
      
	minimo[1]=temp;
	  
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Caminata".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata");
	archivos=file.listFiles();
	  
	//Lee el contenido de los archivos de la actividad "Caminata".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
    
	    //Almacena los datos que no son necesarios para sacar el minimo (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
    
	    //Se leen los minutos,calorias quemadas, el tiempo, minimo y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	    time=Double.parseDouble(src.nextLine());
	    min=Integer.parseInt(src.nextLine());
	    temp=min;
	  
	    //Lee el archivo hasta el final hasta sacar el valor minimo.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
	
		if(rithm<min){
		    min=rithm;
	
		}//if
	
	    }//while    
	
	    if(temp<min){
		temp=min;
          
	    }//if
	  
	}//for
      
	minimo[2]=temp;
	  
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Bicicleta".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta");
	archivos=file.listFiles();
	  
	//Lee el contenido de los archivos de la actividad "Caminata".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
    
	    //Almacena los datos que no son necesarios para sacar el minimo (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
    
	    //Se leen los minutos,calorias quemadas, el tiempo, minimo y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	    time=Double.parseDouble(src.nextLine());
	    min=Integer.parseInt(src.nextLine());
	    temp=min;
	  
	    //Lee el archivo hasta el final hasta sacar el valor minimo.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
	
		if(rithm<min){
		    min=rithm;
		  
		}//if
	     
	    }//while    
	     
	    if(temp<min){
		temp=min;
	      
	    }//if
	  
	}//for
      
	minimo[3]=temp;
	  
	return minimo;

    }//minimo

    /**
     *Metodo publico en el que se calculara el promedio del ritmo cardiaco en diferentes actividades.
     *@param Nick Nickname del usuario.
     *@return El promedio de ritmo cardiaco.
     *@exception IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */
    public double[] Promedio(String Nick) throws Exception{
     
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Natacion".   
	double[] promedio= new double[4];
	double time;
	int rithm;
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion");
	archivos=file.listFiles();
	
	//Lee el contenido de los archivos de la actividad "Natacion".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	     
	    //Almacena los datos que no son necesarios para sacar el promedio(como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	     
	    //Se leen los minutos,calorias quemadas y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	     
	    //Lee el archivo hasta el final hasta sacar el valor promedio.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
		prom=prom+rithm;
		i++;
	     
	    }//while
         
	}//for
      
	promedio[0]=prom/i;
   
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Carrera".
	prom=0;
	i=0;

	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera");
	archivos=file.listFiles();
	 
	//Lee el contenido de los archivos de la actividad "Carrera".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
    
	    //Almacena los datos que no son necesarios para sacar el promedio(como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	     
	    //Se leen los minutos,calorias quemadas y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	     
	    //Lee el archivo hasta el final hasta sacar el valor promedio.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
		prom=prom+rithm;
		i++;
	 
	    }//while
         
	}//for
     
	promedio[1]=prom/i;
	 
	prom=0;
	i=0;
	 
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Caminata".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata");
	archivos=file.listFiles();
	 
	//Lee el contenido de los archivos de la actividad "Caminata".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	     
	    //Almacena los datos que no son necesarios para sacar el promedio(como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	     
	    //Se leen los minutos,calorias quemadas y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
    
	    //Lee el archivo hasta el final hasta sacar el valor promedio.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
		prom=prom+rithm;
		i++;
	 
	    }//while
	 
	}//for
     
	promedio[2]=prom/i;
	 
	prom=0;
	i=0;
     
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Bicicleta".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta");
	archivos=file.listFiles();
	 
	//Lee el contenido de los archivos de la actividad "Bicileta".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	     
	    //Almacena los datos que no son necesarios para sacar el promedio(como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	     
	    //Se leen los minutos,calorias quemadas y la distancia(en metros).
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=Integer.parseInt(src.nextLine());
	 
	    //Lee el archivo hasta el final hasta sacar el valor promedio.
	    while(src.hasNextLine()){
		time=Double.parseDouble(src.nextLine());
		rithm=Integer.parseInt(src.nextLine());
		prom=prom+rithm;
		i++;
	 
	    }//while
         
	}//for
     
	promedio[3]=prom/i;
    
	return promedio;
    
    }//promedio
    
    /**
     *Metodo publico en el que se calculara el total de las calorias quemadas en diferentes actividades.
     *@param Nick Nickname del usuario.
     *@return El promedio de calorias quemadas.
     *@exception IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */
    public int[] Calorias(String Nick) throws Exception{
	
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Natacion".  
	int[] calorias = new int[4];
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion");
	archivos=file.listFiles();
	
	//Lee el contenido de los archivos de la actividad "Natacion".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Natacion/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	    
	    //Almacena los datos que no son necesarios para sacar el total de calorias quemadas (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Se leen los minutos,calorias quemadas, el tiempo, minimo y la distancia(en metros), posteriormente se cerrara el archivo.
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=cal_total+Integer.parseInt(src.nextLine());
	    f.close();
        
	}//for
    
	calorias[0]=cal_total;
	cal_total=0;
	
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Carrera". 
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera");
	archivos=file.listFiles();
	
	//Lee el contenido de los archivos de la actividad "Carrera".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Carrera/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	    
	    //Almacena los datos que no son necesarios para sacar el total de calorias quemadas (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Se leen los minutos,calorias quemadas, el tiempo, minimo y la distancia(en metros), posteriormente se cerrara el archivo.
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=cal_total+Integer.parseInt(src.nextLine());
	    f.close();
	
	}//for
	
	calorias[1]=cal_total;
	cal_total=0;
    
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Bicicleta". 
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta");
	archivos=file.listFiles();
	
	//Lee el contenido de los archivos de la actividad "Bicicleta".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Bicicleta/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
        
	    //Almacena los datos que no son necesarios para sacar el total de calorias quemadas (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Se leen los minutos,calorias quemadas, el tiempo, minimo y la distancia(en metros), posteriormente se cerrara el archivo.
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=cal_total+Integer.parseInt(src.nextLine());
	    f.close();
	
	}//for
	
	calorias[2]=cal_total;
	cal_total=0;
    
	//Lee todos los archivos almacenados dentro de la carpeta de la actividad "Caminata".
	file = new File("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata");
	archivos=file.listFiles();
	
	//Lee el contenido de los archivos de la actividad "Caminata".
	for(int x=0;x<archivos.length;x++){
	    f = new FileReader("/home/ic14dpm/JAVA/PROYECTO/"+Nick+"/ActividadC/Caminata/"+archivos[x].getName());    
	    Scanner src = new Scanner(f);
	    
	    //Almacena los datos que no son necesarios para sacar el total de calorias quemadas (como la fecha y hora en la que se realizo).
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    basura=src.nextLine();
	    
	    //Se leen los minutos,calorias quemadas, el tiempo, minimo y la distancia(en metros), posteriormente se cerrara el archivo.
	    minutos=Double.parseDouble(src.nextLine());
	    dist=Integer.parseInt(src.nextLine());
	    cal_total=cal_total+Integer.parseInt(src.nextLine());
	    f.close();
	
	}//for
	
	calorias[3]=cal_total;
	return calorias;
    
    }//calorias
    
}//Historial



