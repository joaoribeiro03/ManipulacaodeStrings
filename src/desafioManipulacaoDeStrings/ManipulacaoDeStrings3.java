package desafioManipulacaoDeStrings;

import java.util.Scanner;

public class ManipulacaoDeStrings3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine().replace(" ", "").toLowerCase();

        String silabaPalindroma = "";

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 2; j <= palavra.length(); j++) {
                String subString = palavra.substring(i, j);
                if (isPalindromo(subString) && subString.length() > silabaPalindroma.length()) {
                    silabaPalindroma = subString;
                }
            }
        }

        System.out.println("Sílaba palíndroma encontrada: " + silabaPalindroma);

        sc.close();
    }

    private static boolean isPalindromo(String palavra) {
        String reverso = new StringBuilder(palavra).reverse().toString();
        return palavra.equals(reverso);
    }
}


