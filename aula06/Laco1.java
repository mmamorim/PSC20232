package aula06;

import java.util.Scanner;

public class Laco1 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        double totalDaCompra = 0, valor;
        boolean temProximo = true;

        while (temProximo) {
            System.out.println("Digite valor do produto:");
            valor = leitor.nextDouble();
            totalDaCompra = totalDaCompra + valor;
            System.out.println("Tem próximo?");
            temProximo = leitor.nextBoolean();
        }
        System.out.println("Valor total da compra: R$ " + totalDaCompra);

    }
}
