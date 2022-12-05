public class Main {
    public static void main(String[] args) {

        Cliente edmilson = new Cliente();
        edmilson.setNome("Edmilson");

        Conta cc = new ContaCorrente(edmilson);
        Conta poupança = new ContaPoupanca(edmilson);
        cc.depositar(100);
        cc.tranferir(100,poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();


    }
}
