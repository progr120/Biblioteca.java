package EserciziChat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaGestaoEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstoqueManager estoqueManager = new EstoqueManager();

        estoqueManager.adicionarProduto("Camiseta", 20, 15.99);
        estoqueManager.adicionarProduto("Calça Jeans", 15, 39.99);
        estoqueManager.adicionarProduto("Tênis", 10, 79.99);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Atualizar a quantidade");
            System.out.println("4 - Buscar Produto");
            System.out.println("5 - Lista Produtos");
            System.out.println("0 - Sair do sistema");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeProduto = scanner.nextInt();
                    if (quantidadeProduto <= 0) {
                        System.out.println("Quantidade inválida. A quantidade deve ser um número positivo.");
                        break;
                    }
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto;
                    if (scanner.hasNextDouble()) {
                        precoProduto = scanner.nextDouble();
                        if (precoProduto < 0) {
                            System.out.println("Preço inválido. O preço deve ser um número positivo.");
                            break;
                        }
                    } else {
                        System.out.println("Preço inválido. O preço deve ser um número.");
                        break;
                    }
                    estoqueManager.adicionarProduto(nomeProduto, quantidadeProduto, precoProduto);
                    System.out.println("Produto adicionado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String produtoARemover = scanner.nextLine();
                    estoqueManager.removerProduto(produtoARemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String produtoQuantidade = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoqueManager.atualizarQuantidade(produtoQuantidade, novaQuantidade);
                    break;
                case 4:
                    System.out.print("Digite o nome do produto: ");
                    String nomeBusca = scanner.nextLine();
                    estoqueManager.buscarProduto(nomeBusca);
                    break;
                case 5:
                    estoqueManager.listarProdutos();
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

class EstoqueManager {
    private List<Produto> estoque;

    public EstoqueManager() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        Produto novoProduto = new Produto(nome, quantidade, preco);
        estoque.add(novoProduto);
    }

    public void removerProduto(String nome) {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio. Não há produtos para remover.");
            return;
        }

        boolean produtoEncontrado = false;
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                estoque.remove(produto);
                produtoEncontrado = true;
                System.out.println("Produto removido com sucesso: " + produto.getNome());
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("O produto \"" + nome + "\" não está no estoque.");
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio. Não há produtos para atualizar.");
            return;
        }
        boolean produtoEncontrado = false;
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(novaQuantidade);
                produtoEncontrado = true;
                System.out.println("Quantidade do produto \"" + nome + "\" atualizada para " + novaQuantidade);
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("O produto \"" + nome + "\" não está no estoque.");
        }
    }

    public void buscarProduto(String nome) {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio. Não há produtos para buscar.");
            return;
        }

        boolean produtoEncontrado = false;
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoEncontrado = true;
                System.out.println("Produto encontrado: " + produto.getNome());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Preço: " + produto.getPreco());
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("O produto \"" + nome + "\" não está no estoque.");
        }
    }

    public void listarProdutos() {
        System.out.println("Lista de produtos em estoque: ");
        for (Produto produto : estoque) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("preco: " + produto.getPreco());
            System.out.println("---------------------------------");
        }
    }
}

class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
