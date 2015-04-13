/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Directorio.java
 * Fecha: 25/03/2015
 */

public class Directorio extends Elemento {

  ArrayList Elemento lista;
  //ArrayList Enlace enl;

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
    double suma=0;
    for (int i=0;i<lista.size()-1;i++){
      suma+=lista.get(i).getSize();
    }
    return suma;
  }
  public void Add(Elemento elmt){
    lista.add(elmt);
    //lista.sort();
  }

  public void print() {
  	for(int i=0, i<lista.size()-1;i++){
  		System.out.println(lista.get(i).getName());
  	}
  }

  public void link(Enlace enlace){

  }

  public Elemento subD (String nombre){
    Elemento e;
    for (int i=0, i<lista.size()-1;i++){
      e = lista.get(i);
      if (e.getName().equals(nombre) && e.esDirectorio()){
        return e;
      }
    }
	  return null;
  }

  public Elemento subE (String nombre){
    for (int i=0, i<lista.size()-1;i++){
      if (lista.get(i).getName().equals(nombre) {
        return lista.get(i);
      }
    }
    return null;
  }


    public boolean esArchivo () {
	  return false;
  }
    public boolean esDirectorio () {
	  return true;
  }
    public boolean esEnlace() {
	  return false;
  }

}
