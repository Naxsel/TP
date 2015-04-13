/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Enlace.java
 * Fecha: 25/03/2015
 */

public class Enlace extends Elemento {
  
  private Elemento origen;
	
  public Enlace(String nombre) {
    this.nombre=nombre;
	}
	
	  public boolean esArchivo () {
	  return false;
  }
    public boolean esDirectorio () {
	  return false;
  }
    public boolean esEnlace() {
	  return true;
  }
}
