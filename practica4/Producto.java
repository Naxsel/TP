/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Producto.java
 * Fecha: 05/05/2015
 */

/**
 *
 * La clase Producto representa un producto no especial. Para ello, implementa la interfaz
 * Generico
 *
 */
public class Producto implements Generico {

	/*
	 * Atributos privados de la clase
	 */
	private String nombre;
	private double volumen;

	/*
	 * Constructor de la clase mediante el cual se da valor a los atributos de la clase
	 */
	public Producto(double volumen, String nombre) {
		this.nombre = nombre;
		this.volumen = volumen;
	}

	/*
	 * Devuelve el volumen del objeto Producto
	 */
	public double getVolumen () {
		return volumen;
	}

}
