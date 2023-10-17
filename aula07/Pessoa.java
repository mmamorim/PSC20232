package aula07;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0 || idade > 99) {
            System.out.println("Idade inválida");
        } else {
            this.idade = idade;
        }
    }

    public void fazAniversario() {
        idade++;
    }

    public void imprime() {
        System.out.println("Sou uma pessoa...e me chamo " + nome);
        System.out.println("Tenho " + idade + " anos.");
    }
}