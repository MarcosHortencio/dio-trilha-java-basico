import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
   public static void main(String[] args) {
      System.out.println("Processo Seletivo");
      /*
      analisarCandidato(800.0);
      analisarCandidato(2000.0);
      analisarCandidato(2500.0);
       */
      String candidatos[]={"Ana","Beto","Cesar","Denise","Elenilda","Fernando","Geraldo","Heloisa"};

      int candidatosSelecionado=0;
      int candidatAtual=0;
      int i=0;
      double salarioPretendido=0;
      double salarioBase=2000.0;

      
      while (i<candidatos.length && candidatosSelecionado<3){
         salarioPretendido=gerarSalario();
         
         if (salarioBase>salarioPretendido){
            System.out.println("O candidato: "+candidatos[i] + " pediu R$ "+ salarioPretendido);
            //System.out.println("ligar para candidato");
            ligarParaCandidato();
            candidatosSelecionado++;
         }else{
            //System.out.println("Aguardar analise dos outros candidatos");
         }        
         
         candidatAtual++;
         i++;
      }
      System.out.println("Candidatos verifivcados : " + candidatAtual);

}

     static void ligarParaCandidato(){
           boolean atendeu=false;
           boolean continuarTentando=true;
           int tentativas=0;

           do {
            atendeu=atender();
            continuarTentando= !atendeu;
            if (continuarTentando){
                tentativas++;
            }else{
                 System.out.println("Contato realizado !");        
            }   

            }while (continuarTentando && tentativas<3);
            if (atendeu){
                System.out.println("Atendeu ..."+tentativas);
            }else{
                System.out.println("Não atendeu ..."+tentativas);
            }
     }

     static boolean atender(){
     return new Random().nextInt(3)==1;
   }

   static double gerarSalario(){
     return ThreadLocalRandom.current().nextDouble(1800,2200);
   }
/*
   static void  analisarCandidato(double salarioPretendido){
     double salarioBase =2000.0;

     if (salarioBase>salarioPretendido){
         System.out.println("Ligar para candidato : "+salarioPretendido);
     }else if(salarioBase==salarioPretendido){
        System.out.println("Ligar com contra-proposta : "+salarioPretendido);

     } else {
         System.out.println("Aguardando resultado dos demais candidados");
         System.out.println("Salario pretendido: " + salarioPretendido);
     }
    return;
   }
    */
}
