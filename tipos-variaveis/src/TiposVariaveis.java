public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "Isaque";
        double salarioMinimo = 1320;
        int idade = 31;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        int numeroCurto2 = numeroNormal;

        int numero = 5;
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero = + numero;                  /*numero sem alteração */
        System.out.println(numero);

        numero = numero * - 1;              /*Transformando o numero em positivo */
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

    }
}
 