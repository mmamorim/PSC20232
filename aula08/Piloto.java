package aula08;

public class Piloto {
    
    private int qtdeHorasVoo;
    private String nome;

    public Piloto(String nome) {
        this.nome = nome;
        qtdeHorasVoo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaHoras(int horas) {
        qtdeHorasVoo = qtdeHorasVoo + horas;
    }

    public void imprime() {
        System.out.println("PILOTO NOME: "+nome);
        System.out.println("HORAS VOO: "+qtdeHorasVoo);
        if(qtdeHorasVoo <= 200) {
            System.out.println("Sou co-piloto");
        } else {
            System.out.println("Sou comandante");
        }
    }
}
