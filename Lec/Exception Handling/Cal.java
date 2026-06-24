import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter your 1st Number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter your 2nd Number: ");
            int num2 = sc.nextInt();

            int ans = (num1/num2);
            System.out.print("Answer is: " + ans);        
        }
        
        catch(ArithmeticException  e) {
            System.out.println(e);
        }
        
    }
}