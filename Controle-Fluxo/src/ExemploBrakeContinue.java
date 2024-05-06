public class ExemploBrakeContinue {
    public static void main(String[] args) {
        for (int i = 0; i <5;i++) {
            if (i==3){
               // System.out.println("cotador = 3 , parando ...");
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
}
