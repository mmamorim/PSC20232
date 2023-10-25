package aula09;

public class ExercGladiadores {
    public static void main(String args[]) {

        Arma a1 = new Arma(Arma.ESPADA);
        Gladiador maximus = new Gladiador("Maximus",true); 
        a1.imprime();
        maximus.recebeGolpe(a1);
        maximus.recebeGolpe(a1);
        maximus.imprime();
    }
}
