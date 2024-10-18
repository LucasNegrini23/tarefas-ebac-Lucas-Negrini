package br.com.lnegrini.test;

public class ReferencyMethod {

    public static void main(String[] args) {
        //Exemplo Lambda
        MyEventConsumer myEvent1 = s -> System.out.println(s);
        myEvent1.consumer("Ola1 Exemplo Lambda");

        // Exemplo Referency Method
        MyEventConsumer myEvent2 = System.out::println;
        myEvent2.consumer("Ola2 Exemplo Referency Method ");
    }
}

