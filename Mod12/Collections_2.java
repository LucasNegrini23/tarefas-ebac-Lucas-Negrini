/*
 * @author lucas.negrini 
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Familiares {
    String nome;
    char sexo;

    Familiares(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome + " - " + sexo;
    }
}

public class Collections_2 {

    public static void main(String args[]) {
        TarefaListaSeparadaPorSexo();
    }

    private static void TarefaListaSeparadaPorSexo() {
        System.out.println("****** TarefaListaSeparadaPorSexo ******");
        Scanner scanner = new Scanner(System.in);
        List<Familiares> listaFamiliares = new ArrayList<>();

       
        System.out.print("Quantos familiares deseja adicionar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome e sexo (M/F) do familiar (separados por vírgula, ex: Lucas Negrini,M): ");
            String entrada = scanner.nextLine();
            String[] partes = entrada.split(","); 
            String nome = partes[0].trim(); 
            char sexo = partes[1].trim().charAt(0);
            listaFamiliares.add(new Familiares(nome, sexo));
        }

        
        Collections.sort(listaFamiliares, (f1, f2) -> f1.nome.compareTo(f2.nome));

        
        System.out.println("\nLista completa de familiares:");
        System.out.println(listaFamiliares);
        System.out.println();

        
        System.out.println("Familiares do sexo Masculino:");
        for (Familiares f : listaFamiliares) {
            if (f.sexo == 'M') {
                System.out.println(f);
            }
        }

        System.out.println(); // Quebra de linha

        
        System.out.println("Familiares do sexo Feminino:");
        for (Familiares f : listaFamiliares) {
            if (f.sexo == 'F') {
                System.out.println(f);
            }
        }
        
        scanner.close();
    }
}
