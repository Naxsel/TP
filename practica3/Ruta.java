/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Ruta.java
 * Fecha: 25/03/2015
 */

//Metodo list para ls?
//Hay que devolver en orden alfabetico con ls?


/**
 *
 */
public class Ruta {

	ArrayList Directorio ruta;

	public Ruta(Directorio raiz){
		ruta.add(raiz)
	}

	/**
	 * Devuelve la ruta completa, con todos los nombres de los directorios desde
	 * la raiz hasta el directorio actual concatenados y separados por el
	 * separador /.
	 */
	String pwd() {
		String s = "";
		for (int n=0; n<ruta.size; n++){
			if (s.equals("/")){
				s= s+ruta.get(n).getName();
			}else{
				s= s +"/"+ruta.get(n).getName()
			}
		}
	}

	/**
	 * Muestra por pantalla los nombres de todos los ficheros, directorios y
	 * enlaces contenidos en la ruta actual, cada uno de ellos en una linea
	 * diferente, sin ningun dato mas.
	 */
	void ls() {
		Directorio actual = ruta.get(ruta.size()-1);
		actual.print();
	}

	/**
	 * cambia la ruta a otro directorio (path), pasándole el nombre del
	 * directorio al que quiere cambiar. Hay tres casos especiales: “.” se
	 * refiere al directorio actual, “..” se refiere al directorio anterior en
	 * el árbol de directorios y “/” se refiere a la raíz del árbol de
	 * directorios. También se le puede pasar como parámetro una ruta completa
	 * (varios directorios separados por “/”).
	 */

	 //que pasa al hacer split con solo una barra
	void cd(String path) {
		if (!path.equals(".") && !path.equals("") && !path.equals(null)){
			if (path.equals("..")){
				ruta.remove(ruta.size()-1);
				pwd();
			}
			else {
				if(path.charAt[0].equals("/") {
					String [] s = path.split("/");
					if (s.length == 0){
						for(int i =0; i<ruta.size()-1;i++){
							ruta.remove(ruta.size()-1);
						}
						pwd();
					}else{
						int i =0; boolean cond;
						ArrayList Elemento aux = ruta;
						for(int i =0; i<aux.size()-1;i++){
							aux.remove(aux.size()-1);
						}
						Directorio D;
						while (i<s.length-1 && cond){ // length -1?
							D=aux.get(i).subD(s[i+1]);
							if (D.equals(null)){
								cond=false;
								System.out.println("No existe la ruta introducida");
							} else{
								aux.add(D);
								i++;
							}
						}
						if(cond){
							ruta = aux;
							pwd();
						}
					}
				}
				else{
					ArrayList Elemento aux = ruta;
					int i=0; boolean cond;
					String [] s = path.split("/");
					Directorio D;
					while(i<s.length && cond){
						D=aux.get(aux.size()-1).subD(s[i]));
						if (D.equals(null)){
							cond=false;
							System.out.println("No existe la ruta introducida");
						} else{
							aux.add(D);
							i++;
						}
					}
					if(cond){
						ruta = aux;
						pwd();
					}
				}
			}
		}
	}

	/**
	 * Muestra por pantalla un numero que es el tamaño del archivo,
	 * directorio o enlace dentro de la ruta actual identificado por la cadena
	 * de texto que se le pasa como parametro. Tambien se le puede pasar una
	 * ruta completa.
	 */
	void stat(String element) {
		Elemento e = localizar(element);
		e.getSize();
	}

	/**
	 * Devuelve el elemento dentro de la ruta actual, o raiz identificado
	 * con la cadena de texto que se pasa como parametro.
	 * Devuelve el elemento si existe, sino un null
	 */
	private Elemento localizar(String element){
		if (!path.equals(null) && !path.equals("..") && !path.equals("")){
			if (path.equals(".")){
				return ruta.get(ruta.size()-1);
			}
			else {
				ArrayList Directorio aux = ruta;
				int i=0; boolean cond;
				Directorio D;
				if(path.charAt[0].equals("/") {
					String [] s = path.split("/");
					if (s.length == 0){
						for(int i =0; i<aux.size()-1;i++){
							ruta.remove(aux.size()-1);
						}
						return aux.get(aux.size()-1);
					}else{
						for(int i =0; i<aux.size()-1;i++){
							aux.remove(aux.size()-1);
						}
						while (i<s.length-1 && cond){ // length -1?
							D=aux.get(i).subE(s[i+1]);
							if (D.equals(null)){
								cond=false;
								System.out.println("No existe la ruta introducida");
							} else{
								aux.add(D);
								i++;
							}
						}
						if(cond){
							return aux.get(aux.size()-1);
						} else{ return null;}
					}
				}
				else{
					String [] s = path.split("/");
					while(i<s.length && cond){
						D=aux.get(aux.size()-1).subE(s[i]));
						if (D.equals(null)){
							cond=false;
							System.out.println("No existe la ruta introducida");
						} else{
							aux.add(D);
							i++;
						}
					}
					if(cond){
						return aux.get(aux.size()-1);
					} else{ return null;}
				}
			}
		}
	}

	/**
	 * Cambia el tamaño de un archivo dentro de la ruta actual (no se le puede
	 * pasar como parámetro una ruta completa). Si el archivo no existe dentro
	 * de la ruta actual, se crea automáticamente con el nombre y tamaño
	 * espeficados. Si el archivo referenciado por “file” es en realidad un
	 * enlace a un archivo, también cambia su tamaño.
	 */
	void vim(String file, int size) {
		Elemento e = localizar(file);
		if (!e.esArchivo()){
			System.out.println("No se es un archivo")
		}
		else{
				Archivo a = e;
				a.setSize(size);
			}
		}
	}

	/**
	 * Crea un directorio dentro de la ruta actual. No se le puede pasar como
	 * parámetro una ruta completa.
	 */
	void mkdir(String dir) {
		Directorio actual = ruta.get(ruta.size()-1);
		Directorio D = new Directorio(dir);
	}

	/**
	 * Crea un enlace simbólico de nombre “dest” al que enlaza el elemento
	 * identificado mediante el nombre “orig”. “dest” no puede contener una ruta
	 * completa, pero “orig” sí, de tal modo que pueden crearse enlaces
	 * simbólicos entre elementos dentro de diferentes posiciones del árbol de
	 * directorios.
	 */
	void ln(String orig, String dest) {

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
	void rm(String e) {

	}


}
