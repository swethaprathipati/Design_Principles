  
import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double n,n1,a;
      char st;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      n = reader.nextDouble();
      n1 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      st = reader.next().charAt(0);
      switch(st) {
         case '+': a = n + n1;
            break;
         case '-': a = n - n1;
            break;
         case '*': a = n * n1;
            break;
         case '/': a = n / n1;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(n + " " + st + " " + n1 + " = " + a);
   }
}
