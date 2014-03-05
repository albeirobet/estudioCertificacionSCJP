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
	Podemos tambien declarar arrays multidimensionales, 
	 */
	
}
