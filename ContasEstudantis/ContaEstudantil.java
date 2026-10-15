package ContasEstudantis;

public class ContaEstudantil {

    private final String numeroDaConta;
    private double saldo;
    private final Aluno titular;   
    private double limiteDeCredito;

    public ContaEstudantil(String numeroDaConta, Aluno titular, double limiteDeCredito) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.limiteDeCredito = limiteDeCredito;
        this.saldo = 0.0;
    }

    public String getNumeroDaConta()   { return numeroDaConta; }
    public double getSaldo()           { return saldo; }
    public Aluno getTitular()          { return titular; }
    public double getLimiteDeCredito() { return limiteDeCredito; }

    public void setLimiteDeCredito(double limiteDeCredito) {
        if (limiteDeCredito >= 0) this.limiteDeCredito = limiteDeCredito;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
            return true;
        }
        System.out.println("Valor de depósito inválido.");
        return false;
    }

    public boolean pagar(double valor) {
        if (valor > 0 && valor <= saldo + limiteDeCredito) {
            saldo -= valor;
            System.out.printf("Pagamento de R$ %.2f realizado com sucesso.%n", valor);
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido.");
        return false;
    }

    public boolean transferir(ContaEstudantil destino, double valor) {
        if (destino == null || destino == this) {
            System.out.println("Conta de destino inválida.");
            return false;
        }
        if (pagar(valor)) {
            destino.depositar(valor);
            System.out.printf("Transferência de R$ %.2f para a conta %s realizada com sucesso.%n",
                    valor, destino.getNumeroDaConta());
            return true;
        }
        return false;
    }

    public void exibirDados() {
        System.out.printf("Conta %s | Titular: %s | Saldo: R$ %.2f | Limite: R$ %.2f%n",
                numeroDaConta, titular.getNome(), saldo, limiteDeCredito);
    }
}