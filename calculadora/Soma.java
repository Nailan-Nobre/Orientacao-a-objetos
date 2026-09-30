package calculadora;
import java.util.Scanner;

public class Soma {
    public double somar(Scanner sc) {
        System.out.print("Quantos numeros deseja somar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            soma += sc.nextDouble();
            sc.nextLine();
        }
        return (double) soma;
    }
}
