package practica4;


/**
 * La clase Toxico representa el objeto Toxico e implementa la interfaz Contenido
 */

public class Toxico implements Contenido {


	/*
	 * Atributos privados
	 */
	private String nombre;
	private double volumen;
	
	

	/*
	 * Constructor de la clase, es la unica manera de dar valor a los atributos definidos
	 */
	public Toxico (double volumen, String nombre) {
		this.nombre = nombre;
		this.volumen = volumen;
	}

	
	/*
	 * Devuelve el valor del volumen del toxico. No existe el mismo metodo para el nombre
	 * porque no era necesaria su implementacion.
	 */
	public double getVolumen() {
		return volumen;
	}

}
