package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O8_0_Declaracion_Arrays {
	
	/**
	En java, los arrays son objetos que almacenan multiples variables del mismo tipo, o variables
	que son subclases del mismo tipo. Los arrays pueden tener tanto primitivos como referencias a
	objetos, pero el propio array siempre es un objeto en la heap, incluso si el array es declarado
	para tener elementos primitivos. En otras palabras,
	
	Para el examen se necesitan saber 3 cosas:
	
	* Como crear un array como variable de referencia(declarar)
	* Como crear un objeto array (constructor)
	* Como rellenar el array con elementos (incializar)

 	Los arrays son declarados indicando el tipo de elementos que el array contendra(objeto o primitivo),
 	seguido de corchetes a cada lado del identificador.	
	 */
	
	//Declarando array de primitivos
	
	int[] key;  //Colocar los corchetes antes del nombre es lo recomendado
	int key2 []; //Colocar los corchetes despues del nombre es lega (pero es menos legible)
	
	//Declarando array de objetos (referencias)
	
	Thread [] threads; //Recomendado
	Thread [] threads2; //Legal pero menos legible

	/**
	Podemos tambien declarar arrays multidimensionales, que son en realidad arrays de arrays. Esto
	se puede hacer de la siguiente manera.
	 */
	
	String [][][] occupantName;
	String [] hola [][];
	String hola2 [][][];
	String [][]hola3[];
	String [][][] hola4;
	String [][] managerName;
	
	/**
	Las primeras cinco declaraciones son ejemplos de un array tridimensional, hay que tener en cuenta
	que aunque las cinco formas de declaracion son legales solo la primera es correcta y es la mas
	legible. La ultima declaracion es un array bidimensional.
	
	NOTA IMPORTANTE: Nunca es legal incluir el tamaño de la matriz en la declaracion. Esto tal vez
	se puede hacer en otros lenguajes de programacion asi que es posible que salgan preguntas de este
	tipo.
	
	int [5] notas;
	
	EL codigo anterior no se compilará. Recuerde que la JVM no asigna espacio en memoria hasta que en
	realidad se crea una instancia del objeto matriz. Es en este momento cuando el tamaño de verdad
	importa.
	 */
	
	
}
