// Import das funções para utilizar na biblioteca
import java.util.Map; // Map armazena dados "chave-valor", ou seja, armaena uma chave única e seu respectivo valor.
import java.util.HashMap; // HashMap é um estilo de Map

public class Biblioteca {
    
    // Atributos da bilbioteca
    private Map<Integer, Livro> livros; // Um Map "livros", que armazena o ISNB do livro e o restante da classe livro
    private Map<Integer, Usuario> usuarios; // Um Map que armazenará o ID e o restante da classe usuário
    private Map<Integer, Administrador> adms; // Armazenará admins
    
    // Construtor
    public Biblioteca() {
        livros = new HashMap<>(); // criando o Map que irá conter os livros
        usuarios = new HashMap<>();
        adms = new HashMap<>();
}
}
