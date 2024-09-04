/**
 * @author lucas.negrini
 */

public class TarefaCalculoMedia {

    public static void main(String[] args) {
        System.out.println("Tarefa Calculo Media");
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 9;
        int nota4 = 6;

        int mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Nota História: " + nota1);
        System.out.println("Nota Ciências: " + nota2);
        System.out.println("Nota Português: " + nota3);
        System.out.println("Nota Matemática: " + nota4);
        System.out.println("Media Final: " + mediaFinal);

        boolean isMaior = nota1 > 6;
        System.out.println("Aprovado: " + isMaior);
    }

}
