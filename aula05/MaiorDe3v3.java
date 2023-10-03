package aula05;

import java.util.Scanner;

public class MaiorDe3v3 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int valor1, valor2, valor3, aux;

        System.out.println("Digite valor1:");
        valor1 = leitor.nextInt();
        System.out.println("Digite valor2:");
        valor2 = leitor.nextInt();
        System.out.println("Digite valor3:");
        valor3 = leitor.nextInt();

        if (valor1 == valor2 && valor2 == valor3) {
            System.out.println("são iguais");
        }
        if (valor1 == valor2 && valor2 != valor3) {
            System.out.println("valor 1 e 2 são iguais");
        }
        if (valor1 == valor3 && valor2 != valor3) {
            System.out.println("valor 1 e 3 são iguais");
        }
        if (valor2 == valor3 && valor2 != valor1) {
            System.out.println("valor 2 e 3 são iguais");
        }

        // buble sort
        if (valor1 > valor2) {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        if (valor2 > valor3) {
            aux = valor2;
            valor2 = valor3;
            valor3 = aux;
        }
        if (valor1 > valor2) {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        System.out.println("ordem: " + valor1 + "," + valor2 + "," + valor3);
    }
}
