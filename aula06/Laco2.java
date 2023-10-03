package aula06;

import java.util.Scanner;

public class Laco2 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0, valor;

        int i = 0;
        while(i <= 10) {
            System.out.println("Digite um número:");
            valor = leitor.nextInt();
            soma = soma + valor;
            i++; // a mesma coisa que i = i + 1
        }
        System.out.println("Somatória: "+soma);

    }
}
