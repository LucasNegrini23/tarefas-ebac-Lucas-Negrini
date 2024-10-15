package br.com.lnegrini.generics;

public class GenericEntryTest {
    public static void main(String[] args) {
        GenericEntry<String> entry = new GenericEntry<>("Teste");
        System.out.println(entry.getDate());
    }
}
