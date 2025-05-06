// Import das funções para utilizar na biblioteca
import java.util.ArrayList;

public class Biblioteca {
    
    // Atributos da bilbioteca
    private ArrayList<String> livros; // "livros" é uma lista que contém nomes das várias classes "Livro"
    private ArrayList<String> usuarios; // Lista que contém classes "Usuario"
    private ArrayList<String> administradores; // Lista que contém classes "Administrador"
    
    // GETTER
    public void getLivros() {
        for(String i:livros) { // Loop para percorrer a lista "Livros"
            System.out.println(i); // Entrega o nome dos livros
        }
    }
    
}
