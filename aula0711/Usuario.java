package aula0711;

public class Usuario {
    private String email;
    private String senha;
    
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public boolean verificaLogin(String email, String senha) {
        if(this.email.equals(email) && this.senha.equals(senha)) {
            return true;
        }
        return false;
    }
    public void imprime() {
        System.out.println("Usuario: "+email+" "+senha);
    }
}
