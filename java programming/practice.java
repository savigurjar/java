import java.util.*;

public class practice {
   // public static void main(String args[]){
   // System.out.println("enter values of a and b");
   // Scanner sc = new Scanner(System.in);
   // int a = sc.nextInt();
   // int b = sc.nextInt();
   // int sum = a+b;
   // System.out.println(sum);
   // }

   // advance pattern
   // butterfly pattern
   public static void main(String args[]) {
      System.out.println("enter number of rows");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("enter number of columns");
      int m = sc.nextInt();
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         // spaces
         int spaces = 2 * (n - i);
         for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");
         }
         // 2nd part 
         for(int j =1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
      }
      // lower half 
      for (int i = n; i >=1; i--) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         // spaces
         int spaces = 2 * (n - i);
         for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");
         }
         // 2nd part 
         for(int j =1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
      }

   }
}