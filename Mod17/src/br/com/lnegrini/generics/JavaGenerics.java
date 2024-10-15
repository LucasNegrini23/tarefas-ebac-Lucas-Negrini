package br.com.lnegrini.generics;

import br.com.lnegrini.generics.exemplo.Banana;
import br.com.lnegrini.generics.exemplo.Fruta;
import br.com.lnegrini.generics.exemplo.Maça;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("2");
        imprimir(list);

        System.out.println("*///*");

        List<Long> list1 = new ArrayList<Long>();
        list1.add(1L);
        list1.add(3L);
        imprimir(list1);

        System.out.println("*///*");

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Banana());
        frutas.add(new Maça());
        imprimir(frutas);


    }

    public static <G> void imprimir(List <G> list){
        for (G g : list){
            System.out.println(g);
        }
    }

    public static void imprimirFruta(List<Fruta> list){
        for (Fruta fruta : list){
            System.out.println(fruta);
        }
    }

    //Wildcard <?> voce nao define sua lista porem ele sempre usara o object como parametro;
    public static void imprimir2 (List<?> list){
        for (Object o : list){
            if (o instanceof Long){
                Long ol = (Long) o;
                System.out.println(ol);
            }
            System.out.println("Qualquer coisa..." + o);
        }
    }
}
