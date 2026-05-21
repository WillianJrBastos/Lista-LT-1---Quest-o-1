public class CaixaEletronico {

    private double notas;
    double notasASeremSacadas;

    public CaixaEletronico(int notas) {
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public void saque(Saldo conta, double valor) throws SaldoInsuficienteExeption, CelulaInsuficienteExeption {
        conta.realizarSaque(valor);

            notasASeremSacadas = valor / 10;
            if (notasASeremSacadas > notas) {
                conta.voltarSaldo();
                throw new CelulaInsuficienteExeption("Celulas insuficientes!");
            }
                notas -= notasASeremSacadas;
                System.out.println("Saque de R$" + valor + " realizado com sucesso!");
    }
}
