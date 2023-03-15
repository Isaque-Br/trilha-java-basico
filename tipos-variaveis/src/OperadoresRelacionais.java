public class OperadoresRelacionais {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das duas é verdadeira");
        }


        String nomeUm = "Isaque";
        String nomeDois = new String("Isaque");
        System.out.println("Condição String não compara sem equals" + nomeUm == nomeDois); 
        System.out.println("Usando equals para comparar String " + nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 > numero2) {
            System.out.println("Essa condição é verdadeira");
        } else {
            System.out.println("Essa condição é falsa");
        }

        System.out.println("numeroUm é igual ao numeroDois? " + simNao);
        
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente do numeroDois? " + simNao);
    
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que o numeroDois? " + simNao);
    }
    
}
