package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O7_4_Declaracion_Variables_Instancia {
	
	/**
	Las variables de instancia estan definidas en la clase, pero fuera de cualquier metodo, y son
	inicializadas  solo cuando la clase es instanciada. Las Variables de instancia son los campos
	que pertenecen a cada objeto unico. POr ejemplo a continuacion se define campos (variables
	de instancia) para el nombre, titulo y gerente de los objetos Empleado
	 */
}

class Empleado{
	
	//Se define los campos (variables de instancia) para las instancias de empleado
	private String nombre;
	private String titulo;
	private String gerente;
	
	//Demas codigo ira aqui incluyendo metodos de acceso para los campos privados.	
}


	/**
	La clase Empleado puede decir que cada instancia de empleado sabrá su propio nombre, titulo y
	gerente. En otras palabras, cada instancia puede tener sus propios valores unicos  de los tres
	campos. Si se observa los terminos, campo, variables de instancia, propiedad o atributo, todas
	virtualmente significan lo mismo.
	
	Es de suma importancia saber lo siguiente:
	
	* Pueden usuar cualquiera de los cuatro nivels de acceso(private, public, protected)
	* Pueden ser marcados como final
	* Pueden ser marcados como transiente
	* No pueden ser marcados como abstract.
	* No pueden ser marcados como syncronized.
	* No pueden ser marcados como strictfp
	* No pueden ser marcados como native.
	* No pueden ser marcados static, porque si no serian variables de clase.

   Se tiene que abarcar los efectos de aplicacion de controles de acceso a variables de instancia
   (trabajan de la misma forma que para los metodos). Mas adelante se explicara que significa
   aplicar el modificador final o transient a una variable de instancia. Primero veremos cual es
   la diferencia entre una variable de instancia y una variable local.
   
   Variables Locales				Variables No Locales						Metodos
   		final								final								final
   											public								public
   											protected							protected
   											private								private
   											static								static
   											abstract							abstract
   											transient						    syncronized
   											volatile							strictfp
   																				native
	
	
	 */
