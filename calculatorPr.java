import java.util.Scanner;

public class calculatorPr {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double num1, num2, result;
      char operator;

      System.out.println("Enter the first number: ");
      num1 = sc.nextDouble();

      System.out.println("Enter an Operator (+ , -, *, /): ");
      operator = sc.next().charAt(0);

      System.out.println("Enter second number: ");
      num2 = sc.nextDouble();

      switch (operator) {
         case '+':
            result = num1 + num2;
            System.out.println("Result: "+result);
            break;
         case '-':
            result = num1 - num2;
            System.out.println("Result: "+result);
            break;
         case '*':
            result = num1 * num2;
            System.out.println("Result: "+result);
            break;
         case '/':
            if (num2 !=0) {
               result = num1/num2;
               System.out.println("Result: "+result);               
            } else {
               System.out.println("Error: cannot divide by zero.");
            }
            break;
         default:
            System.out.println("Error: Invalid operator!");;
      }
      sc.close();
   }
}
