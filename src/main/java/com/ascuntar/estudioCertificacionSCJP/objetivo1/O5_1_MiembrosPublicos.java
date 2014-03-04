package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O5_1_MiembrosPublicos {
	
	/**
	Cuando un miembro es declarado public significa que todas las clases, independientemente del
	paquete al que pertenezca, pueden acceder al miembro (asumiendo que la clase es visible).
	
	Por ejemplo el siguiente codigo:
	
	package cert;
	public class Sludge {
	public void testIt() { System.out.println("sludge"); }
	}
	
	
	package book;
	import cert.*;  Importa todas las clases en el paquete "cert"
	class Goo {
	public static void main(String[] args) {
	Sludge o = new Sludge();
	o.testIt();
	}
	}
	
	Como podemos ver, la clase Goo y Sludge se encuentran en diferentes paquetes. Sin embargo, Goo
	puede invocar al metodo testIt() en Sludge sin problemas debido a que la clase Sludge y el metodo
	testIt() son publicos.
	
	Desde una subclase, si un miembro de de la superclase es declarado publico, la subclase hereda esos
	miembros independientemente de si estan o no en el mismo paquete las clases. 
	
	package cert;
	public class Roo {
	public String doRooThings() {
	//imagine the fun code that goes here
	return "fun";
	}
	
	La clase Roo declara el miembro doRooThings() como publico. Asi que nosotros creamos una subclase
	de Roo, cualquier codigo de la subclase podra llamar a su propio metodo doRooThings() el cual fue
	heredado.
	
	package notcert;// Not the package Roo is in
	import cert.Roo;
	class Cloo extends Roo {
	public void testCloo() {
	System.out.println(doRooThings());
	}
	}
	
	Mira en el codigo anterior como el metodo doRooThings() es invocado sin necesidad de tener una
	referencia. Recuerda, si tu ves un metodo invocado (o una variable accedida) sin el operador punto (.)
	sabras que el metodo o la variable estan siendo implicitamente accedidos usando la referencia this.
	Asi	que en el codigo anterior, la llamada a doRooThings() en la clase Cloo podria haberse escrito 
	tambien como this.doRooThings(). La referencia this siempre se refiere al actaul objeto en ejecucion,
	en otras palabras, el codigo donde tu ves la referencia this.
	
	Ademas de ser capaz de invocar al metodo doRooThings() por si misma, el codigo de alguna otra clase
	puede llamar a doRooThings() con una instancia de Cloo
	
	Roo r = new Roo();
	r.doRooThings();
	  
	 */
	
	//Ejemplos de miembros publicos
	
	public int numero; //cariables de instancia
	public int numero2=2;
	public void metodo1(){ //metodo
		System.out.println("Este es un metodo publico");
	}

}
