import java.util.*;
import java.lang.*;

/**
 *Clase encargada de calcular el indice de masa corporal dependiendo del peso y la altura,
 *la frecuencia cardiaca maxima (FCM) dependiendo de la edad y del sexo, y de sacar las zonas en las que se puede encontrar la persona,
 *dependiendo de la FCM. 
 *
 *@author Montserrat Devars Peralta, David Parra Mercado, Daniela Requejo Fernandez.
 *@version 2.0
 *@since 27/04/2016
 *
 */
public class Calculadora{
	
	
    /**
     *Atributo tipo Datos que contiene la informacion de la clase Usuarios.
     */	
    private Datos p;
	
    /**
     *Atributo tipo Usuario que crea un nuevo usuario. 
     */
    private Usuarios persona = new Usuarios();
	
    /**
     *Atributo de tipo String el cual contiene el sexo.
     */
    private String Sexo;
	
    /**
     *Atributos tipo integer los cuales contendran la edad y el resultado obtenido de la FCM.
     */
    private int edad,res=0;
	
    /**
     *Atributos tipo double los cuales contendran el peso y la altura de la persona.
     */
    private double peso, altura; 
    
	
    /**
     *Constructor Calculadora con un parametro de entrada para inicializar las variables edad, peso, altura y sexo.
     *@param Nick Nombre de usuario.
     *@throws IOException En caso de que el archivo no se pueda leer de manera correcta, o no se encuentre en existencia.
     */
    public Calculadora(String Nick) throws Exception{
		
	p=persona.Visualizacion(Nick);
	this.edad=p.getEdad();
	this.peso=p.getPeso();
	this.altura=p.getALtura();
	this.Sexo=p.getSexo();
	
    }//calculadora
	
    /**
     *Metodo publico por el cual se calcula la Frecuencia Cardiaca Maxima dependiendo del sexo y edad de la persona.
     *@return El resultado de la frecuencia maxima calculada.
     */

    public int FCM(){
		
	if(Sexo.equals("M")){
	    res=220-edad;
	    return res;
	
	}//if
	
	else{
	    res=226-edad;
	    return res;
	
	}//else
    
    }//FCM
    
	
    /**
     *Metodo publico por el cual se calcula la zona en la que se encuentra el usuario dependiendo del resultado de la FMC del usuario.
     *@return La zona ideal para el usuario.
     */
    public double[] Zonas(){
		
	double[] zonas= new double[5];
	
	zonas[0]=res*0.5;
	zonas[1]=res*0.6;
	zonas[2]=res*0.7;
	zonas[3]=res*0.8;
	zonas[4]=res*0.9;
	
	return zonas;

    }//Zonas
	
    /**
     *Metodo publico encargado de calcular el Indice de Masa Corporal recomendable para el usuario dependiendo de la altura y peso.
     *@return El IMC ideal para el usuario.
     */
    public double IMC(){
	
	double imc=0;
	imc=peso/((altura/100)*(altura/100));
	return imc;
    
    }//IMC
	
}//calculadora