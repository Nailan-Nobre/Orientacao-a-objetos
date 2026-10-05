package calculadora;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Retangulo {
    public double operacoesComRetangulo(Scanner sc) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        System.out.println("A área do retângulo é: " + df.format(base * altura));
        System.out.println("O perímetro do retângulo é: " + df.format(2 * (base + altura)));
        System.out.println("O comprimento da diagonal do retângulo é: " + df.format(Math.sqrt(base * base + altura * altura)));
        sc.nextLine();
        return (double) base;
    }
}
