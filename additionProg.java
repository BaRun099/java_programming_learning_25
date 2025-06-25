import java.util.Scanner;

public class additionProg {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the 1st Number for Sum: ");
      int num1 = sc.nextInt();

      System.out.println("Enter the 2nd Number for Sum: ");
      int num2 = sc.nextInt();

      System.out.println("The Sum of "+num1+" and "+num2+" is: " + (num1+num2));
      sc.close();
   }
}
