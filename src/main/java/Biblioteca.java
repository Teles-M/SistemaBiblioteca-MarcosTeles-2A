// Import das funções para utilizar na biblioteca
import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Administrador> admins;
    public static final String SENHA_ADM = "12345";
    
    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
        this.usuarios = new ArrayList<Usuario>();
        this.admins = new ArrayList<Administrador>();
        
        Livro livro = new Livro("Chapeuzinho Vermelho","Charles Perrault", 1697);
        livros.add(livro);
        
        Usuario usuario = new Usuario("Yasmim","yasmim.gomes@gmail.com");
        usuarios.add(usuario);
        
        Administrador adm = new Administrador("Marcos Teles","marcosteles@gmail.com","Gerente-Geral");
        admins.add(adm);
        
    }
    
    // MÉTODOS
    
    //Adicionar Livro
    public void adicionarLivro(String titulo, String autor, int ano) {
        Livro livro = new Livro(titulo, autor, ano);
        livros.add(livro);

        System.out.println("\nLIVRO ADICIONADO.");
    }
    
    // Adicionar Administrador
    public void cadastrarAdm(String nome, String email, String cargo) {
        Administrador adm = new Administrador(nome, email, cargo);
        admins.add(adm);
            
        System.out.println("\nADMINISTRADOR CADASTRADO.");
    }
    
    // Adicionar Usuário
    public void cadastrarUsuario(String nome, String email) {
        Usuario usu = new Usuario(nome, email);
        usuarios.add(usu);
        
        System.out.println("\nUSUARIO CADASTRADO");
    }
    
    // Ver livros
    public void listarLivros() {
        for(Livro livro : livros) {
            System.out.println("\n-----\nISBN: "+livro.getIsbn()+"\nTITULO: "+livro.getTitulo()+"\nAUTOR: "+livro.getAutor()+"\nANO: "+livro.getAno()+"\n-----");
        }
    }
    
    // Listar Usuarios
    public void listarUsuarios() {
        for(Usuario usuario : usuarios) {
            System.out.println("\n-----\nID: "+usuario.getId()+"\nNOME: "+usuario.getNome()+"\nEMAIL: "+usuario.getEmail()+"\n-----");
        }
    }
    
    // Listar Administradores
    public void listarAdministradores() {
        for(Administrador adm : admins) {
            System.out.println("\n-----\nID: "+adm.getId()+"\nNOME: "+adm.getNome()+"\nEMAIL: "+adm.getEmail()+"\nCARGO: "+adm.getCargo()+"\n-----");
        }
    }
    
    // Emprestar Livros
    public void emprestarLivro(int isbn) {
        for(Livro livro : livros) {
            if(livro.getIsbn() == isbn) {
                if(livro.isEmprestado() == false) {
                    livro.emprestar();
                    System.out.println("\nLIVRO EMPRESTADO COM SUCESSO.");
                }
                else if(livro.isEmprestado()) {
                    System.out.println("\nLIVRO JA EMPRESTADO.");
                }
                    
            }
        }
    }
    
}