public class ContaBancaria {

    String titular;
    String numeroConta;
    double saldo;

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirExtrato() {

        System.out.println("====== Extrato ======");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("=====================");
    
    }    
}