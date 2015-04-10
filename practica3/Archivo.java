/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Archivo.java
 * Fecha: 25/03/2015
 */

public class Archivo {

  private String nombre;
  private double size;

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

}
