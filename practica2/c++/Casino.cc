/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Casino.cc
 * Fecha: 19/03/2015
 */

#include <random>
#include "Casino.h"

using namespace std;

/*
 * Metodo para decidir de forma aleatoria el juego de la mesa
 */
int Casino::rand() {
	static random_device rdev;
	static default_random_engine rgen(rdev());
	static uniform_int_distribution<int> rdis(0,1);
	return rdis(rgen);
}

/*
 * Constructor del casino (20 mesas)
 */
Casino::Casino(){
  casino=0;
  cliente=0;
  p = new Partida*[MESAS];
  int n;
  for (int i=0; i<MESAS;i++){
    n=rand();
    if (n==0){
      p[i]= new CartaMasAlta();
    }else{
      p[i]= new SieteYMedio();
    }
  }
}

/*
 * Devuelve verdad si el casino ha ganado la mayoria
 * de las partidas
 */
bool Casino::juega(){
  int ganador;
  for (int i=0; i<MESAS;i++){
    ganador = p[i]->juega();
    if (ganador == 1){
      cliente++;
    }else if(ganador==2){
      casino++;
    }
  }
	cout << "Resultados de las partidas: "<<endl;
	cout << "Clientes: "<<cliente<< " puntos"<<endl;
	cout << "Casino: "<<casino<<" puntos"<<endl;
	return (casino>cliente);
}
