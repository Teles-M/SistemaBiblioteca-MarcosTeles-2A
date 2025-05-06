// Essa classe é o herdador da classe "Administrador"
public class Usuario {
    
    // Atributos de cada usuário
    private int id;
    private String nome;
    private String email;
    
    // Construtor
    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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
    
    // SETTERS
    public void setId(int novoId) {
        if(novoId != id) {
            this.id = novoId;
        }
    }
    public void setNome(String novoNome) {
        if(novoNome.equals(nome) == false) {
            this.nome = novoNome;
        }
    }
    public void setEmail(String novoEmail) {
        if(novoEmail.equals(email) == false) {
            this.email = novoEmail;
        }
    }
    
}
