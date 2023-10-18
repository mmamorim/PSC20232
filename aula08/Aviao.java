package aula08;

public class Aviao {
    private int qtdeHorasAtiv;

    public Aviao() {
        qtdeHorasAtiv = 0;
    }

    public void fazVoo(int horas, Piloto p) {
        if (qtdeHorasAtiv < 200) {
            qtdeHorasAtiv = qtdeHorasAtiv + horas;
            p.adicionaHoras(horas);
        } else {
            System.out.println("Precisa fazer revisão! Horas atividade = "+qtdeHorasAtiv);
        }
    }

    public void fazRevisao() {
        qtdeHorasAtiv = 0;
    }

    public void status() {
        System.out.println("Status avião: Horas ativ => "+qtdeHorasAtiv);
        if(qtdeHorasAtiv >= 200) {
            System.out.println("PRECISA REVISÃO");
        } else {
            System.out.println("AVIÃO OK");
        }
    }
}
