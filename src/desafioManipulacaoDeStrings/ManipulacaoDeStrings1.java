package desafioManipulacaoDeStrings;

import java.util.Scanner;

public class ManipulacaoDeStrings1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase para reverter " 
		+ "a ordem das palavras mantendo a ordem das palavras: ");

		String frase = sc.nextLine();

		String[] palavras = frase.split(" ");

		StringBuilder fraseRevertida = new StringBuilder();
		for (int i = palavras.length - 1; i >= 0; i--) {
			fraseRevertida.append(palavras[i]).append(" ");
		}

		System.out.println(fraseRevertida.toString().trim());
		sc.close();
	}

}
