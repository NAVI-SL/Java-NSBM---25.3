import java.util.Scanner;

public class question09 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int num;

        while (true) {
            System.out.print("Enter a number 0 to stop: ");
            num = input.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 != 0) {
                sum = sum + num;
            }
        }

        System.out.println("Sum of odd numbers = " + sum);
    } 
}
