/**
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Partida.java
 * Fecha: 19/03/2015
 */

/**
 * Clase Partida, formada por su metodo constructor, y por los metodos 'juega',
 * y 'resultado'.
 */
abstract class Partida {

	/*Atributos privados de la clase Partida */
	int puntos1, puntos2;
	Baraja baraja;


	/* Metodo constructor de la clase Partida, inicializa los atributos
	 * privados de la clase a 0, y crea una instancia de baraja*/
	public Partida() {
		puntos1 = 0;
		puntos2 = 0;
		baraja = new Baraja();
	}

	/*
	 * La baraja se mezcla, y hasta que la baraja se queda sin cartas,
	 *		los jugadores cogen una carta cada uno, determinando que numero es el
	 *		mayor de las dos y anotando un punto al que ha sacado esa carta.
	 *		En caso de empate, no se suman puntos a ninguno de los dos.
	 */
	abstract int juega();

}
