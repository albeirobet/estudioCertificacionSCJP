package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public interface O4_1_ConstantesEnInterfaces {
	
	/**
	Se tiene permitido poner constantes en una interfaz. Al hacerlo, se garantiza que todas las clases
	que implementen la interfaz tendra acceso a la constante. Colocando las constantes de forma correcta en
	una interfaz, cualquie clase que implemente la interfaz tendra acceso directo a las constantes, como si
	la heredara.
	Se debe recordar una regla clave para las constantes en una interfaz. Siempre deben ser "public static final"
	NOTA: Puesto que las constantes de interfaz son definidas en una interfaz, no tienen que ser declaradas
	como public, static o final. Estas siempre son public, static y final. Cualquier variable definida en una
	interfaz debe ser (e implicitamente lo es) una constante.
	  
	 */
	
	int BAR =42;
	void go();

}

class Zap implements O4_1_ConstantesEnInterfaces {

	public void go() {
	//	BAR = 85; Esta linea da error, ya que no esta permitido  cambiar el valor de una constante,
	//            ya que implicitamente la interfaz le ha marcado como final lo que la convierte en constante
	//			  asi que una clase que implementa la interfaz puede acceder a ella y usarla, pero como solo
    //            lectura.				 
		System.out.println("Imprimiendo la constante:  "+BAR);
	}
	
	/**
	 Mira las siguientes declaraciones de una interfaz que definen tods unas constantes, pero sin
	 necesidad de usar explicitamente los modificadores requeridos
	 */
	
	public int x1=1; //Parece no estatico y no final pero lo es
	int x2= 1; //parece por defecto, no estico y no final pero lo es
	static int x3 =1; //No se muestra como final o public
	final int x4 =1; //No se muestra como statico o public
	public static int x5 = 1; //no se muestra como final
	public final int x6 = 1; //no se muestra como estatico
	static final int x7 = 1; //no se muestra como public
	public static final int x8 = 1; //Asi es como se genera implicitamente todas las constantes en una interfaz
	static public final int x9 =1; //o de esta manera, que es lo mismo
	
	
	
	
}