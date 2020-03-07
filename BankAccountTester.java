

// By Mohamed Eladl
// Assignment 1 
// Main-Class


public class BankAccountTester {
    public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Welcome Back ! \n\nPlease Enter your 4 Digit Code: ");
        int digitCode = in.nextInt();
        if(digitCode == 1234){
        BankAccount Account1 = new BankAccount(0);
        System.out.println("\nYour Balance is $" + Account1.getBalance());
        System.out.print("\nEnter Positive Number for Deposits and Negative Numbers for Withdrawal, Enter Zero to Quit ");
        System.out.print("\n");
        double input = in.nextDouble();
        if (input > 0) Account1.deposit(input);
        else if (input < 0) Account1.withdraw(input);
        else System.out.println("Your Balance is $" + Account1.getBalance());
    }
    
}
}