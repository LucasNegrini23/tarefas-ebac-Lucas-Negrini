package br.com.lnegrini;

public class ExemplarCasting {

    public static void main(String[] args) {
//Casting Explicit
        int num1 = 10;
        short num2 = (short) num1;

        long numL = 111111111111111l;
        System.out.println(numL);
        int numI = (int) numL;
        System.out.println(numI);

//Casting Implicit
        int idade = 10;
        long idadeL = idade;
        System.out.println(idadeL);

        byte b = 1;
        short s = b;
        System.out.println(s);

    }
}
