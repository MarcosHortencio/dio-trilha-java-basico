import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        String  nomeCliente=" ";
        String  agencia=" ";
        int     numero=0;
        double  saldo=0.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Por favor infome: ");

        System.out.println("O nome do cliente: ");
        nomeCliente=scanner.nextLine();
        
        System.out.println("O número: ");
        numero= scanner.nextInt();

        System.out.println("A Agência: ");
        agencia=scanner.nextLine();
        agencia=scanner.nextLine();

        

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +   ", conta "+ numero +" e seu saldo "+ saldo + " já está disponível para saque");


    }
}
