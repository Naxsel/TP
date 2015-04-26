/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Archivo.java
 * Fecha: 20/04/2015
 */

import java.util.ArrayList;

/**
 * Clase hija de Elemento, que simula un archivo
 */
public class Archivo extends Elemento {

	public Archivo(String nombre, int size) {
		this.nombre = nombre;
		this.size = size;
		enl = new ArrayList<String>();
	}

	public String getName() {
		return nombre;
	}

	public double getSize() {
		return size;
	}

	public void setName(String nom) {
		this.nombre = nom;
	}

	public void setSize(double tam) {
		this.size = tam;
	}

	public void rm() throws ExcepcionArbolFicheros {

	}

	public boolean esArchivo() {
		return true;
	}

	public boolean esDirectorio() {
		return false;
	}

	public boolean esEnlace() {
		return false;
	}

}
