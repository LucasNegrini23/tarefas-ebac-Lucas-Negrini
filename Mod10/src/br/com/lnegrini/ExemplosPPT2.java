package br.com.lnegrini;

/**
 * @author lucas
 */

public class ExemplosPPT2 {

    public static void main(String[] args) {
        int result = 0;

        if (result > 1 && result < 5) {
            System.out.println("Resultando está entre 1 e 5");
        } else if (result >= 5 && result < 8) {
            System.out.println("Resultando está entre 5 e 8");
        } else {
            System.out.println("Resultando diferente dos anteriores");
        }
    }
}
