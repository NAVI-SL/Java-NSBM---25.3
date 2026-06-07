package Q5;

public class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    void showDetails(){
        System.out.println("Account: " +accountNumber+ " Holder: " +holderName+ " Balance " +balance);
    }

    void deposit( double amount){
        balance = balance + amount;
        System.out.println("New balance: " + balance);
    }
    
    void deposit(double amount, String currency){
        if (currency == "USD"){
            balance += (amount * 300);
            System.out.println("Deposited " + amount + currency + " = " + " LKR " + amount * 300 + ". New Balance: " + balance);
        }
    }
}
