package aula06;

import java.util.Scanner;
import SVG.SVG;

public class Arte1 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        SVG svg = new SVG();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                svg.addRect(20 + (25 * i), 10, 20, 100, 3, "blue");
            } else {
                svg.addRect(20 + (25 * i), 10, 20, 100, 3, "green");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                svg.addRect(20 + (25 * i), 10, 20, 100, 3, "blue");
            } else {
                svg.addRect(20 + (25 * i), 10, 20, 100, 3, "green");
            }
        }

        for (int i = 0; i < 10; i++) {
            int posX = (int)(Math.random()*1000);
            int posY = (int)(Math.random()*1000);
            int tamanho = 50 + (int)(Math.random()*100);
            //System.out.println("posX: "+posX);
            svg.addCircle(posX, posY, tamanho, "red");
        }
        svg.addLine(500, 500, 10, 10, 3, "black");

        svg.save("arte01.svg");
    }
}
