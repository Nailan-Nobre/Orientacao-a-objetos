package calculadora;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Circulo {
    public double operacoesComCirculo(Scanner sc) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        System.out.println("A área do círculo é: " + df.format(Math.PI * Math.pow(raio, 2)));
        System.out.println("O perímetro do círculo é: " + df.format(2 * Math.PI * raio));
        sc.nextLine();
        return (double) raio;
    }
}
