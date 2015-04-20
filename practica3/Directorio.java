/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Directorio.java
 * Fecha: 13/04/2015
 */

import java.util.ArrayList;

public class Directorio extends Elemento {

	ArrayList<Elemento> lista;

	public Directorio(String nombre) {
		this.nombre = nombre;
		lista = new ArrayList<Elemento>();
		enl = new ArrayList<Enlace>();
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public double getSize() {
		double suma = 0;
		for (int i = 0; i < lista.size(); i++) {
			suma += lista.get(i).getSize();
		}
		return suma;
	}

	public void Add(Elemento elmt) {
		lista.add(elmt);
		// lista.sort();
	}

	public void borrar(String nombre) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getName().equals(nombre)) {
				lista.get(i).rm();
			}
		}
	}

	public void rm() {
		while (lista.size() > 0) {
			lista.get(0).rm();
			lista.remove(0);
		}
	}

	public void print() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getName());
		}
	}

	public Elemento subD(String nombre) {
		Elemento e;
		for (int i = 0; i < lista.size(); i++) {
			e = lista.get(i);
			if (e.getName().equals(nombre) && e.esDirectorio()) {
				return e;
			}
		}
		return null;
	}

	public Elemento subE(String nombre) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getName().equals(nombre)) {
				return lista.get(i);
			}
		}
		return null;
	}

	public boolean esArchivo() {
		return false;
	}

	public boolean esDirectorio() {
		return true;
	}

	public boolean esEnlace() {
		return false;
	}

}
