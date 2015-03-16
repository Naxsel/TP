/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Partida.h
 * Fecha: 03/03/2015
 */
#include "Baraja.h"

/**
 * Cabecera de la clase Partida.cc
 */
class Partida {

	/* Atributos privados de la clase Partida */
private:
	int puntos1;
	int puntos2;

	/* Metodos publicos de la clase Partida */
public:
	Partida();
	void juega();
	void resultado();
};
