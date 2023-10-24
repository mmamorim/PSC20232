package aula09;

public class Exercicio4 {
    public static void main(String args[]) {

        TimeFutebol bimboca = new TimeFutebol("Bomboca FC",TimeFutebol.ATAQUE); 
        TimeFutebol psc = new TimeFutebol("PSC FC",TimeFutebol.RETRANCA); 
        TimeFutebol nerds = new TimeFutebol("NERDS FC",TimeFutebol.ATAQUE); 
        Campeonato paulista = new Campeonato();

        paulista.realizaJogo(bimboca, psc);
        paulista.realizaJogo(bimboca, nerds);
        paulista.realizaJogo(psc, nerds);
        paulista.realizaJogo(nerds, bimboca);

        bimboca.imprime();
        psc.imprime();
        nerds.imprime();
        paulista.imprime();
        
    }
}
