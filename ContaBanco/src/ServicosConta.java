public class ServicosConta {
    private double saldo = 0;

    public double Depositar(double deposito) {
        this.saldo += deposito;
        return this.saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
