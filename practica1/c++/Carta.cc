/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Carta.cc
 * Fecha: 03/03/2015
 */

#include <string>
#include <iostream>
#include "Carta.h"

using namespace std;

/**
 * Clase Carta, formada por su metodo constructor, y por los metodos 'getPalo',
 *  'getNumero', 'gana' y 'print'.
 */

/* Metodo constructor de la clase Carta,da valor a los atributos de la clase */
Carta::Carta(Palo p, int n) {
	palo = p;
	numero = n;
}

/*
 *Pre: ---
 *Post: Devuelve el valor del atributo palo
 */
Palo Carta::getPalo() {
	return palo;
}

/*
 *Pre: ---
 *Post: Devuelve el valor del atributo numero
 */
int Carta::getNumero() {
	return numero;
}

/*
 *Pre: c es un puntero a Carta valido
 *Post: Devuelve true si el valor del numero de c es menor que el numero de carta que realiza la llamada, false en caso contrario
 */
bool Carta::gana(Carta* c) {
	if (numero > c->getNumero()) {
		return true;
	} else {
		return false;
	}
}

/*
 *Pre: ---
 *Post: Devuelve una cadena que contiene el numero y el palo de la carta correspondiente,  *quedando la carta, asi, definida completamente
 */
string Carta::print() {
	string s, p;
	switch (numero) {
	case 1:
		p = "As";
		break;
	case 2:
		p = "Dos";
		break;
	case 3:
		p = "Tres";
		break;
	case 4:
		p = "Cuatro";
		break;
	case 5:
		p = "Cinco";
		break;
	case 6:
		p = "Seis";
		break;
	case 7:
		p = "Siete";
		break;
	case 10:
		p = "Sota";
		break;
	case 11:
		p = "Caballo";
		break;
	default:
		p = "Rey";
		break;
	}
	switch (palo) {
	case 0:
		s = " de oros";
		break;
	case 1:
		s = " de espadas";
		break;
	case 2:
		s = " de copas";
		break;
	default:
		s = " de bastos";
		break;
	}
	return p + s;
}
