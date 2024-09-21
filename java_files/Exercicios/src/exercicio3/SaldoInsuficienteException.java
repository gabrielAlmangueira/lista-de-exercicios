package exercicio3;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldo, double valor) {
        super("Saldo insuficiente: " + saldo + ". Tentativa de saque: " + valor);
    }
}