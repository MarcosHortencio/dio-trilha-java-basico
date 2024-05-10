import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      int parametroUm=0;
      int parametroDois=0;
  
      System.out.println("Informe o primeiro numero :");
      parametroUm= scanner.nextInt();
      System.out.println("Informe o segundo numero :");
      parametroDois= scanner.nextInt();
      System.out.println("");
      //i=parametroDois-parametroUm;
      
      laço(parametroUm,parametroDois);
    
    } catch (ParametrosInvalidosException e) {
        System.out.println("numero 2 não pode ser menor que numero 1 ..");
    }
    
  } 

  static void  laço(int n1,int n2 ) throws ParametrosInvalidosException {
    /*se n2 menor que n1, exception */
    if (n1>n2){
      throw new ParametrosInvalidosException();
    } 
    int contador= (n2-n1); 
    for (int b = 0; b<contador; b++) {
         System.out.println(b);
    }
    
  }
}
