package aula04;

import java.util.Scanner;

public class Digitos {
    public static void main(String args[]) {
        int valor, u, d, c, m;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = leitor.nextInt();

        u = valor % 10;
        d = (valor/10) % 10;
        c = (valor/100) % 10;
        m = valor / 1000;
        System.out.println("Unidade: "+u);
        System.out.println("Dezena: "+d);
        System.out.println("Centena: "+c);
        System.out.println("Milhar: "+m);
        
    }
}
