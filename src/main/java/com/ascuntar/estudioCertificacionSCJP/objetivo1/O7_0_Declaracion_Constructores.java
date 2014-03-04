package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O7_0_Declaracion_Constructores {
	
	/**
	En Java, los objetos estan construidos. Cada vez que queremos crear un objeto, necesitamos
	invocar a su constructor. Todas las clases tienen un constructor, si no se crea un constructor
	explicitamente, el compilador construira uno por nosotros. Hay muchas reglas concernientes a los
	constructores, las cuales se veran mas adelante, por ahora nos enfocaremos en las reglas basicas de
	declaracion. 
	 */

}

class Foo{
	
	protected Foo(){} //Este es un constructor de la clase Foo
	
	protected void Foo(){} //Este metodo es legal, aunque esta mal nombrado ya que tiene 
						   //el nombre de un constructor.
		
}

/**
Lo primero que vemos es que los constructores son como metodos. Una diferencia clave es que un
constructor nunca tiene un tipo return. Las declaraciones de constructores pueden tener todos los
modificadores de acceso normal y pueden tomar argumentos (incluyendo var-args), como los metodos.
La otra GRAN REGLA que tenemos que entender de los constructores es que deben ser llamados
como la clase en la que son declarados. Los constructores no pueden ser marcados como static
(estan asociados con instancias de objeto), nunca pueden ser marcados como final o abstrac
(poruqe pueden ser sobrescritos). 
*/

class Foo2{
	
	//Constructores Legales
	
	Foo2(){}	
	// private Foo2(){} Este constructor es legal, pero estaria duplicado con el primero
	Foo2(int x){}
	Foo2(int x, int ... y){}
	
	/**
	 Constructores ilegales
	 
	 void Foo2(){} Es un metodo, no es un constructor, tiene retorno, aunque no causaria
	 			   problemas de compilacion.
	 
	 Foo(){} No es un metodo, porque no retorna nada, ni es un constructor ya que no tiene
	 		 el mismo nombre de la clase.
	 Foo2(short s); Este luce como un metodo abstracto
	 static Foo2(float f){} //Un constructor no puede ser estatico
	 final Foo2(long x){} Un constructor no puede ser final
	 abstract Foo2 (char c){} Un constructor no puede ser abstracto
	 Foo2 (int ... x, int t){} La declaracion de argumentos variables, tiene una mala sintaxis ya
	   						   siempre tienen que ser declarados al final.
	   						   	 
	 */
	
}