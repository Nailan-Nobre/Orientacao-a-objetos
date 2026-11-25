package techShop;
import java.util.Scanner;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    private String getNome() {
        return this.nome;
    }

    private double getPreco() {
        return this.preco;
    }

    private int getCodigo() {
        return this.codigo;
    }

    private int getQuantidade() {
        return this.quantidade;
    }

    private static Produto escolherProduto(Scanner sc, Produto[] produtos) {
        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    public static void exibirProduto(Scanner sc, Produto[] produtos) {
        Produto p = escolherProduto(sc, produtos);
        if (p == null) return;

        System.out.println("Nome: " + p.getNome());
        System.out.println("Código: " + p.getCodigo());
        System.out.println("Preço: R$" + p.getPreco());
        System.out.println("Quantidade em estoque: " + p.getQuantidade());
    }

    public static void adicionarAoEstoque(Scanner sc, Produto[] produtos) {
        Produto p = escolherProduto(sc, produtos);
        if (p == null) return;

        System.out.print("Quantos produtos deseja adicionar ao estoque? ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        if (quantidade <= 0) {
            System.out.println("Erro: a quantidade deve ser maior que zero.");
        } else {
            p.quantidade += quantidade;
            System.out.println(p.getNome() + " adicionado com sucesso. Nova quantidade em estoque: " + p.getQuantidade());
        }
    }

    public static void removerDoEstoque(Scanner sc, Produto[] produtos) {
        Produto p = escolherProduto(sc, produtos);
        if (p == null) return;

        System.out.print("Quantos produtos deseja remover do estoque? ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        if (quantidade <= 0) {
            System.out.println("Erro: a quantidade deve ser maior que zero.");
        } else if (quantidade > p.quantidade) {
            System.out.println("Quantidade insuficiente em estoque. Remoção não realizada.");
        } else {
            p.quantidade -= quantidade;
            System.out.println(p.getNome() + " removido com sucesso. Nova quantidade em estoque: " + p.getQuantidade());
        }
    }
}