package aula09;

public class Arma {
    public static final char ARCO = 'A';
    public static final char LANCA = 'L';
    public static final char ESPADA = 'E';

    private char tipo;
    private int forca;

    public Arma(char tipo) {
        if(tipo == ARCO) {
            forca = 3;
        }
        if(tipo == LANCA) {
            forca = 4;
        }
        if(tipo == ESPADA) {
            forca = 5;
        }
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public int getForca() {
        return forca;
    }

    public void imprime() {
        System.out.println("ARMA: "+tipo+" FORCA: "+forca);
    }
}
