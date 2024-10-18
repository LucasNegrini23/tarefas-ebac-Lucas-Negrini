package br.com.lnegrini.test;

public class LambdaMethod {

    public static void main(String[] args) {
        MyEventConsumer myEvent1 = s -> imprimir(s);
        myEvent1.consumer("Ola1");
    }

    private static void imprimir(Object o) {
        System.out.println(o);
    }
}
