package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O5_3_Miembros_Protected_Default {
	
	/**
	Los niveles de control de acceso protected y por defecto son casi identicos, pero con una diferencia.
	Un miembro con control de acceso por defecto debe ser accedido solo si la clase que esta accediendo
	esta dentro del mismo paquete, sin embargo un miembro protected puede ser accedido por una subclase
	aunque este en diferentes paquetes.
	
	
	package certification;
	public class OtherClass {
		void testIt() { //No tiene modificador, entonces quedaria con el modificador default explicito
		System.out.println("OtherClass");
		}
	}
	
	package somethingElse;
	import certification.OtherClass;
	class AccessClass {
	static public void main(String[] args) {
	OtherClass o = new OtherClass();
	o.testIt(); //error de compilacion, no se encuentra un metodo que coincida con testIt() en la clase
				//OtherClass
	}
	}
	
	
	El comportamiento del control de acceso por defecto y el protected difiere solo cuando hablamos de 
	subclases. Si la palabra protected es usada para definir un miembro, cualquier subclase de la clase
	declarando el miembro puede acceder a el a traves de la herencia. No nos tenemos que fijar si las
	clases estan en diferentes paquetes, el miembro protected de la superclase es visible a la subclase
	(aunque visible solo en un caso muy especifico como veremos mas adelante). Hay una diferencia con
	el comportamiento que tendria si lo declarasemos como por defecto, ya que no permite a una subclase
	acceder al miembro de una superclase a menos que la subclase este en el mismo paquete que la 
	superclase.
	NOTA: Cuando pienses en acceso por defecto, piensa entonces en la restriccion de paquetes. PEro cuando
	pienses en el tipo de acceso protected, piensa en las restricciones de paquetes e hijos. UNa clase
	con un miembro protected tiene marcado que el miembro tiene acceso a nivel de paquete para todas las
	clases del paquete, pero con una excepcion para las subclases fuera del paquete que heredaria el 
	metodo. No significa, que la subclase fuera del paquete pueda acceder al miembro usuando una 
	referencia a una instancia de la superclase. En otras palabras, protected = herencia. Protected no
	significa que la subclase pueda tratar al miembro protected de la superclase como si fuera public.
	Asi que si la subclase fuera del paquete obtiene una referencia de la superclase (creando la instancia
	en cualquier lugar del codigo de la subclase), la subclase no puede usar el operador punto (.) para
	acceder a un miembro protected de la superclase. Para una subclase un metodo protected significara
	lo mismo que si fuese por defecto (o incluso private), cuando la subclase use una referencia a la
	superclase. La subclase puede ver al miembro protected solo a traves de la herencia.
	
	
	
	 */
	
	protected int numero1 =9; //Esta variable se puede utilizar a nivel de paquete y en las subclases
							  //solo a través de la herencia.
	int numero2 =9; //Esta variable tiene el control de acceso por defecto (default) lo que quiere
					//decir que solo se podra utilizar a nivel del paquete.

}
