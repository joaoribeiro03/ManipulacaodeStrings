package desafioManipulacaoDeStrings;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ManipulacaoDeStrings2 {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra ou frase para remover os caracteres duplicados:");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String resultado = removeCaractereRepetido(frase);
        System.out.println("Resultado: " + resultado);
        sc.close();
    }

    public static String removeCaractereRepetido(String frase) {
        Set<Character> caracteres = new HashSet<>();
        StringBuilder resultado = new StringBuilder();
        for (char c : frase.toCharArray()) {
            if (caracteres.add(c)) {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
}