package projetoa3;

public class ProjetoA3 {

    public static void main(String[] args) {

        System.out.println("Oi mundo");
        
        Times timesJanela = new Times();
        timesJanela.setVisible(true);
        
        DB db = new DB("bancodados.db");
        db.query("SELECT * FROM times");
        while(db.next()) {
            int codigo = db.getInt("codigo");
            String nome = db.getString("nome");
            System.out.println("CODIGO: "+codigo+" NOME: "+nome);
        }
        db.closeConnection();
        
    }
    
}
