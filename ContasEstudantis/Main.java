package ContasEstudantis;

public class Main {

    public static void main(String[] args) {

        // 1) Instanciação dos alunos
        Aluno carlos  = new Aluno("Carlos Silva",  "123456", "carlossilva@email.com");
        Aluno beatriz = new Aluno("Beatriz Souza", "654321", "beatrizsouza@email.com");

        // 2) Contas associadas aos alunos (limite de crédito R$ 50,00 para o Carlos)
        ContaEstudantil contaDoCarlos  = new ContaEstudantil("001", carlos,  50.0);
        ContaEstudantil contaDaBeatriz = new ContaEstudantil("002", beatriz, 50.0);

        System.out.println("=== Estado inicial ===");
        contaDoCarlos.exibirDados();
        contaDaBeatriz.exibirDados();

        // 3) Depósito inválido (negativo)
        System.out.println("\n=== Depósito inválido (-50) na conta do Carlos ===");
        contaDoCarlos.depositar(-50.0);
        contaDoCarlos.exibirDados();

        // 4) Depósito válido de R$ 100,00
        System.out.println("\n=== Depósito válido (100) na conta do Carlos ===");
        contaDoCarlos.depositar(100.0);
        contaDoCarlos.exibirDados();

        // 5) Pagamento de R$ 130,00 com saldo 100 e limite 50
        System.out.println("\n=== Pagamento de R$ 130,00 na conta do Carlos ===");
        boolean ok = contaDoCarlos.pagar(130.0);
        System.out.println("Pagamento autorizado? " + ok);
        contaDoCarlos.exibirDados();

        // 6) Tentativa de pagamento acima do limite disponível
        System.out.println("\n=== Pagamento de R$ 30,00 (deve falhar: saldo+limite = 20) ===");
        boolean ok2 = contaDoCarlos.pagar(30.0);
        System.out.println("Pagamento autorizado? " + ok2);
        contaDoCarlos.exibirDados();

        // 7) Transferência Carlos -> Beatriz
        System.out.println("\n=== Transferência de R$ 10,00 de Carlos para Beatriz ===");
        contaDoCarlos.transferir(contaDaBeatriz, 10.0);

        System.out.println("\n=== Saldos finais ===");
        contaDoCarlos.exibirDados();
        contaDaBeatriz.exibirDados();
    }
}