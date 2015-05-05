/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Contenedor.java
 * Fecha: 05/05/2015
 */

/**
 *
 * La clase Contenedor es derivada de la clase QueContiene, implementa la interfaz
 * Generico y representa el objeto Contenedor. Es una clase generica y dicho contenedor
 * podra contener objetos de tipo SerVivo,Toxico y Generico (Producto y Contenedor)
 *
 */
public class Contenedor<T extends Contenido> extends QueContiene implements Generico {

	/*
	 * Atributo privado
	 */
	private double volumen;

	/*
	 * Constructor de la clase mediante el cual se le da valor al atributo definido, que es
	 * igual a su capacidad, atributo de la clase base
	 */
	public Contenedor (double c) {
		capacidad = c;
		volumen = capacidad;
	}

	/*
	 * Devuelve el volumen del contenedor
	 */
	public double getVolumen () {
		return volumen;
	}

	/*
	 * Utilizando el volumen del objeto a guardar, llama al metodo
	 * guardar de su clase base y devuelve el resultado de dicha llamada
	 */
	public boolean guardar(T t) {
		Contenido c = (Contenido) t;
		return super.guardar(c.getVolumen());
	}

}
