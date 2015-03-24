/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Carta.h
 * Fecha: 19/03/2015
 */

#pragma once

#include <string>
#include <iostream>
#include "Palo.h"

using namespace std;

/**
 *  Cabecera de la clase Carta.cc
 */
class Carta {

	/* Atributos privados de la clase Carta */
private:
	Palo palo;
	int numero;

	/* Metodos publicos de la clase Carta */
public:
	Carta(Palo, int);
	Palo getPalo();
	int getNumero();
	bool gana(Carta *);
	string print();
};
