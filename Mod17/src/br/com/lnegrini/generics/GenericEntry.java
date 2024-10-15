package br.com.lnegrini.generics;

//Classe Generica com atributos Genericos;

public class GenericEntry<G> {

    private G date;

    public GenericEntry(G date) {
        this.date = date;
    }

    public G getDate() {
        return date;
    }
}
