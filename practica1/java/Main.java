/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Main.java
 * Fecha: 26/02/2015
 */


import java.util.Random;


/**
 * Clase principal main, con un unico metodo main, el cual se encarga de
 * iniciar una partida y mostrar el resultado una vez terminada.
 */
public class Main {
	public static void main(String[] args) {
		Partida p = new Partida();
		p.juega();
		p.resultado();
	}
}
