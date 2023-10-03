package aula06;

import java.util.Scanner;

public class Laco3 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0, valor, i;

        for(i = 0; i <= 10; i++) {
            System.out.println("Digite um número:");
            valor = leitor.nextInt();
            soma = soma + valor;
        }
        System.out.println("Somatória: "+soma);

    }
}
