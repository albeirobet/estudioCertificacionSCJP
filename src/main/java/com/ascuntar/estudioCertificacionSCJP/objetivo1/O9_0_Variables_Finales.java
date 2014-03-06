package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O9_0_Variables_Finales {
	
	/**
	Declarando una variable con la palabra final haces que sea imposible reinicializar las variables
	una vez haya sido inicializada con valor explicito (por defecto). Para los primitivos, esto 
	significa que una vez que la variable tiene asignado el valor, el valor no puede ser alterado.
	Por ejemplo  si se asigna 10 a una variable x de tipo entero,  entonces la variable x va a 
	permanecer  con un valor de 10, siempre. Una variable referenciada marcada como final no puede
	incluso ser reasignada para referirse a un objeto diferente. El dato dentro del objeto puede
	ser modificado, pero la referencia de la variable no puede ser cambiada. Nos debemos quedar con:
	no hay datos finales, solo referencias finales. Esto se explica con mas detalle mas adelante.
	Ahora vamos a ver como el modificador final puede ser aplicado a clases, methodos y variables.
	
	 */

}

 //Clase final, recuerda que no se puede extender de ella (no se puede heredar de ella)

final class claseFinal{
	
	//Variable final, no se puede asignarle un nuevo valor.
	final int tamanio =42;
	
	//Metodo final, recuerda que no puede ser sobrescrito por una subclase
	final void metodoFinal(){
		
		//Intentado asignarle un nuevo valor a la variable final, error de compilacion
		//tamanio=89;
	}

}
