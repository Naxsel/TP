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
		// TODO Auto-generated method stub
		return null;
	}

	double getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}
