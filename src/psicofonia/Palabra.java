package psicofonia;

import java.util.HashMap;
import java.util.Map;

public class Palabra {
public static String creaPalabra() {
		
		//Peso de las letras 1 por 10.000
		HashMap<String, Integer> letraPeso = new HashMap<String, Integer>();
		
		letraPeso.put("a", 1253);
		letraPeso.put("b", 142);
		letraPeso.put("c", 468);
		letraPeso.put("d", 586);
		letraPeso.put("e", 1368);
		letraPeso.put("f", 69);
		letraPeso.put("g", 101);
		letraPeso.put("h", 70);
		letraPeso.put("i", 625);
		letraPeso.put("j", 44);
		letraPeso.put("k", 2);
		letraPeso.put("l", 497);
		letraPeso.put("m", 315);
		letraPeso.put("n", 671);
		letraPeso.put("ñ", 31);
		letraPeso.put("o", 868);
		letraPeso.put("p", 251);
		letraPeso.put("q", 88);
		letraPeso.put("r", 687);
		letraPeso.put("s", 798);
		letraPeso.put("t", 463);
		letraPeso.put("u", 393);
		letraPeso.put("v", 90);
		letraPeso.put("w", 1);
		letraPeso.put("x", 22);
		letraPeso.put("y", 90);
		letraPeso.put("z", 52);
		
		for (Map.Entry<String, Integer> pareja: letraPeso.entrySet()) {
			System.out.println(pareja.getValue());
			}

		String palabra = " ";
		int numeroCaracteresPalabra = (int) ((Math.random() * (20 - 2 + 1) + 2));

		for (int i = 0; i < numeroCaracteresPalabra; i++) {
			int codigoAscii = (int) ((Math.random() * (122 - 97 + 1) + 97));
			palabra = palabra + (char) codigoAscii;
		}
		return palabra;
	}

}