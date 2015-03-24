/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: CartaMasAlta.cc
 * Fecha: 19/03/2015
 */

#include "CartaMasAlta.h"

/**
 * Clase CartaMasAlta, formada por su metodo constructor, y por el metodo
 * 'juega'.
 */

CartaMasAlta::CartaMasAlta(){}

/*
 * Juega con una baraja de 40 cartas hasta que se terminan.
 * Devuelve un entero para identificar al ganador
 */
int CartaMasAlta::juega(){
  Baraja b;
	Carta * c1;
	Carta * c2;
	b.mezcla();
	while (b.quedanCartas()) {
		c1 = b.cogerCarta();
		c2 = b.cogerCarta();
		if (c1->gana(c2)) {
			puntos1++;
		} else if (c2->gana(c1)) {
			puntos2++;
		}
  }
  if (puntos1 > puntos2){
		return 1;
	} else if (puntos2 > puntos1){
		return 2;
	} else {
		return 0;
	}
}
