package aula05;

import java.util.Scanner;

public class Maior2 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Digite valor1:");
        valor1 = leitor.nextInt();
        System.out.println("Digite valor2:");
        valor2 = leitor.nextInt();

        if (valor1 > valor2) {
            System.out.println("Maior: " + valor1);
        }
        if (valor1 < valor2) {
            System.out.println("Maior:" + valor2);
        }
        if (valor1 == valor2) {
            System.out.println("são iguais");
        }

    }
}
