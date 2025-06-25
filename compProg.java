import java.util.Scanner;

public class compProg {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a nuber");
      int num1 = sc.nextInt();
      System.out.println("Enter second nuber");
      int num2 = sc.nextInt();
      if(num1 == num2) {
         System.out.println(num1 + " is Equal to " + num2);
      } else {
         if (num1 > num2) {
            System.out.println(num1+" is greater than " + num2);
         } else {
            System.out.println(num1 + " is less than " + num2);
         }
      }
      sc.close();
   }
}
