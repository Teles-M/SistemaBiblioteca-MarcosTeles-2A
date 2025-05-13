// Essa classe é herdeira da classe "Usuario" para utilizar os mesmos atributos e métodos
public class Administrador extends Usuario {
    
    // Atributos
    private String cargo;

    // Construtor "super" para herança
    public Administrador(int id, String nome, String email) {
        super(id, nome, email);
    }
    
    // GETTER
    public String getCargo() {
        return cargo;
    }
    
}
