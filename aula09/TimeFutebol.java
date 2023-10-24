package aula09;

class TimeFutebol {
    public static final int RETRANCA = 0;
    public static final int ATAQUE = 1;

    private String nome;
    private int jogos;
    private int pontos;
    private int tatica;

    public TimeFutebol(String nome, int tatica) {
        this.nome = nome;
        this.tatica = tatica;
        pontos = 0;
        jogos = 0;
    }

    public int getTatica() {
        return tatica;
    }

    public void venceu() {
        pontos = pontos + 3;
        jogos++;
    }

    public void empatou() {
        pontos++;
        jogos++;
    }

    public void perdeu() {
        jogos++;
    }

    public void imprime() {
        System.out.println("Time: "+nome+" pts: "+pontos+" jogos: "+jogos+" Tatica: "+tatica);
    }
}