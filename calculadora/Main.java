package calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
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
                    System.out.println("\n--- SOMA ---");
                    System.out.println("\nA soma dos numeros é: " + new Soma().somar(sc));
                }
                case 2 -> {
                    System.out.println("\n--- SUBTRAÇÃO ---");
                    System.out.println("\nA subtração dos numeros é: " + new Subtracao().subtrair(sc));
                }
                case 3 -> {
                    System.out.println("\n--- MULTIPLICAÇÃO ---");
                    System.out.println("\nA multiplicação dos numeros é: " + new Multiplicacao().multiplicar(sc));
                }
                case 4 -> {
                    System.out.println("\n--- DIVISÃO ---");
                    System.out.println("\nA divisão dos numeros é: " + new Divisao().dividir(sc));
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
