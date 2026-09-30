package editorDeArquivo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String arquivo = "editorDeArquivo/readme.md";
        Leitor leitor = new Leitor(arquivo);
        Editor editor = new Editor(arquivo);
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== EDITOR DE TEXTO =====");
            System.out.println("1 - Ver conteúdo");
            System.out.println("2 - Sobrescrever (apaga tudo e escreve)");
            System.out.println("3 - Adicionar texto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n--- CONTEÚDO ATUAL ---");
                    System.out.println(leitor.ler());
                    System.out.println("----------------------");
                }
                case 2 -> {
                    System.out.println("Digite o novo conteúdo:");
                    String texto = sc.nextLine();
                    editor.salvar(texto);
                }
                case 3 -> {
                    System.out.println("Digite o texto para adicionar:");
                    String texto = sc.nextLine();
                    editor.adicionar(texto + System.lineSeparator());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}