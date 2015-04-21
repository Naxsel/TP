/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Enlace.java
 * Fecha: 13/04/2015
 */

import java.util.ArrayList;

public class Enlace extends Elemento {

	private String origen;

	public Enlace(String nombre, String origen) {
		this.nombre = nombre;
		this.origen = origen;
		size=0;
		enl = new ArrayList<Enlace>();
	}

	public void rm() {

	}

	public boolean esArchivo() {
		return false;
	}

	public boolean esDirectorio() {
		return false;
	}

	public boolean esEnlace() {
		return true;
	}

	String getName() {
		return null;
	}

	double getSize() {
		return 0;
	}

	public void setSize(int size) {
		this.size=size;
	}
}
