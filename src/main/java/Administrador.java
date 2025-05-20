// Essa classe é herdeira da classe "Usuario" para utilizar os mesmos atributos e métodos
public class Administrador extends Usuario {
    
    // Atributos
    private String cargo;

    // Construtor "super" para herança
    public Administrador(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }
    
    // GETTER
    public String getCargo() {
        return cargo;
    }
    
}
