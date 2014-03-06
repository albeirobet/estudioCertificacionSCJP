package com.ascuntar.estudioCertificacionSCJP.objetivo1;



public class OP10_Declaracion_Enumeraciones {
	
	/**
	Java permite restringir una variable para tener solo unos valores predefinidos, en otras 
	palabras, un valor de una lista enumerada. (Los objetos de las listas enumeradas, soprendentemente
	se llaman, enumeraciones).
	Usar enumeraciones puede ayudar a reducir errores de programacion en nuestro codigo. Por ejemplo,
	si en una cafeteria se quisiera restringir el tamaño del cafe a Grande, Enorme, o Abismal. Si
	alguien pide un cafe Largo, podria aparecer un error. Enumeraciones al rescate. Con 
	la siguiente declaracion, se puede garantizar que el compilador no mostrara otro tamaño
	de cafea que no sea uno de los tamaños que ya se ha predefinido.
	
	NOTA: Un enum solo puede ser declarado como public o por default
	NOTA2: Es opcional colocar un ";" al final de la declaracion de un enum
	 */

	enum tamanioCafe { GRANDE, ENORME, ABISMAL}
	
	/**
	Para poder obtener el tamaño se debe hacer de la siguiente forma
	 */
	
	tamanioCafe tamanio = tamanioCafe.GRANDE;
	
	/**
	No se requiere que la constante enum sea en mayusculas, pero coger prestada la convencion de Sun
	es una buena idea. Los componentes basicos de una enumeracion son sus constantes, aunque en un
	minuto veras que puede haber un monton de cosas en una enumeracion. Las enumeraciones pueden ser
	declaradas como una clase propia, o mimbro de una clase, sin embargo, no pueden ser declarados
	dentro de un metodo.
	 */
	
	fueraDeUnaClase tamanio2;
	
}

enum fueraDeUnaClase{
	BIG, SMALL
}

enum CoffeeSize { BIG, HUGE, OVERWHELMING } 

    /**
 	Asi que, que conseguimos cuando se crea una enumeracion? La cosa mas importante que recordar
 	es que una enumeracion no es String o int. Cada miembro de la enumeracion CoffeSize es una
 	instancia e CoffeSize. En otras palabras, BIG es un tipo de CoffeSize.
 	Imagina que una enumeracion como una clase como la siguiente.
 	
 	class CoffeSize{
		public static final CoffeSize BIG = new CoffeSize("BIG", 0);
		public static final CoffeSize BIG = new CoffeSize("HUGE", 1);
		public static final CoffeSize BIG = new CoffeSize("OVERWHELMING", 2);
	}
	
	Ahora nos podemos dar cuenta que cada valor de la enumeracion son instancias de CoffeSize,
	Estos son representados como estaticos y finales, lo cual en el mundo de Java, se trata
	como si fueran una constante. Tambien se debe saber que cada valor de la enumeracion conoce
	la posicion en la que esta indexado, en otras palabras, el orden en que los valores son 
	declarados es muy importante. Se puede imaginar la enumeracion CoffeSize como un array
	de tipo CoffeSize.

    */


