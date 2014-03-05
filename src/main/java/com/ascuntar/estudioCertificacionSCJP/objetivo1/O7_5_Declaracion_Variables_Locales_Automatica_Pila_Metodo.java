package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O7_5_Declaracion_Variables_Locales_Automatica_Pila_Metodo {
	
	int countShadowing =90; //variable de instancia

	/**
	Las variables locales estan declaradas dentro de un metodo. Esto significa que la variable
	no esta inicializada dentro del metodo. Ya que la variable local empieza su vida dentro del
	metodo, es tambien destruida cuando el metodo sea completado. Las variables locales estan 
	siempre en la pila, no en el heap. Aunque el valor de la variable debe ser pasado a otro 
	metodo entonces almacenara el valor en una variable de instancia, la variable por si sola
	vive solo dentro del ambito del metodo.
	No se debe olvidar que la variable esta en la pila, si la variable es un objeto refererencia,
	el objeto aun sera creado en la heap. No hay una pila de objetos, solo una pila de variable.
	Las declaraciones de variables locales no pueden usar mas tipos de modificadores que pueden
	ser aplicados a una variable de instnacia, como public (o los otros modificadores de acceso),
	transient, volatile, abstract o static, pero como vimos anteriormente las variables locales 
	pueden ser marcadas como final. 
	Hay que tener en cuenta ante todo que una variable local antes de poder ser usada debe ser
	inicializada con un valor.
	 */
	
	public void logIn(){
		int count =10; //Esta es una variable local, ya que se encuentra dentro de un
					   //metodo
		final int count2=20;//Este es otro ejemplo valido de variable local, con el modificador
							//de no acceso final
	}
	
	/**
	Normalmente inicializaremos una variable local en la misma linea en que se declara, aunque puede
	que aun sea necesario reinicializarla mas tarde en el metodo. La clave es que una variable local
	debe ser inicializada antes de intentar usarla. El compilador rechazara cualquier codigo que
	intente usar una variable local que no tenga asignado un valor, porque a diferencia de las
	variables de instancia, las variables locales no obtienen valores por defecto.
	Una variable local no puede estar referenciada en cualquier codigo fuera del metodo en que esta
	declarada. En el anterior codigo, seria imposible referenciar a la variable count desde cualquier 
	otro lugar de la clase excepto dentro del ambito del metodo logIn().
	
	 */
	
	public void hacerAlgo(){
		// count =100; En esta linea se genera un erro ya que no se puede acceder a la
					   //variable count fuera del metodo logIn()
	}
	/**
	Es posible declarar una variable local con el mismo nombre que una variable de instancia. Esto
	es conocido como shadowing, como se muestra a continuacion
	 */
	
	public void hacerAlgo2(){
		int countShadowing =180;
		System.out.println(countShadowing+"  "+this.countShadowing);
	}
}



