import java.util.Scanner;

public class subtractionPr {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the 1st Number for Subtraction: ");
      int num1 = sc.nextInt();

      System.out.println("Enter the 2nd Number for Subtraction: ");
      int num2 = sc.nextInt();

      System.out.println("The Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
      sc.close();
   }
}
