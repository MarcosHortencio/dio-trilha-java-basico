public class ExemploFor {
    public static void main(String[] args) {
        for (int carneirinhos=1;carneirinhos<=5;carneirinhos++){
             System.out.println("contando carneirinhos : "+carneirinhos);

        }
        System.out.println("joaozinho dormiu ...");
        System.out.println("");
        
        String alunos[]={"Arnaldo","Beatriz","Cesar","Dito"};
        for (int x=0;x<(alunos.length);x++){
            System.out.println("Aluno no indice " + x + " é : "+alunos[x]);
        }

        System.out.println("");
        System.out.println("for each");
        System.out.println("");

        for (String aluno:alunos){
            System.out.println("O nome do aluno é : "+aluno);
        }
        System.out.println("");
            
        System.out.println("fim");

    }
}
