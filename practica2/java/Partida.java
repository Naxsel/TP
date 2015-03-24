/**
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Partida.java
 * Fecha: 26/02/2015
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
	 *Pre: ---
	 *Post: La baraja se mezcla, y hasta que la baraja se queda sin cartas,
	 *		los jugadores cogen una carta cada uno, determinando que numero es el
	 *		mayor de las dos y anotando un punto al que ha sacado esa carta.
	 *		En caso de empate, no se suman puntos a ninguno de los dos.
	 */
	abstract int juega();
	//Devuelve 1 si gana el jugador uno,2 si el dos.




	/*
	 *Pre: ---
	 *Post: Imprime por pantalla el resultado final de la partida, señalando
	 *      los puntos de cada jugador y que jugador ha ganado, o si se ha producido un empate.

	public int resultado() {
		System.out.printf("Jugador 1: %d puntos - Jugador 2: %d puntos\n",puntos1,puntos2);
		if (puntos1 > puntos2) {
			System.out.println("Gana el Jugador 1");
			return 1;
		} else if (puntos2 > puntos1) {
			System.out.println("Gana el Jugador 2");
			return 2;
		} else {
			System.out.println("Empate");
			return 0;
		}
	}
	*/
}
