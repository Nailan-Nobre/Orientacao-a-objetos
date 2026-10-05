package calculadora;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Trapezio {
    public double operacoesComTrapezio(Scanner sc) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = sc.nextDouble();
        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = sc.nextDouble();
        System.out.print("Digite a altura do trapézio: ");
        double altura = sc.nextDouble();
        System.out.println("A área do trapézio é: " + df.format(((baseMaior + baseMenor) * altura) / 2));
        System.out.println("O perímetro do trapézio é: " + df.format(baseMaior + baseMenor + 2 * Math.sqrt(Math.pow((baseMaior - baseMenor) / 2, 2) + Math.pow(altura, 2))));
        sc.nextLine();
        return (double) baseMaior;
    }
}
