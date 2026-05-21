public class Saldo {

    private double saldo;
    double saldoReservado = 0;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoReservado() {
        return saldoReservado;
    }

    public void setSaldoReservado(double saldoReservado) {
        this.saldoReservado = saldoReservado;
    }

    public void realizarSaque(double valor) throws SaldoInsuficienteExeption {
        if (saldo >= valor) {
            saldo -= valor;
            saldoReservado = valor;
        } else {
            throw new SaldoInsuficienteExeption("Saldo insuficiente!");
        }
    }

    public void voltarSaldo() {
        saldo += saldoReservado;
        saldoReservado = 0;
    }
}
