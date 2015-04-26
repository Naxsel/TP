/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Ruta.java
 * Fecha: 20/04/2015
 */

import java.util.ArrayList;

/**
 * Clase Ruta
 */
public class Ruta {

	ArrayList<Directorio> ruta;

	public Ruta(Directorio raiz) throws ExcepcionArbolFicheros {
		try {
			ruta.size();
			throw new ExcepcionArbolFicheros("Ya existe una ruta");
		} catch (NullPointerException e) {
			ruta = new ArrayList<Directorio>();
			ruta.add(raiz);
		}
	}

	/**
	 * Devuelve la ruta completa, con todos los nombres de los directorios desde
	 * la raiz hasta el directorio actual concatenados y separados por el
	 * separador /.
	 */
	String pwd() {
		String s = "";
		for (int n = 0; n < ruta.size(); n++) {
			if (s.equals("/")) {
				s = s + ruta.get(n).getName();
			} else {
				s = s + "/" + ruta.get(n).getName();
			}
		}
		return s;
	}

	/**
	 * Muestra por pantalla los nombres de todos los ficheros, directorios y
	 * enlaces contenidos en la ruta actual, cada uno de ellos en una linea
	 * diferente, sin ningun dato mas.
	 */
	void ls() {
		Directorio actual = ruta.get(ruta.size() - 1);
		actual.print();
	}

	/**
	 * Cambia la ruta a otro directorio (path), pasándole el nombre del
	 * directorio al que quiere cambiar. Hay tres casos especiales: “.” se
	 * refiere al directorio actual, “..” se refiere al directorio anterior en
	 * el árbol de directorios y “/” se refiere a la raíz del árbol de
	 * directorios. También se le puede pasar como parámetro una ruta completa
	 * (varios directorios separados por “/”).
	 */
	void cd(String path) throws ExcepcionArbolFicheros {
		@SuppressWarnings("unchecked")
		ArrayList<Directorio> aux = (ArrayList<Directorio>) ruta.clone();
		if (!path.equals(".") && !path.equals("") && !path.equals(null)) {
			if (path.equals("..")
					&& !(ruta.get(0).equals(ruta.get(ruta.size() - 1)))) {
				if (ruta.size() != 1) {
					ruta.remove(ruta.size() - 1);
				}
				pwd();
			} else {
				boolean cond = true;
				Directorio D;
				int i = 0;
				String[] s = path.split("/");
				if (path.charAt(0) == '/') {
					if (s.length == 1 && s[0].equals("/")) {
						while (ruta.size() > 1) {
							ruta.remove(ruta.size() - 1);
						}
						pwd();
					} else {
						while (aux.size() > 1) {
							aux.remove(aux.size() - 1);
						}
						while (i < s.length - 1 && cond) {
							D = (Directorio) aux.get(i).subD(s[i + 1]);
							try {
								D.getName();
								aux.add(D);
								i++;
							} catch (NullPointerException e) {
								cond = false;
								throw new ExcepcionArbolFicheros(
										"no existe la ruta introducida");
							}
						}
						if (cond) {
							ruta = aux;
							pwd();
						}
					}
				} else {
					while (i < s.length && cond) {
						D = (Directorio) aux.get(aux.size() - 1).subD(s[i]);
						try {
							D.getName();
							aux.add(D);
							i++;
						} catch (NullPointerException e) {
							cond = false;
							throw new ExcepcionArbolFicheros(
									"no existe la ruta introducida");
						}
					}
					if (cond) {
						ruta = aux;
						pwd();
					}
				}
			}
		} else {

		}

	}

	/**
	 * Muestra por pantalla un número que es el tamaño del archivo, directorio o
	 * enlace dentro de la ruta actual identificado por la cadena de texto que
	 * se le pasa como parámetro. También se le puede pasar una ruta completa.
	 */
	void stat(String element) throws ExcepcionArbolFicheros {
		Elemento e;
		if (element.equals("/")) {
			e = ruta.get(0);
		} else {
			e = localizar(element);
		}
		try {
			System.out.println(e.getSize() + " bytes");
		} catch (NullPointerException e2) {
			throw new ExcepcionArbolFicheros(
					"No existe el elemento introducido");
		}
	}

