package ContasEstudantis;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        new Aluno("Carlos Silva", "123456", "carlossilva@email.com");
        new Aluno("Beatriz Souza", "654321", "beatrizsouza@email.com");
        
        ContaEstudantil conta1 = new ContaEstudantil("001", "Carlos Silva", 0.0, 10.0);
        ContaEstudantil conta2 = new ContaEstudantil("002", "Beatriz Souza", 0.0, 10.0);

        Scanner sc = new Scanner(System.in);
    
        int opcao = -1;
    
        while (opcao != 0) {
            System.out.println("\n===== MENU PADRAO =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Pagar");
            System.out.println("3 - Transferir");
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
                    System.out.println("\n--- DEPOSITAR ---");
                    conta1.depositar(100.0);
                    conta2.depositar(100.0);
                }
                case 2 -> {
                    System.out.println("\n--- PAGAR ---");
                    conta1.pagar(30.0);
                    conta2.pagar(20.0);
                }
                case 3 -> {
                    System.out.println("\n--- TRANSFERIR ---");
                    conta1.transferir(conta2, 50.0);
                    conta2.transferir(conta1, 25.0);
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }
    
        sc.close();
    }

}
