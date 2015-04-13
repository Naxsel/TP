/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Archivo.java
 * Fecha: 25/03/2015
 */

public class Archivo extends Elemento {

  public Archivo(String nombre, int size) {
    this.nombre= nombre;
    this.size=size;
  }

  public String getNombre() {
    return nombre;
  }

  public double getSize() {
    return size;
  }

  public void setNombre(String nom) {
    this.nombre = nom;
  }

  public void setSize(double tam) {
    this.size = tam;
  }
  
  public void link(Enlace enlace){
  
  }
  
  public boolean esArchivo () {
	  return true;
  }
    public boolean esDirectorio () {
	  return false;
  }
    public boolean esEnlace() {
	  return false;
  }

}
