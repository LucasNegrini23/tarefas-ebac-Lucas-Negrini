import java.util.Scanner;

/**
 * @author lucas
 */

 public class ForTabuada {
 
   public static void main(String[] args) {    
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite um numero para gerar a tabuada: ");
           int num = s.nextInt();
           for (int i = 0; i <=10;i++) {
               System.out.println(num + " X " + i + " = " + num*i);
           }

    }
 }