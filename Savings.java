public class Savings {
    public Savings(){
        balance=0; 
        interset = 0;
    }
    public Savings(double intialbalance, double intersetRate){
        balance=intialbalance;
        interset = intersetRate;
    }
    public void deposit(double amount){
        if (amount < 0)
            System.out.println("Please Enter Correct Amount !");
        else{
        double newbalance = balance + amount;
                balance = newbalance;
        System.out.println("A " + "$" + amount + " is successfully deposited to your account.");
        }
    }

    public void withdraw(double amount){
        if (amount < 0)
            System.out.println("Please Enter Correct Amount !");
        else{
        double newbalance = balance - amount;
        if (newbalance < 0)
            System.out.println("Insuffient Balance for the Withdrawal of " + "$" + amount);
        else{
            balance=newbalance; 
        System.out.println("A " + "$"+ amount + " is successfully withdrawn from your account.");
        }
    }
    }
    public double getBalance(){
        return balance;         
    }
    public void addInterset(){
        double newBalance = balance * interset;
        balance = newBalance;
    }
    
    private double balance;
    private double interset;
   
}

