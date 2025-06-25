import java.util.Scanner;
public class userInputstr {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");

      String input = sc.nextLine();

      System.out.println("Your Name is: "+input);
      sc.close();
   }
}
