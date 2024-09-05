package br.com.lnegrini;

public class ExemplarBoxing {

    public static void main(String[] args) {
//autoboxing
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;

        Long cpf = 004444L;

//unboxing
        boolean status2 = Boolean.FALSE;
        char letra = Character.valueOf('A');

        int idade2 = Integer.valueOf(12);

        long cpf2 = Long.valueOf(12345);
    }

}
