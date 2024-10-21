import java.util.Scanner;
public class Main {

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     double n1;
     double n2;

     n1 = sc.nextDouble();
     sc.nextLine();
     n2 = sc.nextDouble();
     sc.nextLine();

      System.out.printf("%.0f%n", n1+n2);


     sc.close();

     }
}