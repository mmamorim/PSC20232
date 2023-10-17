package aula07;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public void leitura() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        System.out.println("Digite nota 1:");
        nota1 = leitor.nextDouble();
        System.out.println("Digite nota 2:");
        nota2 = leitor.nextDouble();
    }

    public void calculaMedia() {
        media = (nota1+nota2)/2;
    }

    public void imprime() {
        System.out.println("Nome: "+nome);
        System.out.println("Nota1: "+nota1);
        System.out.println("Nota2: "+nota2);
        System.out.println("Media: "+media);
    }

}
