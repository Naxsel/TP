import java.util.Random;

public class Casino {

	private final int MESAS = 20;
	Random r = new Random();
	Partida[] mesas;

	/**
	 * Gestiona un número de mesas de partidas de cartas determinado. En cada mesa se juega una partida de un juego distinto elegido aleatoriamente,
	 *  en las que el jugador 1 es el cliente y el 2 el propio Casino.
	 */
	public Casino() {
		mesas = new Partida[MESAS];
		for(int i = 0; i < MESAS; i++) {
			int juego = r.nextInt(2);
			if (juego == 0){
				mesas[i] = new CartaMasAlta();
				System.out.println("Jugando a Carta Mas Alta...");
			}
			else{
				mesas[i] = new SieteYMedio();
				System.out.println("Jugando a Siete Y Medio...");
			}
		}
	}


	/*Ejecuta las partidas de todas las	mesas y devuelve un booleano indicando si globalmente el Casino gana (true) o pierde (false).
	  Jugador 1 es el cliente y el 2 el propio Casino */
	public boolean juega () {
		int pCasino = 0,pCliente = 0;
		for(int i = 0; i < MESAS; i++) {
			if (mesas[i].juega() == 1) {
				pCliente++;
			}
			else if(mesas[i].juega() == 2) {
				pCasino++;
			}
		}

		if(pCasino > pCliente) {
			System.out.println("Ha ganado el CASINO");
			return true;
		}
		else {
			System.out.println("Ha ganado el CLIENTE");
			return false;
		}

	}

}
