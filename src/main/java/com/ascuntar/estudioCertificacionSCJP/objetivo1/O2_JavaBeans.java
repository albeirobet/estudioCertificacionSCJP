package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O2_JavaBeans {

	/**
	 * En primer lugar, los JavaBeans son clases Java que tienen propiedades. Para nuestro proposito, pensar que
	 * las propiedades son instancias de variable private. Asi la unica manera de acceder a dichas
	 * propiedades desde fuera de la clase es a través de métods de la clase. Los metodos que 
	 * cambian el valor de las propiedades son metodos setter y los metodos para recuperar el valor
	 * de las propiedades son getters.
	 
	* Si la propiedad no es un booleano, el prefijo del metodo getter debe ser get. 
	* Si la propiedad es un boolean, el prefigo del metodo getter debe ser get o is. (ambos son validos)
	* El prefijo del metodo setter debe ser set.
	* Para completar el nombre de un metodo getter o setter, cambiamos el primer caracter de la propiedad
	  a mayuscula y le ponemos el prefijo get, set o is respectivamente.
	* Los metodos getter no reciben argumentos y devuelven un tipo de la propiedad. Deben ser declarados
	  public
	  
	* En segundo lugar, la especificacion JavaBeans soporta eventos, que permiten a componentes notificar
	* a otros que algo ha sucedido, son muy utilizados en aplicaciones GUI (por ejemplo click del raton). 
	* Los objetos que reciben la informacion de un evento ocurrido se llaman listeners (oyentes). Es necesario
	* saber que los metodos que se utilizan para añadir o eliminar oyentes de un evento deben tambien seguir
	* la norma de denominacion de JavaBean, que describimos ahora:

	* Los nombres de los metodos Listener, usados para "registrar" a un oyente en un evento, deben usar
	  el prefijo add seguido del tipo del oyente.
	* Los nombres de los metodos Listener, usados para "eliminar" a un oyente en un evento, deben usuar 
	  el prefijo remove seguido del tipo del oyente. 
	* El tipo del oyente que sera añadido o eliminado debe ser pasado como argumento al metodo.   
 
	 */
	
	private String nombre;
	private boolean estado;
	
	public O2_JavaBeans() {
		// Este es el constructor por defecto
	}
	
	//Los siguientes son ejemplos de JavaBeans Validos
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public boolean isEstado(){
		return estado;
	}
	
	public void setEstado(boolean estado){
		this.estado=estado;
	}
	
	/**
	 * JavaBeans Validos para soporte de eventos
	  
	 public void addMyListener(MyListener m)
	 
	 public void removeMyListener(MyListener m)
	  
	 */
	
	//Los siguientes son ejemplos de JavaBeans Invalidos
	
	/**
	 
	 void setNombre(String nombre) //El metodo debe ser publico
	 public void modifyNombre(String nombre) //no es correcto usar 'modify', se debe utilizar set
	 public void addXListener(MyListener m) //listener type mismatch
	 
	 */
	

	/**
	 * Debemos tener claro la diferencia que existe entre lo que son identificadores legales y las
	 * convenciones de nombres "namming conventions". Es decir, usted debe ser capaz de reconocer un
	 * identificador que es legal aunque no se ajuste a las normas de nomenclatura. Si el examen pregunta
	 * sobre convenciones de nombres se mencionará explicitamente.
	 */
	
}
