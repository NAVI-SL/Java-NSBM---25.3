import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number = " + b);
        } else {
            System.out.println("Largest number = " + c);
        }
    }   
}