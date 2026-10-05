package calculadora;
import java.util.Scanner;

public class CalcDeFormasGeometricas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int opcao = -1;
    
        while (opcao != 0) {
            System.out.println("\n===== CALCULADORA DE FORMAS GEOMÉTRICAS =====");
            System.out.println("1 - quadrado");
            System.out.println("2 - retangulo");
            System.out.println("3 - triangulo");
            System.out.println("4 - trapezio");
            System.out.println("5 - circulo");
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
                    System.out.println("\n--- QUADRADO ---");
                    new Quadrado().operacoesComQuadrado(sc);
                }
                case 2 -> {
                    System.out.println("\n--- RETANGULO ---");
                    new Retangulo().operacoesComRetangulo(sc);
                }
                case 3 -> {
                    System.out.println("\n---TRIANGULO ---");
                    new Triangulo().operacoesComTriangulo(sc);
                }
                case 4 -> {
                    System.out.println("\n--- TRAPEZIO ---");
                    new Trapezio().operacoesComTrapezio(sc);
                }
                case 5 -> {
                    System.out.println("\n--- CIRCULO ---");
                    new Circulo().operacoesComCirculo(sc);
                }

                case 0 -> Main.main(args);
                default -> System.out.println("Opção inválida!");
            }
        }
    
        sc.close();
    }

}
