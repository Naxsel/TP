/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Archivo.java
 * Fecha: 13/04/2015
 */

import java.util.ArrayList;

abstract class Elemento {

	protected String nombre;
	protected double size;
	protected ArrayList<Enlace> enl;

	abstract String getName();

	abstract double getSize();

	public void link(Enlace enlace) {
		enl.add(enlace);
	}

	abstract void rm();

	abstract boolean esDirectorio();

	abstract boolean esArchivo();

	abstract boolean esEnlace();

}
