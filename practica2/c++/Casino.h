/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Casino.h
 * Fecha: 19/03/2015
 */

#pragma once

#include "SieteYMedio.h"
#include "CartaMasAlta.h"

#define MESAS 20

/**
 * Cabecera de la clase Casino.cc
 */
class Casino{

  /* Atributos privados de la clase Casino */
private:
  int casino;
  int cliente;
  Partida ** p;

  /* Metodos publicos de la clase Casino */
public:
  Casino();
  int rand();
  bool juega();
};
