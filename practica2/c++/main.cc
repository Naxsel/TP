/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: main.cc
 * Fecha: 03/03/2015
 */

#include "Casino.h"

using namespace std;

/**
 * Clase principal main, con un unico metodo main, el cual se encarga de iniciar
 * un casino con 20 mesas, donde se jugaran aleatoriamente al siete y medio, o
 * carta mas alta, y notificara si el casino gana o pierde
 */

int main(int argc, char* argv[]) {
	Casino c;
	if(c.juega()){
		cout << "Casino ha ganado"<<endl;
	}else{
		cout << "Casino no ha ganado"<<endl;
	}
	return 0;
}
