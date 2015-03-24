/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Baraja.h
 * Fecha: 19/03/2015
 */

#pragma once

#include "Carta.h"
#define TOTAL 40

/**
 *  Cabecera de la clase Baraja.cc
 */
class Baraja {

	/* Atributos privados de la clase Baraja */
private:
	unsigned int ultima = 39;
	int valor[10] = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };
	Carta* baraja[TOTAL];
	int rand();

	/* Metodos publicos de la clase Baraja */
public:
	Baraja();
	Carta* cogerCarta();
	void mezcla();
	bool quedanCartas();
	int cartas();
};
