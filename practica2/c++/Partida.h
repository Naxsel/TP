/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Partida.h
 * Fecha: 03/03/2015
 */

#pragma once

#include "Baraja.h"

/**
 * Cabecera de la clase Partida.cc
 */
class Partida {

	/* Metodos publicos de la clase Partida */
public:

	int puntos1;
	int puntos2;
	Partida();
	virtual int juega()=0;
};
