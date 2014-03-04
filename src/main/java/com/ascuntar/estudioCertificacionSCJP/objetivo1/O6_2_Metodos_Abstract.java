package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O6_2_Metodos_Abstract {
	
	/**
	Un metodo abstracto es un metodo que esta declarado pero no implementado. En otras palabras,
	el metodo no contiene ningun codigo que realice alguna funcionalidad. Y si recordamos la
	seccion que hemos visto sobre clases abstractas, la declaracion de un metodo abstracto no lleva
	las llaves ({}) donde va la implementacion del codigo si no que termina con punto y coma (;). En
	otras palabras el metodo no tiene cuerpo. Tu marcas un metodo abstracto cuando quieres forzar a
	las subclases a que lo implementen. Por ejemplo, si tu escribes  una clase abstracta Car con 
	un metodo abstract goUpHill(), debes querer forzar a cada subtipo de Car a definir el comportamiento
	propio de goUpHill();
	
	public class IllegalClass{
		public abstract void doIt();
	}
	
	Se puede ver como el metodo abstracto termina con punto y coma(;) y no con llaves ({}). Es
	una clase ilegarl ya que al tener un metodo abstracto no esta declarada explicitamente como
	abstract.
	Al contrario de lo anterior se puede tener una clase abstracta la cual no tenga ningun metodo
	abstracto definido dentro de ella.
	
	public abstract class LegalClass{
	void goodMethod() {
	//lots of real implementation code here
	}
	}
	
	En el ejemplo anterior, goodMethod() no es abstracto. A continuacion veremos tres formas diferentes
	de ver que un metodo no es abstracto:
	
	* El metodo no esta marcado como abstract
	* La declaracion del metodo incluye llaves, en vez de terminar con punto y coma (;). En otras
	  palabras, el metodo tiene cuerpo.
	* El metodo tiene codigo.
	 
	Cualquier clase que extienda de una clase abstracta debe implementar todos los metodos abstractos
	de la superclase, a menos que la subclase tambien sea abstracta. La regla es la siguiente.
	
	* La primera subclase que no sea abstracta de una clase que si es abstracta debe implementar todos
	  los metodos abstractos de la superclase.
	
	UN METODO NUNCA PUEDE SER MARCADO CON AMBOS abstract y final, o ambos abstract y private,
	piensa que los metodos abstractos debe ser implementados (que significa sobrescrito por una clase)
	sin embargo final y private los metodos final y private no pueden ser sobrescritos por una subclase.
	En otras palabras, cuando declaramos abstract significa que la superclase no sabe nada sobre como
	las subclases se comportaran en este metodo, sin embargo cuando declaramos final significa que la
	super clase sabe todo sobre como todas las subclases deben comportartse con este metodo.
	Los modificadores abstract y final son virtualmente opuestos.
	Finalmente, se debe saber que el modificador abstract nunca puede ser combinado con el modificador
	static. Lo siguiente seria ilegal
	
		abstract static void doStuff();
		//MyClass.java:2: illegal combination of modifiers abstract and static
	
	 */


}
