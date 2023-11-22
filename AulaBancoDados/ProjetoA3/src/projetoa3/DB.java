package projetoa3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    private Connection connection;
    private Statement statement;
    private ResultSet rs;
    
    public DB(String filename) {
        this.openConnection(filename);
    }
    
    private void openConnection(String filename) {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:"+filename);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
        } catch (SQLException ex) {
            System.out.println("Erro de conexão!");
        }
    }
    
    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro fechar conexão!");
        }
    }

    public void query(String query) {
        try {
            rs = statement.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("Erro chamada QUERY!");
        }        
    }
    
    public int execQuery(String query) {
        try {
            return statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Erro chamada execQuery!");
        } 
        return 0;
    }
    
    public boolean next() {
        try {
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Erro chamada NEXT!");
        }
        return false;
    }
    
    public String getString(String fieldName) {
        try {
            return rs.getString(fieldName);
        } catch (SQLException ex) {
            System.out.println("Erro chamada getString!");            
        }
        return "";
    }
    
    public int getInt(String fieldName) {
        try {
            return rs.getInt(fieldName);
        } catch (SQLException ex) {
            System.out.println("Erro chamada getInt!");            
        }
        return 0;
    }
    
    public double getDouble(String fieldName) {
        try {
            return rs.getDouble(fieldName);
        } catch (SQLException ex) {
            System.out.println("Erro chamada getDouble!");            
        }
        return 0;
    }
}
