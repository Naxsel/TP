/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Main.java
 * Fecha: 19/03/2015
 */

/**
 * Clase principal main, con un unico metodo main, el cual se encarga de
 * iniciar una partida y mostrar el resultado una vez terminada.
 */
public class Main {

	public static void main(String[] args) {
		Casino c = new Casino();
		if(c.juega()) {
			System.out.println("Casino ha ganado");
		}
		else {
			System.out.println("Casino no ha ganado");
		}
	}
}
