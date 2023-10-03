package aula05;

import java.util.Scanner;

public class MaiorDe3 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.println("Digite valor1:");
        valor1 = leitor.nextInt();
        System.out.println("Digite valor2:");
        valor2 = leitor.nextInt();
        System.out.println("Digite valor3:");
        valor3 = leitor.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("Maior: " + valor1);
        } else {
            if(valor2 > valor3) {
                System.out.println("maior: "+valor2);
            } else {
                System.out.println("maior: "+valor3);
            }
        }

    }
}
