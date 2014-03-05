package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O7_2_Declaracion_Primitivos_Rangos_Primitivos {

	/**
	Las variables primitivas pueden ser declaradas como variables de clase
	(estaticas), instancias de variables, parametros de metodos o variables
	locales. Se puede declarar uno o mas primitivos, del mismo tipo de
	primitivo, en una sola linea. 
	 */
	byte b;
	boolean miBooleanPrimitivo;
	int x, y, z; //declaramos 3 variables primitivas de tipo int
	
	/**
	Para el examen actual, se puede pasar por alto algunos de los detalles,
	pero aun es importante entender que para los tipos enteros la secuencia
	de menor a mayor es: byte, short, int, long y que los double son mayor
	que float.
	
	Todos los seis tipos en Java estan hechos de un numero de 8 bit bytes,
	y son con signo, significa que pueden ser negativos o positivos. El bit
	mas significativo (bit mas a la izquierda) es usuado para representar el
	signo, donde un 1 significa negativo y 0 positivo. El resto de los bits
	representa el valor usando notacion complemento a 2.
	
	Ejemplos:
	
		byte 	0   0000011           7 bits representados en
				+   valor en bits     2^7 o 128 valores diferentes
				
				
		short   1   1111101000000011  15 bits representados en
				-   valor en bits     2^15 o 32768 valores diferentes.
	
	A continuacion se muestra los tipos primitivos con sus tamños y rangos.
	
	
	Tipo		Bits	 Bytes		Minimo 		Maximo
	byte		8		 1			-27			27-1
	short		16		 2			-215		215-1
	int			32		 4			-231		231-1
	long		64		 8			-263		236-1
	float		32		 4			 n/a		n/a
	double		64		 8			 n/a		n/a
	
						
	El rango de los numeros en punto flotante es complicado de determinar, pero afortunadamente
	no necesitamos saberlo para el examen (aunque se espera que sepamos que double tiene 64 bits y
	un flotante tiene 32 bits)
	
	Para los tipos booleanos no hay un rango, un booleano solo puede ser true o false.
	
	El tipo char(un caracter) contiene un unico caracter, 16 bits Unicode. Los caracteres Unicode son
	actualmente representados por enteros sin signo de 16 bits, que significa 216 valores posibles,
	rango desde 0 a 65535 (216)-1. El porque un caracter es realmente un tipo entero se entendera
	despues, pueden ser asignados a cualquier numero lo suficientemente largo hasta llegar a tener
	65535. Aunque el char y el short son tipos de 16 bits, recordar que un short usa 1 bit para
	representar al signo, asi que pocos numeros positivos son aceptables dentro de un short.
	
	 */
	
	
}
