/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Archivo.java
 * Fecha: 20/04/2015
 */

/**
 * Clase excepcion para controlar errores comunes del usuario a la hora
 * de introducir los comandos
 */
public class ExcepcionArbolFicheros extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcepcionArbolFicheros(String msj) {
		super(msj);
	}

}
