package br.com.lnegrini;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade ");
        int idade = s.nextInt();        //s.nextInt(); esse codigo usado para esperar a resposta no console.
        System.out.println("Você tem " + idade + " anos.");
    }
}
