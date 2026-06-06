// // Q1
// import java.util.Scanner; 

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the First Subject Mark: ");
//         double sub1 = scanner.nextDouble();
        
//         System.out.print("Enter the Second Subject Mark: ");
//         double sub2 = scanner.nextDouble();

//         System.out.print("Enter the Third Subject Mark: ");
//         double sub3 = scanner.nextDouble();

//         double total = (sub1 + sub2 + sub3);
//         double average = (total / 3);
//         double percentage = (total / 300) * 100;

//         String grade;
//         if (percentage >= 75) {
//             grade = "Distinction";
//         } else if (percentage >= 60) {
//             grade = "Credit";
//         } else if (percentage >= 50) {
//             grade = "Pass";
//         } else {
//             grade = "Fail";
//         }

//         System.out.println("Total: " + total);
//         System.out.println("Average: " + average);
//         System.out.println("Percentage" + percentage);
//         System.out.println("Grade: " + grade);
     

//         scanner.close();
//     }
    
// }


// // Q2
// public class Assignment1 {
//     public static void main(String[] args) {
//     int x = 5;
//     int y = ++x + x++ + --x + x--;
    
//     System.out.println("x = " + x + ", y = " + y);

//     }
// }


// // Q3
// public class Assignment1 {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;

//         System.out.println(a > 2 && b > 12);

//         System.out.println(a > 2 || b > 12);

//         System.out.println(!(a > 2 && b > 12));
//     }
    
// }


// // Q4
// public class Assignment1 {
//     public static void main(String[] args) {
//         int num = 5;

//         if (num > 0) {
//             System.out.println("Number is Positive");
//         }
//     }
// }


// // Q5
// public class Assignment1 {
//     public static void main(String[] args) {
//         int a = 5;

//         if (a % 2 == 0) {
//             System.out.println("Number is Even: ");
//         } else {
//             System.out.println("Number is Odd: ");
//         }
//     }
// }


// // Q6
// import java.util.Scanner; 

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the BMI value: ");
//         double BMI = scanner.nextDouble();

//         String bmi_value;
//         if (BMI < 18.5) {
//             bmi_value = "Underweight";
//         } else if (BMI <= 24.9) {
//             bmi_value = "Normal";
//         } else if (BMI <= 29.9) {
//             bmi_value = "Overweight";
//         } else {
//            bmi_value = "Obese"; 
//         }
    
//         System.out.println("A Person's BMI value: " + bmi_value);

//         scanner.close();
//     }
// }


// // Q7
// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the First Number: ");
//         double num1 = scanner.nextDouble();

//         System.out.print("Enter the Second Number: ");
//         double num2 = scanner.nextDouble();

//         System.out.print("Enter the Operator (+ , - , * , / , %): ");
//         char op = scanner.next().charAt(0);

//         double result;
//         switch (op) {
//             case '+':
//                 result = num1 + num2;
//                 System.out.println("Result: " + result);
//                 break;

//             case '-':
//                 result = num1 - num2;
//                 System.out.println("Result: " + result);
//                 break;

//             case '*':
//                 result = num1 * num2;
//                 System.out.println("Result: " + result);
//                 break;
            
//             case '/':
//                 result = num1 / num2;
//                 System.out.println("Result: " + result);
//                 break;
                
//             case '%':
//                 result = num1 % num2;
//                 System.out.println("Result: " + result);
//                 break;

//             default:
//                 break;
//         }
//         scanner.close();
//     }
// }


// // Q8
// public class Assignment1 {
//     public static void main(String[] args) {

//         for(int i = 1; i <= 12; i++) {
//             System.out.println(i);
//         }
//     }
// }


// // Q9
// public class Assignment1 {
//     public static void main(String[] args) {
        
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// // Q10
// public class Assignment1 {
//     public static void main(String[] args) {
        
//         int i  = 2;
//         int sum = 0;

//         while (i <= 100) {
//             sum = sum + i;
//             i = i + 2;
//         }

//         System.out.println(sum);
//     }
// }


// // Q11
// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int num;
//         int sum = 0;

//         do {
//             System.out.print("Enter a number: ");
//             num = scanner.nextInt();

//             if (num > 0) {
//                 sum++;
//             }

//         } while (num > 0);

//         System.out.println("Positive numbers recorded: " + sum);

//         scanner.close();
//     }
// }


// // Q12
// public class Assignment1 {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 100; i++) {
//             if (i == 50) {
//                 break; 
//             }
//             System.out.print(i + " ");
//         }
//     }
// }


// // Q13
// public class Assignment1 {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 20; i++) {
//             if (i % 3 == 0) {
//                 continue; 
//             }
//             System.out.print(i + " ");
//         }
//     }
// }


// // Q14
// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();

//         if (a >= b && a >= c) {
//             System.out.println("Largest number: " + a);
//         } else if (b >= a && b >= c) {
//             System.out.println("Largest number: " + b);
//         } else {
//             System.out.println("Largest number: " + c);
//         }

//         sc.close();
//     }
// }


// Q15
import java.util.Scanner;

public class Q15_ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice;

        do {
            System.out.println("\nCurrent Balance: " + balance);
            System.out.println("1. Withdraw");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                int amount = sc.nextInt();

                if (amount <= 0) {
                    System.out.println("Invalid amount!");
                    continue; 
                }

                if (amount > balance) {
                    System.out.println("Insufficient balance!");
                    continue;
                }

                balance -= amount;
                System.out.println("Withdraw successful!");

                if (balance < 500) {
                    System.out.println("Balance below 500. Transaction stopped.");
                    break; 
                }

            } else if (choice == 2) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }

        } while (true);

        sc.close();
    }
}


















