public class SistemaMedida {
 public static void main(String[] args) {
    String sigla="x";

    /*
    if (sigla=="P"){
        System.out.println("[P]equeno");
    }else if (sigla=="M"){
        System.out.println("[M]edio");
    }else if (sigla=="G"){
        System.out.println("[G]rande");
    }else{
        System.out.println("NÃO CATALOGADO...");
    }
    */
    switch (sigla){
        case "P":
            System.out.println("[P]equeno");
            break;
        case "M":
            System.out.println("[M]edio");
            break;
        case "G":
            System.out.println("[G]rande");
            break;
        default:
            System.out.println("NÃO CATALOGADO...");
            break;
    }

 }   
}
