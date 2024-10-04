/**
 * @author lucas
 */

 import java.util.Scanner;

public class Tarefa_Controledefluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextInt();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextInt();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextInt();

        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média do aluno: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media == 5 || media == 6) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanner.close();
    }
}
