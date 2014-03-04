package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public interface O4_0_Interfaces {

	/**
	 Cuando se crea un interfaz, se esta definiendo un contrato de lo que la clase podra hacer, mas no
	 de como lo hará. Las interfaces pueden ser implementadas por cualquier clase, desde cualquier arbol
	 de herencia. Esto permite tomar clases diferentes y darles una caracteristica comun. Por ejemplo, la
	 clase Balon y la clase Neumatico tienen Botar como comportamiento, pero Balon y Neumatico no comparten
	 ninguna relacion de herencia (Balon extiende de juguete y Neumatico de java.lang.Object). Pero haciendo
	 que ambas clases implementen la interfaz Botable (del verbo botar), estaremos diciendo que ambos
	 pueden ser tratados como, "cosas que pueden botar", que en el lenguaje Java significa "Cosas que pueden
	 invocar metodos botar() y setBotarFactor()".
	  
	 Una interfaz define metodos abstractos que toman la siguiente forma: 
	 */
	
	abstract void botar();
	
	/**
	 Parece que una interfaz y una clase abstracta son iguales, pero no es así. Mientras una clase
	 abstracta puede definir tanto metodos abstractos como no abstractos, una interfazo solo puede tener
	 metodos abstractos. Otra manera de diferenciar las interfaces de las clases abstractas es que las interfaces
	 tienen muy poca flexibilidad en como los metodos y variables definidas en la interfaz son declaradas.
	 
	 * Todos los metodos de una interfaz son implicitamente publicos y abstractos
	 * Todas las variables definidas en una interfaz deben ser publicas, estaticas y finales, en otras
	   palabras, las interfaces solo pueden declarar constantes, no instancias de variables.
	 * Los metodos de una interfaz no deben ser estaticos
	 * Debido a que los metodos de una interfaz son abstractos, no pueden ser marcados como final, strictfp o nativo
	 * Una interfaz puede extender de una o mas interfaces
	 * Una interfaz no puede extender de cualquier cosa excepto de una interfaz
	 * Una interfaz no puede implementar otra interfaz o clase.
	 * Los tipos de interfaz pueden ser usados polimorficamente
	  
	 Las interfaces son implicitamente abstractas, se considera redundante marcarla como abstracta. Solo
	 debemos saber que las siguientes declaraciones son legales:
	 
	  public abstract interface Rollable {}
	  public interface Rollable {}
	  
	 El modificador "public" es requerido si se desea que la interfaz sea publica y no tenga un nivel
	 de acceso por defecto. 
	  
	 Marcar los metodos con los modificadores public y abstract es redundante, ya que todos los metodos
	 de una interfaz son implicitamente public y abstract.
	 Las siguientes declaraciones son equivalentes  
	 */
	
	 void botear1(); //Sin modificadores de acceso
	 public void botear2(); //Con el modificador public
	 abstract void botear3(); //Con el modificador abstract
	 public abstract void botear4(); //Con el modificador public y abstract
	 abstract public void botear5(); //Igual que el anterior
	 
	 /**
	 
	 Las siguientes declaraciones de metodos de una interfaz no pueden compilar:
	 
	 final void botear(); //final y abstract no pueden ser utilizadas juntas, abstract esta
	 					    definido implicitamente
	 static void bounce(); //No se puede utilizar ya que las interfaces declaran metodos de instancia
	 private void bounce(); //Los metodos de una interfaz deben ser siempre publicos
	 protected void bounce(); //Los metodos de una interfaz deben ser siempre publicos					    
	 
	  */
	
}
