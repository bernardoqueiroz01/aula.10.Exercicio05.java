public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;



    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void exibirExtrato(){
        System.out.println("====== Extrato ======\nTitular: " + titular + "\nConta: " + numeroConta + "\nSaldo: " + saldo + "\n=====================");
    }
}
