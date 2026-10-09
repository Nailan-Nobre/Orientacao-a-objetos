package ContasEstudantis;

public class ContaEstudantil {
    private final String numeroDaConta;
    private double saldo;
    private String titular;
    private double limiteDeCredito;

    public ContaEstudantil(String numeroDaConta, String titular, double saldo, double limiteDeCredito) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = 0.0;
        this.limiteDeCredito = limiteDeCredito;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void pagar(double valor) {
        if (valor > 0 && valor <= saldo + limiteDeCredito) {
            saldo -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void transferir(ContaEstudantil contaDestino, double valor) {
        if (valor > 0 && valor <= saldo + limiteDeCredito) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + contaDestino.getNumeroDaConta() + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
