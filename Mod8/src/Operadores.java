/**
 * @author lucas.negrini
 */

public class Operadores {

    public static void main(String[] args) {
       operacoesAritimeticas();
       operacoesAtribuicoes();
       operacoesIncrementoDecremento();
       operacoesRelacionais();
       operacoesLogicas();
    }

    private static void operacoesLogicas() {
        System.out.println("**** operacoesLogicas ****");
        int nun1 = 7;
        //1...10
        boolean isDentro10 = nun1 >= 1 && nun1 <= 10;
        System.out.println("isDentro10: " + isDentro10);

        // && (and) || (or)  ! (not)
    }

    private static void operacoesRelacionais() {
        System.out.println("**** operacoesRelacionais ****");
        int nun1 = 5;
        int nun2 = 3;
        boolean isMaior = nun1 > nun2;
        System.out.println("isMaior: " + isMaior);

        boolean isIgual = nun1 == nun2;
        System.out.println("isIgual: " + isIgual);

        boolean isDiff = nun1 != nun2;
        System.out.println("isDiff: " + isDiff);

    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("**** operacoesIncrementoDecremento ****");

        int numero1 = 13;
        System.out.println(numero1);
        numero1++;
        System.out.println(numero1);
        numero1--;
        System.out.println(numero1);

    }

    private static void operacoesAtribuicoes() {
        System.out.println("**** operacoesAtribuicoes ****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        System.out.println(numero3);
    }

    public static void operacoesAritimeticas(){
        System.out.println("**** operacoesAritimeticas ****");
        int nun1 = 15;
        int nun2 = 5;

        int nun3 = nun1 + nun2;
        int nun4 = nun1 - nun2;
        int nun5 = nun1 * nun2;
        int nun6 = nun1 / nun2;
        int nun7 = nun1 % nun2;
        int nun8 = (nun1 + nun2) / 2;

        System.out.println(nun3);
        System.out.println(nun4);
        System.out.println(nun5);
        System.out.println(nun6);
        System.out.println(nun7);
        System.out.println(nun8);
    }
}
