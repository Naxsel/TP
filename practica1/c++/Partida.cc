/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Partida.cc
 * Fecha: 03/03/2015
 */

#include <iostream>
#include "Partida.h"

using namespace std;

/**
 * Clase Partida, formada por su metodo constructor, y por los metodos 'juega',
 * y 'resultado'.
 */

/* Metodo constructor de la clase Partida, inicializa los dos atributos
 * privados de la clase a 0*/
Partida::Partida() {
	puntos1 = 0;
	puntos2 = 0;
}

/*
 *Pre: ---
 *Post: La baraja se mezcla, y hasta que la baraja se queda sin cartas,
 *		los jugadores cogen una carta cada uno, determinando que numero es el
 *		mayor de las dos y anotando un punto al que ha sacado esa carta.
 *		En caso de empate, no se suman puntos a ninguno de los dos.
 */
void Partida::juega() {
	Baraja b;
	Carta * c1;
	Carta * c2;
	b.mezcla();
	while (b.quedanCartas()) {
		c1 = b.cogerCarta();
		c2 = b.cogerCarta();
		cout << "Carta 1: " << c1->print() << " - Carta 2: " << c2->print()
				<< endl;
		if (c1->gana(c2)) {
			puntos1++;
			cout << "Jugador uno anota un punto" << endl;
		} else if (c2->gana(c1)) {
			puntos2++;
			cout << "Jugador dos anota un punto" << endl;
		} else {
			cout << "DRAW" << endl;
		}
	}
}

/*
 *Pre: ---
 *Post: Imprime por pantalla el resultado final de la partida, señalando
 *      los puntos de cada jugador y que jugador ha ganado, o si se ha producido un empate.
 */
void Partida::resultado() {
	cout << "Jugador 1: " << puntos1 << " puntos - Jugador 2: " << puntos2
			<< " puntos" << endl;
	if (puntos1 > puntos2) {
		cout << "Gana el Jugador 1" << endl;
		return;
	}
	if (puntos2 > puntos1) {
		cout << "Gana el Jugador 2" << endl;
		return;
	}
	cout << "Empate" << endl;
}
