/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: CartaMasAlta.java
 * Fecha: 19/03/2015
 */



/**
 * Clase CartaMasAlta, formada por un metodo constructor vacio, y por el metodo 'juega'.
 */
public class CartaMasAlta extends Partida {

	public CartaMasAlta(){}

	/*
	 * Juega con una baraja de 40 cartas hasta que se terminan. Devuelve el entero que identifica al ganador.
	 */
	public int juega() {
		Carta c1, c2;
		while (baraja.quedanCartas()) {
			c1 = baraja.cogerCarta();
			c2 = baraja.cogerCarta();
			if (c1.gana(c2)) {
				puntos1++;
			} else if (c2.gana(c1)) {
				puntos2++;
			}
		}

		if (puntos1 > puntos2) {
			return 1;
		} else if (puntos2 > puntos1) {
			return 2;
		} else {
			return 0;
		}
	}

}
