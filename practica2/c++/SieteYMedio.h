/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Partida.h
 * Fecha: 19/03/2015
 */

#pragma once

#include "Partida.h"

/**
 * Cabecera de la clase Partida.cc
 */
class SieteYMedio: public Partida {

/* Metodos privados de la clase Partida*/
private:
	void suma(Carta**,Carta**);
	double valor(int);

	/* Metodos publicos de la clase Partida */
public:
	SieteYMedio();
	int juega();
};
