public class Main {
  public static void main(String[] args) {

    Saldo conta = new Saldo(250);

    CaixaEletronico caixaEletronico = new CaixaEletronico(20);

    try {
      caixaEletronico.saque(conta, 150);
    } catch (SaldoInsuficienteExeption | CelulaInsuficienteExeption e) {
      System.out.println(e.getMessage());
    }

    try {
      caixaEletronico.saque(conta, 200);
    } catch (SaldoInsuficienteExeption | CelulaInsuficienteExeption e) {
      System.out.println(e.getMessage());
    }

    try {
      caixaEletronico.saque(conta, 100);
    } catch (SaldoInsuficienteExeption | CelulaInsuficienteExeption e) {
      System.out.println(e.getMessage());
    }

  }
}