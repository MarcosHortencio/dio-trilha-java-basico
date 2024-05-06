import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
      int tentativas=0;

       do {
          System.out.println("Chamando ... "+tentativas++);
       }while(tocando()); 
       

       /*while(tocando()){
        System.out.println("Chamando ... "+tentativas++);
       }
       */       
       System.out.println("atendeu ...");   

    }
 
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(9)==1;
        return ! atendeu;
    }
}
