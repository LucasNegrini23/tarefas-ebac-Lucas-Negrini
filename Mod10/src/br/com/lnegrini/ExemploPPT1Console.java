package br.com.lnegrini;

import java.util.Scanner;

public class ExemploPPT1Console {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int result = s.nextInt();

        if (result == 1) {
            System.out.println("Resultando igual a 1");
        } else if (result >= 1) {
            System.out.println("Resultando maior que 1");
        }
        else {
            System.out.println("Resultando menor que 1");
        }
    }
}
