/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: SerVivo.java
 * Fecha: 05/05/2015
 */

/**
 * La clase SerVivo representa el objeto Ser Vivo e implementa la interfaz Contenido
 */

public class SerVivo implements Contenido {

	/*
	 * Atributos privados
	 */
	private String nombre;
	private double volumen;

	/*
	 * Constructor de la clase, es la unica manera de dar valor a los atributos definidos
	 */
	public SerVivo (double volumen, String nombre) {
		this.nombre = nombre;
		this.volumen = volumen;
	}

	/*
	 * Devuelve el valor del volumen del ser vivo. No existe el mismo metodo para el nombre
	 * porque no era necesaria su implementacion.
	 */
	public double getVolumen() {
		return volumen;
	}

}
