package br.com.lnegrini.test;


@FunctionalInterface
public interface MyEventConsumer {

        void consumer(Object value);

        default void calcular() {

        }
    }
