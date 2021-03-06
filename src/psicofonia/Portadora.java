package psicofonia;

import java.util.HashMap;
import java.util.Map;

public class Portadora {
	
/**
 * Este método genera una letra aleatoriamente dándole un mayor peso a las letras 
 * según su frecuencia en las palabras en español. 
 * @return
 */
	private static char creaLetra() {
		char letra = ' ';

		HashMap<Character, Integer> letraPeso = new HashMap<Character, Integer>();

		letraPeso.put('a', 1253);
		letraPeso.put('b', 142);
		letraPeso.put('c', 468);
		letraPeso.put('d', 586);
		letraPeso.put('e', 1368);
		letraPeso.put('f', 69);
		letraPeso.put('g', 101);
		letraPeso.put('h', 70);
		letraPeso.put('i', 625);
		letraPeso.put('j', 44);
		letraPeso.put('k', 2);
		letraPeso.put('l', 497);
		letraPeso.put('m', 315);
		letraPeso.put('n', 671);
		letraPeso.put('ñ', 31);
		letraPeso.put('o', 868);
		letraPeso.put('p', 251);
		letraPeso.put('q', 88);
		letraPeso.put('r', 687);
		letraPeso.put('s', 798);
		letraPeso.put('t', 463);
		letraPeso.put('u', 393);
		letraPeso.put('v', 90);
		letraPeso.put('w', 1);
		letraPeso.put('x', 22);
		letraPeso.put('y', 90);
		letraPeso.put('z', 52);

		int probabilidadLetra = (int) ((Math.random() * (10045 - 0 + 1) + 0));

		int suma = 0;

		for (Map.Entry<Character, Integer> pareja : letraPeso.entrySet()) {

			suma += pareja.getValue();

			if (suma >= probabilidadLetra) {
				letra = pareja.getKey();
				break;
			}
		}

		return letra;
	}

	private static String creaPalabra() {
		String palabra = " ";

		HashMap<Integer, Integer> numeroCaracteresPalabra = new HashMap<Integer, Integer>();

		numeroCaracteresPalabra.put(1, 5);
		numeroCaracteresPalabra.put(2, 5);
		numeroCaracteresPalabra.put(3, 10);
		numeroCaracteresPalabra.put(4, 15);
		numeroCaracteresPalabra.put(5, 30);
		numeroCaracteresPalabra.put(6, 15);
		numeroCaracteresPalabra.put(7, 5);
		numeroCaracteresPalabra.put(8, 3);
		numeroCaracteresPalabra.put(9, 3);
		numeroCaracteresPalabra.put(10, 3);
		numeroCaracteresPalabra.put(11, 1);
		numeroCaracteresPalabra.put(12, 1);
		numeroCaracteresPalabra.put(13, 1);
		numeroCaracteresPalabra.put(14, 1);
		numeroCaracteresPalabra.put(15, 1);
		numeroCaracteresPalabra.put(16, 1);

		int probabilidadCaracterPalabra = (int) ((Math.random() * (100 - 0 + 1) + 0));

		int suma = 0;

		for (Map.Entry<Integer, Integer> pareja : numeroCaracteresPalabra.entrySet()) {

			suma += pareja.getValue();

			if (suma >= probabilidadCaracterPalabra) {
				int numeroCaracteresPorPalabra = pareja.getKey();

				for (int i = 0; i < numeroCaracteresPorPalabra; i++) {
					palabra += String.valueOf(creaLetra());
				}

				break;
			}
		}

		return palabra;
	}

	private static String creaOracion() {
		String oracion = "";

		int longitudOracion = (int) ((Math.random() * (15 - 5 + 1) + 5));

		for (int i = 0; i < longitudOracion; i++) {
			
			if (i == 0) {
				oracion += creaPalabra().toUpperCase().charAt(1) + 
						creaPalabra().substring(1).toLowerCase();
			} else {
				oracion += creaPalabra();
			}
		}

		return oracion + ".";
	}

	private static String creaParrafo() {
		String parrafo = "";
		
		int lineasParrafo = (int) ((Math.random() * (20 - 1 + 1) + 1));

		for (int i = 0; i < lineasParrafo; i++) {
			parrafo += creaOracion() + "\n";
		}

		return parrafo;
	}
	
	public static String mensajeGrabado() {
		String texto = "";
		
		int numeroParrafo = (int) ((Math.random() * (20 - 1 + 1) + 1));

		for (int i = 0; i < numeroParrafo; i++) {
			texto += creaParrafo() + "\n\n";
		}
		
		return texto;
		
	}

}