package calculadora;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int opcao = -1;
    
        while (opcao != 0) {
            System.out.println("\n===== CALCULADORAS =====");
            System.out.println("1 - Calculadora Simples");
            System.out.println("2 - Calculadora de formas geométricas");
            //quantas opções você quiser adicionar
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
                    //CALCULADORA SIMPLES
                    CalculadoraSimples.main(args);
                }
                case 2 -> {
                    //CALCULADORA DE FORMAS GEOMÉTRICAS
                    CalcDeFormasGeometricas.main(args);
                }
                //quantas casos você quiser adicionar
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }
    
        sc.close();
    }

}
