package com.ascuntar.estudioCertificacionSCJP.objetivo1;

public class O5_2_MiembrosPrivados {
	
	/**
	Los miembros marcados como "private" no pueden ser accedidos
	por codigo desde cualquier clase distinta de la clase en la que
	el miembro es declarado. 
	
	Por ejemplo el siguiente codigo:
	
	package cert;
	public class Sludge {
	private void testIt() { System.out.println("sludge"); }
	}
	
	
	package book;
	import cert.*;  Importa todas las clases en el paquete "cert"
	class Goo {
	public static void main(String[] args) {
	Sludge o = new Sludge();
	o.testIt(); //Error de compilacion
	}
	}
	
	Si intentamos compilar Goo, obtendremos un error del compilador parecido
	al siguiente:
	cannot find symbol
	symbol: metho testIt()
	
	Es como si el moetodo no existiera. Un miembro privado es invisible a cualquier codigo fuera
	de los propios miembros de la clase.
	Cuando un miembro es declarado como privado, una subclase no puede heredarlo. Para el examen, 
	necesitamos reconocer que una subclase no puede ver o usar el miembro privado de la superclase.
	Podemos sinembargo, declarar un metodo similar en la subclase. Pero independientemente de como se
	vea, no es un metodo sobrescrito. Es simplemente un metodo que resulta tener el mismo nombre que un
	metodo privado(del cual no se sabe nada) de la superclase. Las reglas de sobrescritura no se aplican
	asi que puedes hacer con el metodo lo que quieras.
	
	 */

	public class Roo {
		private String doRooThings(){
			return "hi from doRooThings";
		}
	}
	
	class Cloo extends Roo{
		public void testCloo(){
			//System.out.println("Llamado al metodo privado:  "+doRooThings());
			//La linea anterior da un error de compilacion, ya que el metodo doRooThings()
			//no es visible aunque la clase Roo sea publica.
		}
	}
}
	
	/**
	 NOTA: Aunque tengamos permitido marcar instancias de variables como publicas, en la practica
	 es mejor marcarlas como private o protected. Si las variables necesitan ser cambiadas, o leidas desde
	 el exterior el programador debera usar metodos de acceso publicos para acceder a ellas. Asi que
	 el codigo en cualquier otra clase tiene que llamar al get o set de la variable, en lugar de acceder
	 a ellar directamente. Los metodos de acceso toman la forma get (para booleanos is), y set, y proporcionan
	 un lugar donde verificar y validar antes de devolver o modificar el valor.
	 
	 Un metodo privado no puede ser sobrescrito por una subclase. Desde la subclase, como hemos visto
	 no podemos heredar un metodo privado, por lo tanto no se puede sobrescribir al metodo. 
	  
	  
	 */
	
