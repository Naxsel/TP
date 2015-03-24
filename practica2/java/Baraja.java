/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Baraja.java
 * Fecha: 19/03/2015
 */

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase Baraja, formada por su metodo constructor, y por los metodos
 * 'cogerCarta', 'mezcla', y 'quedanCartas'.
 */
public class Baraja {
	Random r = new Random();
	private final int cartas = 40;
	private ArrayList<Carta> baraja = new ArrayList<Carta>();
	private int[] valor = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };

	/*
	 * Metodo constructor de la clase Baraja, rellena en orden
	 * una baraja de cartas española
	 */
	public Baraja() {
		for (Palo p : Palo.values()) {
			int i = 0;
			while (i < 10) {
				baraja.add(new Carta(p, valor[i]));
				i++;
			}
		}
	}

	/*
	 *Pre: ---
	 *Post: Realiza una mezcla de cartas de la baraja utilizada
	 */
	public void mezcla() {
		Carta aux;
		int pos;
		for (int i = 0; i < 20; i++) {
			pos = r.nextInt(cartas);
			aux = baraja.get(i);
			baraja.set(i, baraja.get(pos));
			baraja.set(pos, aux);
		}
	}

	/*
	 *Pre: ---
	 *Post: Devuelve un objeto tipo Carta que corresponde a la ultima carta situada en la baraja
	 */
	public Carta cogerCarta() {
		Carta c = baraja.remove(r.nextInt(baraja.size()));
		return c;
	}

	/*
	 *Pre: ---
	 *Post: Devuelve true si la baraja no esta vacia, false en caso contrario
	 */
	public boolean quedanCartas() {
		return baraja.size() > 0;
	}

	public int cartas() {
		return baraja.size();
	}
}
