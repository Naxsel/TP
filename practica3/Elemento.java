/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Archivo.java
 * Fecha: 20/04/2015
 */

import java.util.ArrayList;

/**
 * Clase generica Elemento, que asemeja uno de los tipos de archivos que
 * podemos encontrar en un arbol de Ficheros
 */
abstract class Elemento {

	protected String nombre;
	protected double size;
	protected ArrayList<String> enl;

	abstract String getName();

	abstract double getSize();

	public void link(String enlace) {
		enl.add(enlace);
	}

	abstract void rm() throws ExcepcionArbolFicheros;

	abstract boolean esDirectorio();

	abstract boolean esArchivo();

	abstract boolean esEnlace();

}
