import java.util.*;

// public class function {
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return;
//     }

//     public static void main(String args[]) {
//         System.out.print("enter name:- ");
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         printMyName(name); //call kiya function ko
//     }
// }

// q2 add two numbers
// public class function{
//     public static int printSum(int a, int b){
//    int  sum = a+b;
//     return sum;
//     }
//     public static void main(String args[]){
//         System.out.print("enter values of a and b:- ");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
// int sum = printSum(a,b);
// System.out.println(sum);
//     }
// }

// q3 print product of two numbers 
// public class function {
//     public static int printProduct(int a, int b) {

//         return   a * b;
//     }

//     public static void main(String args[]) {
//         System.out.println("enter a and b:- ");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("product of two number:- "+printProduct(a,b));
//     }
// }

// factorial 
public class function {

    public static void printFctorial(int n) {
        // loop
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String args[]) {
        System.out.println("enter number:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
printFctorial(n);
    }
}
