/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Baraja.cc
 * Fecha: 19/03/2015
 */

#include <random>
#include <vector>
#include "Baraja.h"

using namespace std;

/**
 *Clase Baraja, formada por su metodo constructor, y por los metodos 'cogerCarta', 'mezcla', y 'quedanCartas'.
 */

/*
 * Metodo constructor de la clase Baraja, rellena en orden una baraja de cartas española
 */
Baraja::Baraja() {
	int idx;
	idx = 0;
	for (int j = 0; j < 4; ++j) {
		for (int i = 0; i < 10; i++) {
			baraja[idx] = new Carta(Palo(j), valor[i]);
			idx++;
		}
	}
}

/*
 * Devuelve un puntero a Carta que corresponde a la ultima carta situada en la baraja
 */
Carta* Baraja::cogerCarta() {
	Carta * c = baraja[ultima];
	ultima--;
	return c;
}

/*
 * Devuelve un número aleatorio entre 0 y 39
 */
int Baraja::rand() {
	static random_device rdev;
	static default_random_engine rgen(rdev());
	static uniform_int_distribution<int> rdis(0,39);
	return rdis(rgen);
}

/*
 * Realiza una mezcla de cartas de la baraja utilizada
 */
void Baraja::mezcla() {
	int pos;
	for (int i = 0; i < 20; i++) {
		pos = rand();
		Carta * aux = baraja[i];
		baraja[i] = baraja[pos];
		baraja[pos] = aux;
	}
}

/*
 * Devuelve true si la baraja no esta vacia, false en caso contrario
 */
bool Baraja::quedanCartas() {
	return ultima + 1 > 0;
}

/*
 * Devuelve el nº de cartas restantes de la baraja
 */
int Baraja::cartas(){
	return ultima;
}
