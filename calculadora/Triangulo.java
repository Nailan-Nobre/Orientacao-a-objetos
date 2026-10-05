package calculadora;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Triangulo {
    double operacoesComTriangulo(Scanner sc) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Digite a base do triângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = sc.nextDouble();
        System.out.println("A área do triângulo é: " + df.format((base * altura) / 2));
        System.out.println("O perímetro do triângulo é: " + df.format(base + 2 * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2))));
        sc.nextLine();
        return (double) base;
    }
}
