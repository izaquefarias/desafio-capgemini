package questao2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma senha: ");
		String senha = ler.next();

		if (senha.length() < 6) {
			System.out.println((senha.length() - 6) * -1);
		} else {
			System.out.println("Senha cadastrada com sucesso!");
		}
		ler.close();
	}

}
