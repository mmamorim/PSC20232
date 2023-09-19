package SVG;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SVG {

    private ArrayList elems;

    public SVG() {
        elems = new ArrayList();
    }

    public void addRect(int x, int y, int width, int height, int rx, String color) {
        elems.add("<rect x=\"" + x + "\" y=\"" + y + "\" width=\"" + width + "\" height=\"" + height + "\" rx=\"" + rx + "\" fill=\"" + color + "\" />");
    }

    public void addCircle(int x, int y, int r, String color) {
        elems.add("<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" fill=\"" + color + "\" />");
    }

    public void addLine(int x1, int y1, int x2, int y2, int width, String color) {
        elems.add("<line x1=\"" + x1 + "\" y1=\"" + y1 + "\" x2=\"" + x2 + "\" y2=\"" + y2 + "\" stroke-width=\"" + width + "\" stroke=\"" + color + "\" />");
    }

    public void save(String filename) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(filename));
            out.write("<svg viewBox=\"0 0 1000 1000\" xmlns=\"http://www.w3.org/2000/svg\">");
            out.newLine();
            for (Object elem : elems) {
                System.out.println(elem);
                out.write(elem.toString());
                out.newLine();
            }
            out.write("</svg>");
            out.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }

    }
}
