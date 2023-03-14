public class Operadores {
    
    public static void main(String[] args) {
        String nomeDaLiguagem = "LINGUAGEM " + "JAVA";

        System.out.println(nomeDaLiguagem);
        
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        System.out.println();

    }
}
