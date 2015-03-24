/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Partida.java
 * Fecha: 26/02/2015
 */

public class SieteYMedio extends Partida {

//Cada jugador recibe 3 cartas. Se suman los puntos de esas cartas. Gana el jugador que mas se acerca a 7'5 sin pasarse.
//Termina cuando no quedan cartas suficientes como para repartir a las 2 personas(no quean 6 cartas vaya).
	public SieteYMedio() {}

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


	public double suma(Carta[] c, int jugador) {
		double total = 0.0;
		for(int i = 0; i < 3; i++) {
			total = total + valor(c[i].getNumero());
		}
		return total;
	}


	public void resul (double j1, double j2) {
		if(j1 > 7.5 && j2 > 7.5) {
			//System.out.println("Empate");
		}
		else if ((j1 > 7.5) || (j2 > j1)) {
			//System.out.println("Gana el jugador 2");
			puntos2++;
		}
		else { //if((j2 > 7.5) || (j1 > j2)) {
			//System.out.println("Gana el jugador 1");
			puntos1++;
		}
	}
}
