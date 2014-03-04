package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O5_0_MiembrosDeUnaClase {

	/**
	 Los metodos e instancias son conocidos normalmente como miembros. Podemos modificar un miembro con 
	 ambos modificadores de acceso y no acceso, y tenemos mas modificadores a elegir y combinar, que
	 cuando se declara una clase.
	 
	 Modificadores de Acceso
	 Donde una clase puede usar dos de los cuatro niveles de control de acceso(por defecto y public),
	 los miembros pueden usarlos todos (los cuatro);
	 * public
	 * protected
	 * private
	 * default
	 La proteccion por defecto es cuando tu no indicas en la declaracion del metodo ningun tipo de 
	 modificador de acceso. El control de acceso por defecto y protected tienen casi el mismo comportamiento
	 excepto una diferencia que se mirara con la herencia. 
	
	 
	 */
	
}

 /**
   Es crucial entender los dos diferentes tipos de acceso:
   
   *El primer tipo de acceso es cuando de una clase se intenta acceder al metodo o a las variables
   	de otra clase, usando el operador punto (.) para invocar un metodo o recuperar una variable. Por ejemplo
   
  */

 class Zoologico {
	 public String buenMetodo(){
		 return "Woooow baby";
	 }
 }
 
 class Mugido{
	 public void usandoZoologico(){
		 Zoologico zoo = new Zoologico();
		 //La linea anterior compila Mugido que tiene acceso a Zoologico, pero se tiene
		 //acceso al metodo buenMetodo()?
		 System.out.println("Zologico dice:  "+zoo.buenMetodo());
		 //La linea anterior funciona ya que Mugido puede accesar el metodo publico buenMetodo()
	 }
 }
	
 /**
  * El segundo tipo de acceso es cuando una clase hereda los miembros de otra clase. Para este caso
    debemos recordar, que si una clase hereda un miembro, la subclase tiene dicho miembro 
  * 
  */
 
 class Zoologico2 {
	 public String buenMetodo2(){
		 return "Wooow baby 2";
	 }
 }
 
 class Mugido2 extends Zoologico2{
	 public void usandoZoologico2(){
		 //Tiene la clase Mugido2 una instancia de buenMetodo2()?
		 System.out.println(" Mugido2 dice:   "+this.buenMetodo2());
		 //La linea anterior funciona porque Mugido2 puede heredar los metodos publicos
		 //de Zoologico2
		 //Puede una instancia de Mugido2 invocar a buenMetodo2() sobre una instancia de Zoologico2?
		 Zoologico2 zoo2 = new Zoologico2();
		 System.out.println("Zoologico2 dice:  "+zoo2.buenMetodo2());
		 //buenMetodo2() es publico, entonces Mugido2 puede invocarlo en un una referencia de Zoologico
		 //en este caso zoo2		 
	 }	 
 }
 
 /**
   Hay tres maneras de acceder a un metodo
   * Invocando un metodo declarado en la misma clase
   * Invocando un metodo usando una referencia de la clase
   * Invocando un metodo a traves de la herencia
   
  Muchos de los controles de acceso se centran en mirar si las dos clases involucraas estan en el mismo
  o en un paquete diferente. No olvidar, sin embargo, que si la clase A en si no puede ser accedida por
  la clase B, entonces no hay miembros de la clase A que puedan ser accedidos por la clase B.
  
  Debemos saber el efecto de diferentes combinaciones de acceso de clases y miembros (tal como una
  clase por defecto con una variable publica). Primero debemos mirar el nivel de acceso de la clase.
  Si la clase en si no es visible a otras clases, entonces ninguno de los miembros, aunque sean public,
  seran visibles tampoco. Una vez hayamos confirmado que la clase es visible, entonces debemos mirar el
  nivel de acceso individual de cada miembro.
   
  */

