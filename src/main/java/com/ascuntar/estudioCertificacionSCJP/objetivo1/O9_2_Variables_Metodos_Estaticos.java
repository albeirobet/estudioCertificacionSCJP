package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O9_2_Variables_Metodos_Estaticos {
	
	/**
	El modificador static es usado para crear variables y metodos que existiran independientemente
	de cualquier instancia creada por la clase. En otras palabras, los miembros static existen
	antes incluso de crear una nueva instancia de la clase. En otras palabras, todas las instancias
	de una clase tienen el mismo valor para una variable statica.
	Cosas que podemos marcar cmo static:
	
	* Métodos
	* Variables
	* Una clase anidada dentro de otra clase, pero no dentro de un metodo
	* Bloques de inicializazion
	 */

	static class hola{
		//Ejemplo clase statica anidada dentro de otra.
	}
	
	/**
	Cosas que no podemos marcar como static:
	
	* Constructores (hacerlo no tiene sentido, un constructor es usuado solo para crear instancias).
	* Clases (a menos que esten anidadas como el caso anterior)
	* Interfaces
	* Metodos locales dentro de clases 
	* Metodos dentro de clases y variables de instancia
	* Variables locales.
	
	Hay que tener especial cuidado con las siguientes aclaraciones:
	
			
	* Los metodos estaticos no pueden acceder a una variable de instancia. (no estatica)
		int size = 42;
		static void hacerMas(){
			int x = size; //Error de compilacion
		}
		
	* Los metodos estaticos no pueden acceder a metodos no estaticos
	  	void go();
	  	static void hacerMas(){
	  		go(); //Error de compilacion
	  	}
	  	
	* Los metodos estaticos pueden acceder a a metodos y variables estaticas.
	 	static int count;
	 	static void woo(){};
	 	static void hacerMas(){
	 		woo();
	 		int x = count;
	 	}
	 	Compila correctamente
	 		
		
	* Si se modifica una variable statica o metodo statico este cambio se va a ver reflejado
	  en todas las instancias de la clase.	
		
	 */
	
	
}
