/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Archivo.java
 * Fecha: 10/04/2015
 */
 
abstract class Elemento {
	
	private String nombre;
	private double size;
	
	private ArrayList Enlace enl;

	abstract String getName();
		
	abstract double getSize();
	
	abstract void link(Enlace enlace){
  
  
	abstract String getTipo();
  }
	
	
	
}
