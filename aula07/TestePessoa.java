package aula07;

public class TestePessoa {

    public static void main(String args[]) {

        Pessoa p1 = new Pessoa("Ana",15);
        Pessoa p2 = new Pessoa("Bia",20);
        Pessoa p3 = new Pessoa("João",30);

        p1.imprime();
        p2.imprime();
        p3.fazAniversario();
        p3.fazAniversario();
        p3.imprime();

    }
}
