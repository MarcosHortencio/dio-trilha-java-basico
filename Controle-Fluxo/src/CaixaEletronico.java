public class CaixaEletronico {
   public static void main(String[] args) {
      double saldo=25.00;
      double valorSolicitado=50.00;

      if (valorSolicitado<=saldo){
          saldo=saldo-valorSolicitado;
          System.out.println("Saque de "+valorSolicitado);
          System.out.println("Novo Saldo = "+saldo);
          System.out.println("Fim da operação ...");
        }else{
          System.out.println("Saldo Insuficiente ....");
      }

   }    
}
