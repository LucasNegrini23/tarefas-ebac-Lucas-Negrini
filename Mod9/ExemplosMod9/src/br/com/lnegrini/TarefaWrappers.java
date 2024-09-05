package br.com.lnegrini;

/**
 * @author lucas.negrini
 */

public class TarefaWrappers {

    public static void main(String[] args) {

        long cpf = 111115L;  // Primitivo 'long'
        System.out.println("CPF: " + cpf);

        Long cpf1 = Long.valueOf(cpf);  // Convertendo 'cpf' (long) para 'Long'
        System.out.println("CPF1: " + cpf1);


    }
}
