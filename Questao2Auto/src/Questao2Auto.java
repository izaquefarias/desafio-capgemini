import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2Auto {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma senha: ");
		String senha = ler.next();
		Pattern padrao = Pattern.compile("\\d");
		Matcher imputSenha = padrao.matcher(senha);
		StringBuilder alerta = new StringBuilder();
		boolean tamanho, digito, minuscula, maiuscula, especial;
		tamanho = digito = minuscula = maiuscula = especial = false;

		if (!(senha.length() >= 6)) {
			alerta.append("- Deve ter no mínimo 6 caracteres, faltam: " + (senha.length() - 6) * -1 + "\r\n");
		} else
			tamanho = true;

		if (!imputSenha.find()) {
			alerta.append("- Deve ter no mínimo 1 dígito;\r\n");
		} else
			digito = true;

		padrao = Pattern.compile("[a-z]");
		imputSenha = padrao.matcher(senha);

		if (!imputSenha.find()) {
			alerta.append("- Deve ter  no mínimo 1 letra minúscula;\r\n");
		} else
			minuscula = true;

		padrao = Pattern.compile("[A-Z]");
		imputSenha = padrao.matcher(senha);

		if (!imputSenha.find()) {
			alerta.append("- Deve ter  no mínimo 1 letra maiúscula;\r\n");
		}
		else
			maiuscula = true;
		
		padrao = Pattern.compile("[!@#$%^&*()-+]");
		imputSenha = padrao.matcher(senha);

		if (!imputSenha.find()) {
			alerta.append(
					"- Deve ter  no mínimo 1 caractere especial. Os caracteres especiais são: '!@#$%^&*()-+'; \r\n");
		} else
			especial = true;

		if (tamanho == true && digito == true && minuscula == true && maiuscula == true && especial == true) {
			System.out.println("Senha cadastrada com sucesso!");
		} else {
			System.out.println(alerta.toString());
		}


		ler.close();
	}

}
