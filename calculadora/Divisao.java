package calculadora;

import java.util.Scanner;

public class Divisao {
    public double dividir(Scanner sc) {
        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        sc.nextLine();
        double divisao = num1 / num2;
        return (double) divisao;
    }
}
