package EserciziChat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaManager biblioteca = new BibliotecaManager();

        // Exemplo de utilização do sistema
        // Você pode expandir isso para um menu interativo
        biblioteca.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        biblioteca.adicionarLivro("1984", "George Orwell", 1949);
        biblioteca.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);

        System.out.println("Bem-vindo à Biblioteca!");
        System.out.println("Digite 1 para adicionar um livro");
        System.out.println("Digite 2 para remover um livro");
        System.out.println("Digite 3 para buscar um livro");
        System.out.println("Digite 4 para listar todos os livros");
        System.out.println("Digite 5 para verificar a disponibilidade de um livro");
        System.out.println("Digite 0 para sair");

        int opcao = -1;
        while (opcao != 0) {
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação do livro: ");
                    int ano = scanner.nextInt();
                    biblioteca.adicionarLivro(titulo, autor, ano);
                    break;
                case 2:
                    System.out.print("Digite o título do livro que deseja remover: ");
                    String livroRemover = scanner.nextLine();
                    biblioteca.removerLivro(livroRemover);
                    break;
                case 3:
                    System.out.print("Digite o título do livro que deseja buscar: ");
                    String livroBuscar = scanner.nextLine();
                    biblioteca.buscarLivro(livroBuscar);
                    break;
                case 4:
                    biblioteca.listarLivros();
                    break;
                case 5:
                    System.out.print("Digite o título do livro que deseja verificar a disponibilidade: ");
                    String livroDisponivel = scanner.nextLine();
                    biblioteca.verificarDisponibilidade(livroDisponivel);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}

class BibliotecaManager {
    private List<Livro> livros;

    public BibliotecaManager() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
        livros.add(novoLivro);
        System.out.println("Livros adicionados com sucesso: " + novoLivro.getTitulo());
    }

    public void removerLivro(String titulo) {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca esta vazia. Nao ha livros para remover.");
            return;
        }

        for (Iterator<Livro> iterator = livros.iterator(); iterator.hasNext();) {
            Livro livro = iterator.next();
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                iterator.remove(); // Remover o livro da lista
                System.out.println("Livro removido com sucesso: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("O livro \"" + titulo + "\" não está na biblioteca.");
    }

    public void buscarLivro(String titulo) {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca esta vazia. Nao ha livros para remover.");
            return;
        }

        for (Iterator<Livro> iterator = livros.iterator(); iterator.hasNext();) {
            Livro livro = iterator.next();
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("O livro \"" + titulo + "\" não está na biblioteca.");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca esta vazia. Nao ha livros para remover.");
            return;
        }

        System.out.println("Lista de livros na biblioteca: ");
        for(Livro livro : livros){
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de publicaçao: " + livro.getAnoPublicacao());
            System.out.println("----------------------------------------");
        }
    }

    public void verificarDisponibilidade(String titulo) {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca esta vazia. Nao ha livros para remover.");
            return;
        }

        for(Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("O livro \"" + titulo + "\"esta disponivel na biblioteca");
                return;
            }
        }
        System.out.println("O livro \"" + titulo + "\"nao esta disponivel na biblioteca");
    }
}
