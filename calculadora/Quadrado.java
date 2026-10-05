package calculadora;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Quadrado {
    public double operacoesComQuadrado(Scanner sc) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("A área do quadrado é: " + df.format(lado * lado));
        System.out.println("O perímetro do quadrado é: " + df.format(4 * lado));
        System.out.println("O comprimento da diagonal do quadrado é: " + df.format(lado * Math.sqrt(2)));
        sc.nextLine();
        return (double) lado;
    }
}
