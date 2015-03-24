/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Partida.java
 * Fecha: 26/02/2015
 */

public class CartaMasAlta extends Partida {

	public CartaMasAlta(){}

	public int juega() {
		//Baraja b = new Baraja ();
		Carta c1, c2;
		while (baraja.quedanCartas()) {
			c1 = baraja.cogerCarta();
			c2 = baraja.cogerCarta();
			//System.out.printf("Carta 1: %s - Carta2: %s%n", c1.print(),c2.print());
			if (c1.gana(c2)) {
				puntos1++;
				//System.out.println("Jugador uno anota un punto");
			} else if (c2.gana(c1)) {
				puntos2++;
				//System.out.println("Jugador dos anota un punto");
			} else {
				//System.out.println("DRAW");
			}
		}

		//System.out.printf("Jugador 1: %d puntos - Jugador 2: %d puntos\n",puntos1,puntos2);
		if (puntos1 > puntos2) {
			//System.out.println("Gana el Jugador 1");
			return 1;
		} else if (puntos2 > puntos1) {
			//System.out.println("Gana el Jugador 2");
			return 2;
		} else {
			//System.out.println("Empate");
			return 0;
		}
	}

}
