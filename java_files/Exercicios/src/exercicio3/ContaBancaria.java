package exercicio3;

public class ContaBancaria {
    String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso!");
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);
        conta.consultarSaldo();
        conta.depositar(500);
        conta.consultarSaldo();
        try {
            conta.sacar(200);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
        conta.consultarSaldo();
        try {
            conta.sacar(2000);
        } catch (SaldoInsuficienteException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }  // Testando saldo insuficiente
    }
}
