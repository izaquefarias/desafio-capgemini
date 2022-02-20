package questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<String> anagramas = new ArrayList<>();
		System.out.print("Digite uma palavra: ");
		String palavra = ler.next();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 1; j < palavra.length(); j++) {
				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
					if (palavra.charAt(i) == palavra.charAt(i + 1)) {
						String x = palavra.substring(i, i + 1).concat(palavra.substring(i, i + 1));
						anagramas.add(x);
					} else {
						String y = palavra.substring(i, j).concat(".").concat(palavra.substring(i + 1, j + 1));
						String z = palavra.substring(i, i + 1).concat(palavra.substring(j, j + 1));
						anagramas.add(z);
						anagramas.add(y);
					}
				}
			}
		}
		System.out.println(anagramas.size());
		ler.close();
	}

}
