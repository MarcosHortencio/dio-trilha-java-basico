public class FormatadorCep {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            String cepFormatado=formatarCep("3765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
                 // e.printStackTrace();
                 System.out.println("Cep inavlido, não corresponde a regra de negocio...");
        }
        
    }


    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() !=8 ){
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }
}
