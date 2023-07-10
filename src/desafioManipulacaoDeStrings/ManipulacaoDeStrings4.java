package desafioManipulacaoDeStrings;

import java.util.Scanner;

public class ManipulacaoDeStrings4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();
		String novafrase = fraseAtualizada(frase);
		System.out.println(novafrase);
		sc.close();
	}

	public static String fraseAtualizada(String frase) {
		StringBuilder resultado = new StringBuilder();
		boolean capitalizar = true;

		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);
			if (caractere == '.' || caractere == '?' || caractere == '!' || caractere == '-') {
				capitalizar = true;
			} else if (capitalizar && Character.isLetter(caractere)) {
				caractere = Character.toUpperCase(caractere);
				capitalizar = false;
			}
			resultado.append(caractere);
		}

		return resultado.toString();
	}

}