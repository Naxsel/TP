/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Directorio.java
 * Fecha: 25/03/2015
 */

public class Directorio {

  private String nombre;
  private double size;
  ArrayList Archivo archivos;
  ArrayList Directorio subdirectorios;
  ArrayList Enlace enlace;

  public Directorio(String nombre) {
    this.nombre = nombre;
  }

  public String getName() {
    return nombre;
  }

  public void setName(String name) {
    this.nombre = name;
  }

  public double getSize(){
    double sumna=0;
    for (int i=0;i<archivos.size()-1;i++){
      suma+=archivos(i).getSize();
    }
    for (int i=0;i<subdirectorios.size()-1;i++){
      suma+=subdirectorios(i).getSize();
    }
    for (int i=0;i<enlace.size()-1;i++){
      suma+=enlace(i).getSize();
    }
    return suma;
  }
  public void list(){
    //ArrayList Strings
    for (int i=0;i<archivos.size()-1;i++){
      System.out.println(archivos(i).getName());
    }
    for (int i=0;i<subdirectorios.size()-1;i++){
      System.out.println(subdirectorios(i).getName());
    }
    for (int i=0;i<enlace.size()-1;i++){
      System.out.println(enlace(i).getName());
    }
  }

}
