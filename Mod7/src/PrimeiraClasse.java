/**
 * @author Lucas.Negrini
 *
 * @since 01/09/2024
 *
 * e hiperlinks : {@link github.com/LucasNegrini23/tarefas-ebac-Lucas-Negrini}
 *
 * @version 1.0
 */

public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Olá Lucas");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        String end = cliente.retornarNomeCliente();
        System.out.println(end);
        System.out.println(cliente.getValorTotal());
    }
}
