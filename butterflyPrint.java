import java.util.Scanner;

public class butterflyPrint {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter number of Rows:");
      int rows = sc.nextInt();

      //Upper Half
      for (int i = 1; i <= rows; i++) {
         //Left stars
         for (int j = 1; j <= i; j++) {
               System.out.print("*");            
         }
         //Space between Wings
         for (int j = 1; j <= 2*(rows-i); j++) {
            System.out.print(" ");
         }
         //Right Wings
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      //Lower Half
      for (int i = rows; i >= 1; i--) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         //Spaces between wings
         for (int j = 1; j <= 2*(rows - i); j++) {
            System.out.print(" ");
         }
         //Right stars
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         } 
         System.out.println();
      }
      sc.close();
   }
}
