
package aula0711;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        lista.add(new Usuario("ana@ana.com","1234"));
        lista.add(new Usuario("bia@bia.com","1234"));
        System.out.println("qtde: "+lista.size());
        Usuario u = (Usuario) lista.get(0);
        u.imprime();
    }
}
