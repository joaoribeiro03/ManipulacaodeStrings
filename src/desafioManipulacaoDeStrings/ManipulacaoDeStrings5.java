package desafioManipulacaoDeStrings;

import java.util.Scanner;

public class ManipulacaoDeStrings5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma String para verificar se é palíndromo: ");
		String palavra = sc.nextLine().replace(" ", "").toLowerCase();
		String palindromo = new StringBuilder(palavra).reverse().toString();

		if (palavra.equalsIgnoreCase(palindromo)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		sc.close();
	}

}
