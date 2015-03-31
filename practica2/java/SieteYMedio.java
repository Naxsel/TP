/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: SieteYMedio.java
 * Fecha: 19/03/2015
 */

public class SieteYMedio extends Partida {

	public SieteYMedio() {}

	/*
	 * Adapta el valor de las cartas para las reglas del juego.
	 */
	public double valor(int numCarta) {
		double valor;
		switch (numCarta) {
		case 10:
			valor = 0.5;
			break;
		case 11:
			valor = 0.5;
			break;
		case 12:
			valor = 0.5;
			break;
		default:
			valor = numCarta;
			break;
		}
		return valor;
	}

	/*
	 * Metodo auxiliar para calcular los puntos que suman las tres cartas.
	 */
	public double suma(Carta[] c, int jugador) {
		double total = 0.0;
		for(int i = 0; i < 3; i++) {
			total = total + valor(c[i].getNumero());
		}
		return total;
	}

	/*
	 * Juega con una baraja de 40 cartas hasta que se terminan.
   * Devuelve un entero para identificar al ganador
   */
	public int juega () {
		Carta[] trio1 = new Carta[3];
		Carta[] trio2 = new Carta[3];
		while(baraja.cartas() >= 6) {
			for(int i = 0; i < 3; i++) {
				trio1[i] = baraja.cogerCarta();
				trio2[i] = baraja.cogerCarta();
			}
			resul(suma(trio1, 1),suma(trio2, 2));
		}
		if(puntos1 > puntos2) {
			return 1;
		}
		else if(puntos2 > puntos1){
			return 2;
		}
		else {
			return 0;
		}
	}

	/*
	 * Suma un punto al jugador si la suma de sus tres cartas es mayor que la del otro jugador.
	 */
	public void resul (double j1, double j2) {
		if(j1 > 7.5 && j2 > 7.5) {
		}
		else if ((j1 > 7.5) || (j2 > j1)) {
			puntos2++;
		}
		else {
			puntos1++;
		}
	}
}
