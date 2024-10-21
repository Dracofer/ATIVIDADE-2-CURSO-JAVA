import java.util.Locale;
import java.util.Scanner;
public class Main {

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     double raio;

     raio = sc.nextDouble();
     raio = Math.pow(raio, 2);
     

     System.out.printf("A=%.4f%n", 3.14159 * raio);
     Locale.setDefault(Locale.US);


     sc.close();

     }
}
