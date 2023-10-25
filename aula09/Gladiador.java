package aula09;

public class Gladiador {
    private String nome;
    private int vidas;
    private boolean temArmadura;

    public Gladiador(String nome, boolean temArmadura) {
        this.nome = nome;
        this.temArmadura = temArmadura;
        vidas = 5;
    }

    public int getVidas() {
        return vidas;
    }

    public void recebeGolpe(Arma arma) {
        if(temArmadura) {
            vidas = vidas - arma.getForca() + 2;
        } else {
            vidas = vidas - arma.getForca();
        }
    }

    public void imprime() {
        System.out.println("GLADIADOR: "+nome+" vidas: "+vidas+" ARMADURA: "+temArmadura);
        if(vidas <= 0) {
            System.out.println("MORRI");
        } else {
            System.out.println("I'M ALIVE!");
        }
    }
}
