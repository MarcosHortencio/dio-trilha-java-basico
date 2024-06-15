public class Banco {
 public static void main(String[] args) {
    Cliente cliente =new Cliente();
    Cliente cliente2 =new Cliente();
    cliente.nome="Marcos"; 

    cliente2.nome="Maria";


    Conta cc = new ContaCorrente(cliente);
    Conta pp = new ContaPoupanca(cliente);
    Conta cc2 = new ContaCorrente(cliente2);
    Conta pp2 = new ContaPoupanca(cliente2);

    System.out.println("deposatr 100 ");
    cc.depositar(100);
    cc.imprimirExtrato();
    pp.imprimirExtrato();
    System.out.println("transfere 50");
    cc.transferir(50, pp);
    cc.imprimirExtrato();
    pp.imprimirExtrato();
    cc2.depositar(150);
    cc2.sacar(50);
    cc2.imprimirExtrato();
    cc2.transferir(100, pp);
    pp.imprimirExtrato();
   

}
}