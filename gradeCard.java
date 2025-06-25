import java.util.Scanner;
public class gradeCard {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter student name: ");
      String name = sc.nextLine();

      String[] subjects = {"Bengali", "English", "Science", "Math", "Computer"};
      int[] marks = new int[5];
      int total =0;

      for(int i=0; i<5; i++) {
         System.out.println("Enter marks for "+subjects[i]+" (out of 100: )");
         marks[i] = sc.nextInt();

         while (marks[i] <0 || marks[i] > 100) {
            System.out.println("Invalid input. Enter marks between 0 and 100: ");
            marks[i] = sc.nextInt();
         }
         total += marks[i];
      }

      double average = total / 5.0;
      char grade;

      if (average >=90) grade = 'A';
      else if (average >=80) grade = 'B';
      else if (average >=70) grade = 'C';
      else if (average >=60) grade = 'E';
      else if (average >=50) grade = 'F';
      else if (average >=40) grade = 'G';
      else grade = 'H';

      System.out.println("\n-------Grade Card--------");
      System.out.println("Student Name: "+name);
      for(int i=0;i<5;i++){
         System.out.println(subjects[i]+ " : "+ marks[i]);

      }
      System.out.println("Total marks: " +total+"/500");
      System.out.printf("Average: %.2f\n", average);
      System.out.println("Grade: "+ grade);
      sc.close();
   }
}
