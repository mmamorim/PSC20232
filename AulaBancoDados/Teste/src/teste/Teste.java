package teste;

import teste.User.UserCrud;

public class Teste {

    public static void main(String[] args) {

        UserCrud crud = new UserCrud();
        crud.setVisible(true);
        
        DB db = new DB("banco.db");
        db.query("select * from Usuarios");
        while(db.next())
        {
            // read the result set
            System.out.println("codigo = " + db.getString("codigo"));
            System.out.println("nome = " + db.getString("nome"));
            System.out.println("email = " + db.getString("email"));
        }
        db.closeConnection();
    }
}
