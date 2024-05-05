import java.util.Scanner;

public class ResultadoEscolar {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Informe a nota : ");
    int nota =scanner.nextInt();

    
    if (nota>=7){
        System.out.println("Aprovado ! ");
    }else if (nota>=5 && nota<7) {
        System.out.println("recuperacção ! ");
    }else{
        System.out.println("reprovado! ");


    }
      

 //condição Ternária
 /*
   String resultado = nota>=7 ? "aprovado":nota>=5 && nota<7 ? "Recuperação":"Reprovado";
   System.out.println(resultado);
   */

 }   
}
