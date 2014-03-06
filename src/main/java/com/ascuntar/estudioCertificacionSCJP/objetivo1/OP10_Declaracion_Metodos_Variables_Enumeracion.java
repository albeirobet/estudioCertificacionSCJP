package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class OP10_Declaracion_Metodos_Variables_Enumeracion {
	
	/**
	Dado que un enumerado realmente es un tipo especial de clase, puedes hacer algo mas que la
	lista de valores constantes enumerados. Puedes añadir constructores, variables de instancia,
	metodos y algo realmente extraño como una constante especifica del cuerpo de la clase. Para
	entender porque tu necesitas mas en tu enumeracion, imaginate este escenario: Quieres saber
	el actual tamaño, en onzas, de cada una de las tres constantes CoffeSize. Por ejemplo, tu 
	quieres saber que BIG tiene 8 8 onzas, HUGE 10 onzas y OVERWHELMING 16 onzas.
	Podrias hacer algun tipo de tabla, usando alguna otra estructura de datos pero seria un mal
	diseño y duro mantenimiento. La forma mas simple es tratar a los valores de los enumerados 
	como objetos que pueden tener cada uno su propia variables de instancia. Entonces tu puedes
	asignar esos valores a la vez que inicializas los enumerados, pasandole un valor al construc
	tor del enumerado. Vamos a ver el siguiente codigo:
	 */
}

enum CoffeSize{
	BIG(8), HUGE(10), OVERWHELMIN(16);
	//Los argumentos despues del valor del enum son pasados  como valores al constructor
	//que recibe enteros, para este caso.
	
	private int onzas;
	CoffeSize(int onzas) {
		this.onzas=onzas; //se le asigna el valor a una variable de instancia
	}
	public int getOunces(){
		return onzas;
	}	
}

class Coffe{
	CoffeSize size;//Cada instancia de Coffe tiene un enum de tipo CoffeSize
	
	public static void main(String[] args){
		Coffe drink1 = new Coffe();
		drink1.size = CoffeSize.BIG;
		
		Coffe drink2 = new Coffe();
		drink2.size = CoffeSize.OVERWHELMIN;
		
		System.out.println(drink1.size.getOunces());// Imprime 8
		System.out.println(drink2.size.getOunces());// Imprime 16
	}	
}
	/**
	Los puntos clave a recordar sobre los constructores de los enumerados son:
	
	* Nunca puedes invocar directamente el constructor de un enumerado. El constructor de un
	  enumerado es invocado automaticamente, con los argumentos tu defines el valor de la constante
	  Por ejemplo BIG(8) invoca al constructor de CoffeSize que toma un valor int, pasandole el
	  valor 8
	* Puedes definir mas de un argumento para el constructor y sobrecargar los constructores de
	  enumerados, al igual que puedes sobrecargar un constructor de una clase normal. 
	  
	Y finalmente, puedes definir algo realmente extraño en un eneumerado  que se ve como una clase
	interna anonima (de la cual se hablara mas adelante). Se conoce como una constante especifica
	del cuerpo de una clase y se usa cuando necesitas una constante particular para anular un 
	metodo definido en el enumerado.	
	 */
	
enum TamanioCafe{
	BIG(8), HUGE (10){
		//Comienza un bloque de codigo que define el cuerpo para esta constante
		public String getLidCode(){ //Sobrescribe el metodo definido en TamanioCafe
		
			return "Z";
		}		
	}, OVERWHELMING(16){
		//Comienza un bloque de codigo que define el cuerpo para esta constante
		public String getLidCode(){ //Sobrescribe el metodo definido en TamanioCafe
		
			return "A";
		}		
	}; //En este caso es Requerido que la declaracion termine con un punto y coma ";"
	private int onzas;
	
	public int getOunces(){
		return onzas;
	}	
	
	TamanioCafe(int onzas){
		this.onzas=onzas;
	}
	
	public String getLidCode(){ //Este metodo es sobrescrito por la constante OVERWHELMING
		return "B"; //El valor por defecto que se desea retorne para las constantes de TamanioCafe
	}
}


