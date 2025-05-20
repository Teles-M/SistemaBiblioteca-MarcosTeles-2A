// Essa classe é o herdador para a classe "Administrador"
public class Usuario {
    
    // Atributos de cada usuário
    private static int proximoId = 1;
    private int id;
    private String nome;
    private String email;
    
    // Construtor
    public Usuario(String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.id = proximoId++;
    }
    
    // GETTERS
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    
}
