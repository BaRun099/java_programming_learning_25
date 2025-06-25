import java.util.Scanner;

public class divisionpr {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter  numerator for Division: ");
      double numerator = sc.nextDouble();

      System.out.println("Enter the next number for Division: ");
      double denominator = sc.nextDouble();

      if (denominator ==0) {
         System.out.println("Error!: Division by zero is not allowed");
      }
      else{
         double result = numerator/denominator;
         System.out.println("The Result of "+numerator+ " and "+ denominator+" is: "+result);
      }
      sc.close();
   }
}
