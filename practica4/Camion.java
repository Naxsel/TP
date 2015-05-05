/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Camion.java
 * Fecha: 05/05/2015
 */

/**
 *
 * La clase Camion es derivada de la clase QueContiene, y representa el objeto Camion
 *
 */
public class Camion extends QueContiene {

	/*
	 * Constructor de la clase, mediante el cual se da valor al atributo capacidad de su clase
	 * base
	 */
	public Camion (double cap) {
		capacidad = cap;
	}

	/*
	 * Utilizando el volumen del objeto Generico a guardar, llama al metodo
	 * guardar de su clase base y devuelve el resultado de dicha llamada
	 */
	public boolean guardar(Generico g) {
		return super.guardar(g.getVolumen());
	}

}
