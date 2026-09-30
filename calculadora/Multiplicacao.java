package calculadora;

import java.util.Scanner;

public class Multiplicacao {
    public double multiplicar(Scanner sc) {
        System.out.print("Quantos numeros deseja multiplicar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        double multiplicacao = 1;
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            multiplicacao *= sc.nextDouble();
            sc.nextLine();
        }
        return (double) multiplicacao;
    }
}
