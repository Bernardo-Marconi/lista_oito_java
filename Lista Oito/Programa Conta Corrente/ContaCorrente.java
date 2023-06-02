public class ContaCorrente {

    private String nome, numeroConta;
    private double saldo = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double depositar(double valorDepositado) {
        saldo += valorDepositado;
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double sacar(double valorDoSaque) {
        saldo -= valorDoSaque;
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}