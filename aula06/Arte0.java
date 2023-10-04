package aula06;

import java.util.Scanner;
import SVG.SVG;

public class Arte0 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        SVG svg = new SVG();

        svg.addLine(500, 500, 10, 10, 3, "black");

        svg.save("arte0.svg");
    }
}
