package calculadora;
import java.util.Scanner;

public class Subtracao {
    public double subtrair(Scanner sc) {
        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        sc.nextLine();
        double subtracao = num1 - num2;
        return (double) subtracao;
    }
}
