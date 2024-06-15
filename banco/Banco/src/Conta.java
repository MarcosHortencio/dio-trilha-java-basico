import java.util.List;

public abstract class Conta implements Iconta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Cliente> contas;
    
// modificadores de acesso 
//public acesso de qq lugar
// default so no pacote que ele foi definido 
//protected ( heranca ) as classes filhas conseguem ter acesso
// private , so a classe

    private static int SEQUENCIAL = 1;
    private static final  int AGENCIA_PADARAO=1;

    public Conta(Cliente cliente) {
        this.agencia=AGENCIA_PADARAO;
        this.numero=SEQUENCIAL++;
        this.cliente=cliente;

    }   

    @Override
    public void sacar(double valor) {
       saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
       saldo +=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    protected void ImprimirInfosComuns(){
      System.out.println(String.format("Titular: %s", this.cliente.getNome()));
      System.out.println(String.format("Agencia: %d", this.agencia));
      System.out.println(String.format("Conta  : %d", this.numero));
      System.out.println(String.format("Saldo  : %.2f", this.saldo));


    }


    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
  
}
