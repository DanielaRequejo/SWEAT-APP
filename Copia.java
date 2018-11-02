import java.io.*;
import java.util.*;

/**
 *Clase encargada de realizar una copia de todos los archivos de los usuarios.
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
public class Copia{
    
    /**
    *Main donde se copiaran todos los archivos.
    *@param String En caso de que se desee ejecutar por la linea de comandos.
    *@throws IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
    */   
    public static void main(String[] args) throws Exception{
   
    //Copia todos los archivos.      
	File origen = new File("/home/ic14dpm/JAVA/PROYECTO/hola");
	File destino = new File("/home/ic14dpm/hola");
	File f = new File("/home/ic14dpm/JAVA/PROYECTO/HOLA");
	InputStream in = new FileInputStream(origen);
	OutputStream out= new FileOutputStream(destino);
	byte[] buf = new byte[1024];
	int len;
	f.mkdir();
    
	while((len=in.read(buf))>0){
	    out.write(buf,0,len);
	
    }//while
	
    in.close();
	out.close();
    
    }//main
    
}//Copia