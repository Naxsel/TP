/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: SieteYMedio.cc
 * Fecha: 19/03/2015
 */

#include "SieteYMedio.h"

using namespace std;

SieteYMedio::SieteYMedio(){}

/*
 * Adapta el valor de las cartas para las reglas del siete y medio
 */
double SieteYMedio::valor(int n){
	switch(n){
	case 10:
		return 0.5;
		break;
	case 11:
		return 0.5;
		break;
	case 12:
		return 0.5;
		break;
	default:
		return n;
		break;
	}
}

/*
 * Metodo auxiliar para calcular los puntos que suman las 3 cartas
 */
void SieteYMedio::suma(Carta** c1, Carta** c2) {
	double suma1=0;
	double suma2=0;
	for (int i = 0; i < 3; i++) {
		suma1=suma1+valor(c1[i]->getNumero());
		suma2=suma2+valor(c2[i]->getNumero());
	}
	if (suma1>7.5 and suma2>7.5){}
	else if (suma1 > 7.5 or suma2 > suma1){
		puntos2++;
	}else{
		puntos1++;
	}
}

/*
 * Juega con una baraja de 40 cartas hasta que se terminan.
 * Devuelve un entero para identificar al ganador
 */
int SieteYMedio::juega() {
	Baraja b;
	Carta ** c1 = new Carta*[3];
	Carta ** c2 = new Carta*[3];
	b.mezcla();
	while (b.cartas() >= 6) {
		for (int i = 0; i < 3; i++) {
			c1[i] = b.cogerCarta();
			c2[i] = b.cogerCarta();
		}
		suma(c1, c2);
	}
	if (puntos1 > puntos2) {
			return 1;
		} else if (puntos2 > puntos1) {
			return 2;
		} else {
			return 0;
		}
}
