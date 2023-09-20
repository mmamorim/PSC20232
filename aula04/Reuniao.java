package aula04;

import java.util.Scanner;

public class Reuniao {
    public static void main(String args[]) {
        int horaI, minI, horaF, minF;
        int tempoI, tempoF, duracaoH, duracaoM;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite Horas início reunião: ");
        horaI = leitor.nextInt();
        System.out.println("Digite Minutos início reunião: ");
        minI = leitor.nextInt();
        System.out.println("Digite Horas término reunião: ");
        horaF = leitor.nextInt();
        System.out.println("Digite Minutos término reunião: ");
        minF = leitor.nextInt();

        tempoI = horaI * 60 + minI;
        tempoF = horaF * 60 + minF;
        
        duracaoH = (tempoF-tempoI) / 60;
        duracaoM = (tempoF-tempoI) % 60;
        System.out.println("Duração: "+duracaoH+":"+duracaoM);
    }
}
