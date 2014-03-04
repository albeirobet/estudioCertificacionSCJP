package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O5_4_Variables_Locales_Modificadores_Acceso {

	/**
	 A una variable local NO se le puede aplicar modificadores de acceso. Podemos estar seguros
	 de que cualquier variable local declarada con un modificador de acceso no compilara. De hecho,
	 SOLO el modificador "final" puede ser aplicado a una variable local.
	 La siguiente tabla nos muestra todas las combinaciones de acceso y visibilidad.
	 
	 
	 Visibilidad							     Public			Protected		Default 	Private
	 
	 Desde la misma clase					      SI			   SI   		  SI           SI
	 Desde cualquier clase en el mismo paquete    SI			   SI			  SI	       NO
	 Desde una subclase en el mismo paquete       SI               SI             SI           NO
	 Desde una clase fuera del paquete            SI               SI,con herencia NO          NO
	 Desde cualquer clase no subclase fuera       SI               NO             NO           NO
	 del paquete	 
	 */
	
	public void metodoModificadorLocal(){
		// private int y = 10; Modificador ilegal, no se permiten modificadores en variables locales
		final int x = 8; //El modificador de no acceso final es el unico permitido en  una variable
						 //local.
	}
	
	
}
