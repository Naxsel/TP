/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Enlace.java
 * Fecha: 20/04/2015
 */

import java.util.ArrayList;


/**
 * Clase hija de Elemento, que simula un enlace a un elemento
 */
public class Enlace extends Elemento {

	private String origen;

	public Enlace(String nombre, String origen) {
		this.nombre = nombre;
		this.origen = origen;
		size = 0;
		enl = new ArrayList<String>();
	}

	public void rm() throws ExcepcionArbolFicheros {

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
		return nombre;
	}

	double getSize() {
		return 0;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
