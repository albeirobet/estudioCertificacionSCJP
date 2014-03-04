package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O6_6_Metodos_Lista_Argumentos_Variable {
	
	/**
	 Java permite crear metodos que puedan tomar un numero variable de argumentos. Se utilizar
	 el termino "var-args". 
	 Vamos a definir  como vamos a usar los terminos argumento y parametro de aqui en adelante.
	 
	 * Argumentos: Lo que declaramos entre los parentisis cuando invocamos a un metodo.
	 * Parametros: Lo que debe recibir el metodo cuando es invocado. 
	 */

					           //Parametros	
	public void metodoPrueba(String s, int a){
		
	}

	public void consumirMetodo(){
					 //Argumentos
		metodoPrueba("hola", 789);
	}
	
	/**
	 Se trataran los metodos que usan un numero variable de argumentos, por ahora vamos a revisar
	 las reglas de declaracion de var-args:
	 
	 * Tipo de var-arg: Cuando declaramos un parametro var-arg, debemos especificar el tipo de 
	   argumento/s que podemos recibir (puede ser un tipo primitivo o un objeto)
	 * Sintaxis basica: Al declarar un metodo usando un parametro var-arg, continuaremos el tipo con
	   una elipsis (...), un espacio y entonces el nombre del array recibira el parametro recibido.
	 * Otros parametros: Es legal tener otros parametros en un metodo que se usa para var-arg
	 * Limites de varg-args: Debe ser el ultimo parametro en la declaracion del metodo, y solo se 
	   puede tener un solo var-arg en el metodo.
	   	  
	 */
	
	//Ejemplos de Declaraciones Legales
	
	void hacerAlgo(int ... x){
		//Este metodo espera 0 o muchas variables de tipo int como parametros.
	}
	
	void hacerAlgo(char c, int ... x){
		//Este metodo espera primero un char, luego 0 o muchas variables de tipo it como parametros
	}
	
	void hacerAlgo(Animal ...animals ){
		//Este metodo espera de 0 a muchos objetos de tipo Animal
	}
	
	//Ejemplos de Declaraciones Ilegales
	
	//void hacerAlgo(int x ...){} mala sintaxis
	
	//void hacerAlgo(int ... x, char ... y){} hay mas de un argumento variable, var-args
	
	//void hacerAlgo(String ... s, byte b){} El argumento variable debe estar ubicado al final, no de primero
	
}

class Animal{
	
}


