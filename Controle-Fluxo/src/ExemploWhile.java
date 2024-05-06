import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada=50;

        while (mesada>0) {
            double valorDoce=valorAleatorio();
            if (valorDoce>mesada){
               valorDoce=mesada;
            }
            mesada=mesada-valorDoce;
            System.out.println("Doce do valor R$ "+valorDoce+" adicionado ao carrinho.");
        }
        System.out.println(" ");
        System.out.println("mesada : "+mesada);
        System.out.println("Acabou a mesada ! "); 
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
