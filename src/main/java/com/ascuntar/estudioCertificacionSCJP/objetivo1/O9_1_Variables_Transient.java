package com.ascuntar.estudioCertificacionSCJP.objetivo1;

import java.io.Serializable;

public class O9_1_Variables_Transient implements Serializable{

	/**
	Cuando se marca una instancia de variable como transient, se le esta diciendo a la JVM que
	ignore esa variable cuando trate de serializar el objeto que la contiene. La serializacion
	es una de las caracteristicas mas buenas de Java; permite guardar el valor de su variable
	instanciada en un tipo especial de flujo de I/O. Con la serializacion se puede guardar
	un objeto a un fichero por ejemplo.
	*/
	String codigo;
	transient String nombre;
	String apellido;
	/**
	En este caso cuando se serialize el objeto de esta clase no se tendra en cuenta
	el atributo nombre, ya que lo hemos marcado como transient.
	 */
	
}