	/**
	 * Devuelve el elemento dentro de la ruta actual, o raiz identificado con la
	 * cadena de texto que se pasa como parametro. Devuelve el elemento si
	 * existe, sino un null
	 */
	private Elemento localizar(String path) throws ExcepcionArbolFicheros {
		if (!path.equals(null) && !path.equals("..") && !path.equals("")) {
			if (path.equals(".")) {
				return ruta.get(ruta.size() - 1);
			} else {
				@SuppressWarnings("unchecked")
				ArrayList<Directorio> aux = (ArrayList<Directorio>) ruta
						.clone();
				boolean cond = true;
				Directorio D = aux.get(aux.size() - 1);
				int i = 0;
				String[] s = path.split("/");
				if (path.charAt(0) == '/') {
					if (s.length == 1 && s[0].equals("/")) {
						while (aux.size() > 1) {
							aux.remove(aux.size() - 1);
						}
						System.out.println(pwd());
						return aux.get(aux.size() - 1);
					} else {
						while (aux.size() > 1) {
							aux.remove(aux.size() - 1);
						}
						D = aux.get(aux.size() - 1);
						while (i < s.length - 2 && cond) {
							D = (Directorio) aux.get(i).subE(s[i + 1]);
							try {
								D.getName();
								aux.add(D);
								i++;
							} catch (NullPointerException e) {
								cond = false;
								throw new ExcepcionArbolFicheros(
										"no existe la ruta introducida");
							}
						}
						if (cond) {
							return D.subE(s[s.length - 1]);
						} else {
							throw new ExcepcionArbolFicheros(
									"no existe la ruta introducida");
						}
					}
				} else {
					while (i < s.length - 1 && cond) {
						D = (Directorio) aux.get(aux.size() - 1).subE(s[i]);
						try {
							D.getName();
							aux.add(D);
							i++;
						} catch (NullPointerException e) {
							cond = false;
							throw new ExcepcionArbolFicheros(
									"no existe la ruta introducida");
						}
					}
					if (cond) {
						return D.subE(s[s.length - 1]);
					} else {
						throw new ExcepcionArbolFicheros(
								"no existe la ruta introducida");
					}
				}
			}
		}
		return null;
	}

	/**
	 * Cambia el tamaño de un archivo dentro de la ruta actual (no se le puede
	 * pasar como parámetro una ruta completa). Si el archivo no existe dentro
	 * de la ruta actual, se crea automáticamente con el nombre y tamaño
	 * espeficados. Si el archivo referenciado por “file” es en realidad un
	 * enlace a un archivo, también cambia su tamaño.
	 */
	void vim(String file, int size) throws ExcepcionArbolFicheros {
		if (!(file.charAt(0) == ('/'))) {
			String s[] = file.split("/");
			String rut = "";
			Directorio padre;
			if (s.length != 1) {
				for (int i = 0; i < s.length - 1; i++) {
					rut += s[i] + "/";
				}
				rut = rut.substring(0, rut.length() - 1);
				padre = (Directorio) localizar(rut);
			} else {
				padre = ruta.get(ruta.size() - 1);
			}
			Elemento e = padre.subE(s[s.length - 1]);
			try {
				if (e.esArchivo()) {
					Archivo a = (Archivo) e;
					a.setSize(size);
				}
				if (e.esEnlace()) {
					Enlace en = (Enlace) e;
					en.setSize(size);
				}
				if (e.esDirectorio()) {
					throw new ExcepcionArbolFicheros(
							"Ya existe como directorio");
				}
			} catch (NullPointerException e1) {
				Archivo a = new Archivo(s[s.length - 1], size);
				padre.Add(a);
			}
		} else {
			throw new ExcepcionArbolFicheros("No se permiten rutas completas");
		}
	}

	/**
	 * Crea un directorio dentro de la ruta actual. No se le puede pasar como
	 * parámetro una ruta completa.
	 */
	void mkdir(String dir) throws ExcepcionArbolFicheros {
		String s[] = dir.split("/");
		if (s.length == 1) {
			Directorio actual = ruta.get(ruta.size() - 1);
			Elemento e = actual.subE(dir);
			try {
				e.getName();
				throw new ExcepcionArbolFicheros(
						"Ya existe un directorio con ese nombre");
			} catch (NullPointerException e3) {
				Directorio D = new Directorio(dir);
				actual.Add(D);
			}
		}
	}

