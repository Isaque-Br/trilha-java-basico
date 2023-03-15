public class OperadorTernario {

    public static void main(String[] args) {
        
        /*forma resumida para definir uma condição escolher entre dois valores como um IF normal escrito em uma linha */
        
        int a, b, c, d;
        a = 6;
        b = 6;
        c = 7;
        d = 8;

        String resultado = a==b ? "true" : "false";
        System.out.println(resultado);

        int resultado2 = c==b ? 1 : 2;
        System.out.println(resultado2);
    }
    
}
