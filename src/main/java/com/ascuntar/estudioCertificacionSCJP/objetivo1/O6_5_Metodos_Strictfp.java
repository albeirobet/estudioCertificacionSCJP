package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O6_5_Metodos_Strictfp {

	/**
	Es un modificador que podremos usar como modificador de clase y/o modificador de metodos,
	pero NUNCA como modificador de instancias o variables, no tiene sentido incluso
	si no declaramos una clase cmo Strictfp, aun podemos declarar uno de sus metodos miembro como
	Strictfp. Hay que recordar que Strictfp fuerza a los puntos flotantes a cumplir con el estandar
	IEEE 754. Con Strictfp puedesc predecir como actuaran los puntos flotantes independientemente
	de la plataforma en la que se  este ejecutando la JVM. El problema es que si la plataforma
	sobre la que corre la JVM es capaz de soportar gran precision, un metodo strictfp no sera capaz
	de tomar ventaja de eso.
	Para el examen no necesitamos saber nada sobre Strictfp, solo que puede ser modificador de una 
	clase o metodo y que nunca podria ser declarado con una variable
	 */
	
}
