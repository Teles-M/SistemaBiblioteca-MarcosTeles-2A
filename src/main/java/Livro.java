public class Livro {
    
    // Atributos de cada livro
    private static int proximoIsbn = 1; // Identifica o ISBN como 1, que será alterado ao criar outro livro
    private int isbn;
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado; // Atributo para identificar se o livro está disponível
    
    // Construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = proximoIsbn++;
        this.emprestado = false;
    }
    
    // GETTERS
    public int getIsbn() { // Pegar o ISBN do livro
        return isbn;
    }
    public String getTitulo() { // Pegar o título
        return titulo;
    }
    public String getAutor() { // Pegar o autor
        return autor;
    }    
    public int getAno() { // Pegar o ano
        return ano;
    }
    public void isDisponivel() { // Verificar a disponibilidade do livro
        if (emprestado == false) {
            System.out.println("O livro esta disponivel.");
        }
        if (emprestado) {
            System.out.println("O livro ja foi emprestado.");
        }
    }
    
}
