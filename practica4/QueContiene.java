/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: QueContiene.java
 * Fecha: 05/05/2015
 */

/**
 * La clase QueContiene representa objetos que pueden contener a otros dentro(contenedores
 * y camiones)
 */
public class QueContiene {

	/*
	 * Atributo protegido
	 */
	protected double capacidad;

	/*
	 * Devuelve true si el objeto QueContiene tiene capacidad para guardar otro objeto con volumen
	 * v, y en ese caso actualiza el valor de capacidad al realizar el proceso de guardado.
	 * Devuelve false en caso contrario.
	 */
	public boolean guardar(double v) {
		if(v <= capacidad) {
			capacidad -= v;
			return true;
		}
		else {
			return false;
		}
	}

}
