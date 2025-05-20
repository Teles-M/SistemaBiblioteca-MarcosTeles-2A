import java.util.Scanner;

public class SistemaBibliotecaMarcosTeles2A {

    public static void main(String[] args) {
        
        Biblioteca bib = new Biblioteca();
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\n");
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("\n-=-=-=-=-=-=- BIBLIOTECA -=-=-=-=-=-=-");
            System.out.println("""
                               
                               1. Entrar como Usuario
                               2. Entar como Administrador
                               3. SAIR""");
            System.out.print("\nEscolha sua opcao: ");
            
            int escolha = scan.nextInt();
            
            if (escolha == 3) {
                continuar = false;
                continue;
            }
            
            if (escolha < 1 || escolha > 3) {
                System.out.println("\nOPCAO INVALIDA. Tente Novamente");
                continue;
            }
            
            switch (escolha) {
                case 1:
                    boolean continuarU = true;
                    
                    while (continuarU) {
                        System.out.println("\n-=-=-=-=-=-=- AREA DO USUARIO -=-=-=-=-=-=-");
                        System.out.println("\n1. Listar Livros\n2. Emprestar Livro\n3. Cadastrar-se\n4. VOLTAR");
                        System.out.print("\nEscolha sua opcao: ");
                        
                        int escolhaU = scan.nextInt();
                        
                        if (escolhaU == 4) {
                            continuarU = false;
                            continue;
                        }
                        
                        if (escolhaU < 1 || escolhaU > 4) {
                            System.out.println("\nOPCAO INVALIDA. Tente Novamente");
                            continue;
                        }
                        
                        switch (escolhaU) {
                            case 1:
                                bib.listarLivros();
                                break;
                            
                            case 2:
                                System.out.println("\nEMPRESTAR LIVRO");
                                System.out.print("Insira o ISBN do livro: ");
                                int isbn = scan.nextInt();
                                bib.emprestarLivro(isbn);
                                break;
                            
                            case 3:
                                System.out.println("\nCADASTRAR USUARIO");
                                System.out.print("Nome: ");
                                String adNome = scan.next();
                                System.out.print("E-mail: ");
                                String adEmail = scan.next();
                                bib.cadastrarUsuario(adNome, adEmail);
                                break;
                        }
                        
                    }
                    
                    break;
                
                case 2:
                    System.out.print("INSIRA SENHA: ");
                    String senha = scan.next();
                    
                    if(senha.equals(Biblioteca.SENHA_ADM) == false) {
                        System.out.println("ACESSO NEGADO.");
                        break;
                    }
                    
                    boolean continuarA = true;
                    
                    while (continuarA) {
                        System.out.println("\n-=-=-=-=-=-=- AREA DO ADMINISTRADOR -=-=-=-=-=-=-");
                        System.out.println("""
                                           
                                           1. Listar Livros
                                           2. Listar Usuarios
                                           3. Listar Admins
                                           4. Adicionar Livro
                                           5. Cadastrar-se
                                           6. VOLTAR""");
                        System.out.print("\nEscolha sua opcao: ");
                        
                        int escolhaA = scan.nextInt();
                        
                        if (escolhaA == 6) {
                            continuarA = false;
                            continue;
                        }
                        
                        if (escolhaA < 1 || escolhaA > 6) {
                            System.out.println("\nOPCAO INVALIDA. Tente Novamente");
                            continue;
                        }
                        
                        switch (escolhaA) {
                            case 1:
                                bib.listarLivros();
                                break;
                            
                            case 2:
                                bib.listarUsuarios();
                                break;
                            
                            case 3:
                                bib.listarAdministradores();
                                break;
                                
                            case 4:
                                System.out.println("\nADICIONAR LIVRO");
                                System.out.print("Insira o Titulo: ");
                                String adTitulo = scan.next();
                                System.out.print("Insira o Autor: ");
                                String adAutor = scan.next();
                                System.out.print("Insira o Ano: ");
                                int adAno = scan.nextInt();
                                bib.adicionarLivro(adTitulo, adAutor, adAno);
                                break;
                            
                            case 5:
                                System.out.println("\nCADASTRAR ADMINISTRADOR");
                                System.out.print("Nome: ");
                                String adNome = scan.next();
                                System.out.print("E-mail: ");
                                String adEmail = scan.next();
                                System.out.print("Cargo: ");
                                String adCargo = scan.next();
                                bib.cadastrarAdm(adNome, adEmail, adCargo);
                                break;
                        }
                        
                    }
                    
                    break;
            
        }
        
    }
        
    System.out.println("\n-=-=-=-=-=-=- ENCERRANDO PROGRAMA... -=-=-=-=-=-=-");
    scan.close();
        
}
    
}
