public class ProgramaContaCorrente {
    public static void main(String[] args) {
        
    ContaCorrente contaCorrente = new ContaCorrente();

    contaCorrente.setNome("Bernardo");
    contaCorrente.setNumeroConta("12345678");
    contaCorrente.depositar(5000);
    contaCorrente.sacar(1000);

    System.out.println(contaCorrente.getNome());
    System.out.println(contaCorrente.getNumeroConta());
    System.out.println("R$ " + contaCorrente.getSaldo());
    }
}
