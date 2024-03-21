package EserciziChat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class GerenciadorContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContatoManager manager = new ContatoManager();

        System.out.println("Bem-vindo ao Gerenciador de Contatos!");

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nDigite 1 para adicionar um contato");
            System.out.println("Digite 2 para remover um contato");
            System.out.println("Digite 3 para listar todos os contatos");
            System.out.println("Digite 0 para sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número de telefone do contato: ");
                    String telefone = scanner.nextLine();
                    manager.adicionarContato(nome, telefone);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato que deseja remover: ");
                    String nomeRemover = scanner.nextLine();
                    manager.removerContato(nomeRemover);
                    break;
                case 3:
                    manager.listarContatos();
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

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

class ContatoManager {
    private List<Contato> contatos;

    public ContatoManager() {
        this.contatos = new ArrayList<>();
    }

    // Métodos para adicionar, remover e listar contatos
    // Implemente-os conforme necessário
    public void adicionarContato(String nome, String telefone) {
        if (nome.isEmpty() || telefone.isEmpty()) {
            System.out.println("Erro: Nome e número de telefone não podem ser vazios.");
            return;
        }

        Contato novoContato = new Contato(nome, telefone);

        contatos.add(novoContato);

        System.out.println(
                "Contato adicionado com sucesso: " + novoContato.getNome() + " - " + novoContato.getTelefone());
    }

    public void removerContato(String nome) {
        if (contatos.isEmpty()) {
            System.out.println("A lista de contatos está vazia. Não há contatos para remover.");
            return;
        }

        boolean contatoEncontrado = false;
        for (Iterator<Contato> iterator = contatos.iterator(); iterator.hasNext();) {
            Contato contato = iterator.next();
            if (contato.getNome().equalsIgnoreCase(nome)) {
                iterator.remove(); // Remover o contato da lista
                contatoEncontrado = true;
                System.out
                        .println("Contato removido com sucesso: " + contato.getNome() + " - " + contato.getTelefone());
                break;
            }
        }

        if (!contatoEncontrado) {
            System.out.println("O contato \"" + nome + "\" não foi encontrado na lista.");
        }
    }

    public void listarContatos() {
        // Verificar se a lista de contatos está vazia
        if (contatos.isEmpty()) {
            System.out.println("A lista de contatos está vazia. Não há contatos para listar.");
            return;
        }

        // Iterar sobre a lista de contatos e imprimir os detalhes de cada contato
        System.out.println("Lista de contatos:");
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("-----------------------");
        }
    }
}