	/**
	 * Crea un enlace simbólico de nombre “dest” a que enlaza el elemento
	 * identificado mediante el nombre “orig”. “dest” no puede contener una ruta
	 * completa, pero “orig” sí, de tal modo que pueden crearse enlaces
	 * simbólicos entre elementos dentro de diferentes posiciones del árbol de
	 * directorios.
	 */
	void ln(String orig, String dest) throws ExcepcionArbolFicheros {
		String s[] = dest.split("/");
		if (dest.charAt(0) != '/' && s.length == 1) {
			Elemento e = localizar(orig);
			Directorio actual = ruta.get(ruta.size() - 1);
			Enlace en;
			try {
				en = (Enlace) actual.subE(dest);
				en.getName();
				throw new ExcepcionArbolFicheros(
						"Ya existe un elemento con ese nombre");
			} catch (java.lang.ClassCastException c) {
				throw new ExcepcionArbolFicheros(
						"Ya existe un elemento con ese nombre");
			} catch (NullPointerException e2) {
				try {
					e.getName();
					en = new Enlace(dest, orig);
					actual.Add(en);
					String s1 = pwd();
					if (s1.charAt(s1.length() - 1) == '/') {
						dest = s1 + dest;
					} else {
						dest = s1 + "/" + dest;
					}
					e.link(dest);
				} catch (NullPointerException e3) {
					throw new ExcepcionArbolFicheros(
							"No existe el elemento referenciado");
				}
			}
		} else {
			throw new ExcepcionArbolFicheros("Parametros mal introducidos");
		}
	}

	/**
	 * Elimina un elemento dentro de la ruta actual (puede pasársele como
	 * parámetro una ruta completa). Si es un archivo es simplemente eliminado.
	 * Si es un enlace elimina el enlace pero no lo enlazado. Si es un
	 * directorio, elimina el directorio y todo su contenido. Los enlaces a
	 * elementos borrados, sin embargo, siguen enlazando al elemento borrado.
	 * Así pues, para eliminar completamente un elemento hay que borrar el
	 * elemento y todos los enlaces que apuntan a dicho elemento de forma
	 * manual.
	 */
	void rm(String e) throws ExcepcionArbolFicheros {
		String s[] = e.split("/");
		String rut = "";
		Directorio D;
		boolean b = true;
		for (int i = 0; i < s.length - 1; i++) {
			rut += s[i] + "/";
		}
		if (rut.length() != 0) {
			rut = rut.substring(0, rut.length() - 1);
			D = (Directorio) localizar(rut);
		} else {
			D = ruta.get(ruta.size() - 1);
		}
		try {
			for (int i = 0; i < D.lista.size(); i++) {
				if (D.lista.get(i).getName().equals(s[s.length - 1])) {
					Elemento e1 = D.lista.get(i);
					D.lista.remove(i);
					if (e1.esDirectorio()) {
						rmenl((Directorio) e1);
						Directorio D1 = (Directorio) e1;
						rmenl(D1);
						while (D1.lista.size() > 0) {
							rmaux(pwd() + "/" + D1.lista.get(0).getName());
							D1.lista.remove(0);
						}
					}
					while (e1.enl.size() > 0) {
						rmaux(e1.enl.get(0));
						e1.enl.remove(0);
					}
					b = false;
				}
			}
			if (b){
				throw new ExcepcionArbolFicheros("No existe la ruta introducida");
			}
		} catch (NullPointerException e5) {
			throw new ExcepcionArbolFicheros("No existe la ruta introducida");
		}
	}

	/**
	 * Metodo auxiliar complementario a rm para encargarse de eliminar los
	 * enlaces a los archivos borrados
	 */
	private void rmenl(Directorio D) throws ExcepcionArbolFicheros {
		while (D.lista.size() > 0) {
			while (D.lista.get(0).enl.size() > 0) {
				rmaux(D.lista.get(0).enl.get(0));
				D.lista.get(0).enl.remove(0);
			}
			if (D.lista.get(0).esDirectorio()) {
				rmenl((Directorio) D.lista.get(0));
			}
			D.lista.remove(0);

		}
	}

	/**
	 * Identico a rm pero trabaja con rutas completas
	 */
	private void rmaux(String e) throws ExcepcionArbolFicheros {
		String s[] = e.split("/");
		String rut = "/";
		Directorio D;
		for (int i = 0; i < s.length - 2; i++) {
			rut += s[i + 1] + "/";
		}
		if (rut.length() > 1) {
			rut = rut.substring(0, rut.length() - 1);
			D = (Directorio) localizar(rut);
		} else {
			D = ruta.get(ruta.size() - 1);
		}
		for (int i = 0; i < D.lista.size(); i++) {
			if (D.lista.get(i).getName().equals(s[s.length - 1])) {
				Elemento e1 = D.lista.get(i);
				D.lista.remove(i);
				if (e1.esDirectorio()) {
					e1.rm();
				}
				while (e1.enl.size() > 0) {
					rmaux(e1.enl.get(0));
					e1.enl.remove(0);
				}
			}
		}
	}
}
