import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("nome: ");
        String nome=scanner.next();

        System.out.println("Idade: " );
        int idade=scanner.nextInt();

        System.out.println("Altura :");
        double altura=scanner.nextDouble();

        System.out.println("Olá: "+nome+" Voce tem "+idade+" anos, e altura de : "+altura);
        } catch (InputMismatchException e){
            System.out.println("ERRO, os campos Idade e altura devem ser numeros !");
            System.out.println(" e o campo altura não pode conter . somente , ");
        }
    }
}
