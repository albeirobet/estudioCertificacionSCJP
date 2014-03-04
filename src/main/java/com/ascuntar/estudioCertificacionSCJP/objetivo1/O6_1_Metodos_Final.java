package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O6_1_Metodos_Final {
	
	/**
	La palabra clave "final" previene a un metodo de ser sobrescrito en una subclase, y se hace a 
	menudo par cumplir funcionalidad del metodo. Por ejemplo, la clase Thread tiene un metodo
	llamado isAlive() que comprueba si un hilo esta activo. Si tu extiendes de la clase Thread, no
	hay forma de que tu puedas implementar ese metodo, ya que el diseñado la marco como final. 
	Debemos tener cuidado a la hora de utilizarlo, ya que previenes que una subclase sobrescriba un
	metodo y con esto quitamos muchos beneficios de la Orientacion a Objetos como la extensibilidad.
	La declaracion de un metodo final de manera tipica es similiar al siguiente:
	 */
	
	public final void showEjemplo(){
		System.out.println("Algo a imprimir");
	}
}

	/**
	Es legar extender a O6_1_Metodos_Final, ya que la clase no esta marcada como final, pero 
	no podremos sobrescribir el metodo final showEjemplo(), como se intenta hacer a continuacion
	 */
class Subclase extends O6_1_Metodos_Final{
	
	//public void showEjemplo(){
	//	System.out.println("Algo a imprimir en Subclase");
	//}
	/**
	 Como podemos observar, se intenta sobrescribir un metodo final que se encuentra en la superclase
	 al hacer esto el compilador nos dara un error, diciendonos que el metodo declarado en la subclase
	 no puede sobrescribir el metodo final del mismo tipo declarado en la super clase.
	 
	 
	 Argumentos final
	 
	 Los argumentos de un metodo son las declaraciones de variables que aparecen entre los parentesis
	 en la declaracion del metodo. Una declaracion tipica de metodo con multiples argumentos es parecido
	 a lo siguiente:	 
	 */
	
	public void modificarRecord(int numeroFila, int numeroRecord){
		//Hacer algo dentro del metodo
	}
	
	/**
	Los argumentos de un metodo son esencialmente lo mismo que variables locales. En el ejemplo anterior
	ambas variables numeroFila y numeroRecord siguen las reglas aplicadas a las variables locales.
	Esto significa que pueden tambien tener el modificador final:
	 */
	public void modificarRecordFinal(int numeroFila, final int numeroRecord){
		//Hacer algo dentro del metodo
		/**
		 En este ejemplo, la variable numeroRecord esta declarada como final, lo que significa
		 que no podremos modificalrla dentro del metodo. En este caso, "modificar" significa reasignarle
		 un nuevo valor a la variable. En otras palabras, un argumento final debe mantener el mismo
		 valor que tuvo cuando fue pasado al metodo.
		 */
	}
	
}

