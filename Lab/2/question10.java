import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 5000;
        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid input");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount");
                        continue;
                    }

                    balance = balance + deposit;
                    System.out.println("Deposit successful");
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = input.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount");
                        continue;
                    }

                    if (balance < withdraw) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance = Rs. " + balance);
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;
            }

        } while (choice != 4);
    }
}
