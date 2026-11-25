package techShop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Produto[] produtos = {
            new Produto("Teclado", 123, 40, 50),
            new Produto("Mouse", 456, 30, 50)
        };

        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== TechShop =====");
            System.out.println("1 - Exibir produto");
            System.out.println("2 - Adicionar ao estoque");
            System.out.println("3 - Remover do estoque");
            System.out.println("4 - Descrição da loja");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1 -> Produto.exibirProduto(sc, produtos);
                case 2 -> Produto.adicionarAoEstoque(sc, produtos);
                case 3 -> Produto.removerDoEstoque(sc, produtos);
                case 4 -> System.out.println("A TechShop é uma loja com apenas dois tipos de eletrônicos... (Comprei 50 kits teclado + mouse sem querer ;-;)");
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}