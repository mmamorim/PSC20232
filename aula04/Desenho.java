package aula04;

import java.util.Random;

import SVG.SVG;

public class Desenho {
    public static void main(String args[]) {
        SVG svg = new SVG();

        svg.addCircle(500, 500, 100, "green");
        svg.addCircle(50, 50, 200, "pink");
        svg.addRect(200, 200, 500, 200, 0, "yellow");
        svg.addLine(200, 200, 500, 200, 3, "red");

        Random g = new Random(0);
        for (int i = 0; i < 100; i++) {
            int r = g.nextInt(100);
            int x = g.nextInt(1000);
            int y = g.nextInt(1000);
            svg.addCircle(x, y, r, "black");
        }
        svg.save("saida.svg");
    }
}
