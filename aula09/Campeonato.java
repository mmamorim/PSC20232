package aula09;

public class Campeonato {
    private int qtdeJogos;
    
    public Campeonato() {
        qtdeJogos = 0;
    }

    public void realizaJogo(TimeFutebol timeCasa, TimeFutebol timeVisitante) {
        if(timeVisitante.getTatica() == TimeFutebol.ATAQUE) {
            timeVisitante.venceu();
            timeCasa.perdeu();
        } else {
            if(timeCasa.getTatica() == TimeFutebol.ATAQUE && timeVisitante.getTatica() == TimeFutebol.RETRANCA) {
                timeVisitante.venceu();
                timeCasa.perdeu();
            } else {
                timeCasa.empatou();
                timeVisitante.empatou();
            }
        }
        qtdeJogos++;
    }

    public void imprime() {
        System.out.println("Campeonato qtde jogos "+qtdeJogos);
    }
}
