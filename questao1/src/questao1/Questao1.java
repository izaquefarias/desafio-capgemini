package questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		try {
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite 'n' que equivale a quantidade de degraus que irá compor a escada: ");
			int n = ler.nextInt();
			String espaco = " ";
			String asterisco = "*";

			if (n >= 1) {
				for (int i = 1; i <= n; i++) {
					System.out.println((espaco.repeat(n - i) + asterisco.repeat(i)));
				}
			} else {
				System.out.println("'n'deve ser um número maior igual a 1");
			}
			ler.close();
		} catch (InputMismatchException erro) {
			System.out.println("Erro: entrada inválida!");
			System.out.println("'n'deve ser um número maior igual a 1");
			System.out.println("Reinicie o programa");
		}

	}

}
