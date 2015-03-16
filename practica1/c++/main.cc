/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: main.cc
 * Fecha: 03/03/2015
 */

#include <random>
#include "Partida.h"

using namespace std;

/**
 * Clase principal main, con un unico metodo main, el cual se encarga de iniciar una partida y mostrar el resultado una vez terminada.
 */

int main(int argc, char* argv[]) {
	Partida p;
	p.juega();
	p.resultado();

	return 0;
}
