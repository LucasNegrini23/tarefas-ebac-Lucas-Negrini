/**
 * @author lucas.negrini
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Familiares2 {
    String nome;
    char sexo;

    Familiares2(String nome, char sexo) {
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
        Scanner scanner = new Scanner(System.in);  // Scanner para entrada do usuário
        List<Familiares2> listaFamiliares = new ArrayList<>();

        // Pergunta quantos familiares serão adicionados
        System.out.print("Quantos familiares deseja adicionar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        // Adicionar familiares via entrada do usuário
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome e sexo (M/F) do familiar (separados por vírgula, ex: João Silva,M): ");
            String entrada = scanner.nextLine();
            String[] partes = entrada.split(",");  // Divide a entrada em nome e sexo
            String nome = partes[0].trim();  // Remove espaços em branco extras
            char sexo = partes[1].trim().charAt(0);  // Obtém o primeiro caractere da segunda parte (M/F)
            listaFamiliares.add(new Familiares2(nome, sexo));
        }

        // Ordena a lista de familiares pelo nome
        Collections.sort(listaFamiliares, (f1, f2) -> f1.nome.compareTo(f2.nome));

        // Exibe a lista completa
        System.out.println("\nLista completa de familiares:");
        System.out.println(listaFamiliares);
        System.out.println();

        // Exibe os familiares do sexo masculino
        System.out.println("Familiares do sexo Masculino:");
        for (Familiares2 f : listaFamiliares) {
            if (f.sexo == 'M') {
                System.out.println(f);
            }
        }

        System.out.println(); // Quebra de linha

        // Exibe os familiares do sexo feminino
        System.out.println("Familiares do sexo Feminino:");
        for (Familiares2 f : listaFamiliares) {
            if (f.sexo == 'F') {
                System.out.println(f);
            }
        }
        
        scanner.close();  // Fecha o scanner
    }
}
