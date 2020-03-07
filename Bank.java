import java.util.ArrayList;
public class Bank {
    public Bank(){
        accounts = new ArrayList<BankAccount>();
    }
    public void addAccount(BankAccount a){
        accounts.add(a);     
    }
    public double getTotalBalnce(){
        double total = 0;
        for(BankAccount a : accounts){
            total = total + a.getBalance();
                    }
        return total;
    }
    public int count(double atleast){
        int matches = 0;
        for(BankAccount a : accounts){
            if(a.getBalance() >= atleast) matches ++;
        }
        return matches;
    }
    public BankAccount find (int accountNumber){
        for(BankAccount a: accounts){
            if(a.getBalance() == accountNumber){
            return a;
            }
    
        }
        return null;
        
    }

    public BankAccount getMaximum(){
        if(accounts.size() == 0){
            return null;
        }
        
        else{
        BankAccount largestyet = accounts.get(0);
        
        for(int i = 1; i < accounts.size(); i++){
            BankAccount a = accounts.get(i);
            
            if (a.getBalance() > largestyet.getBalance()){
                largestyet = a;
            }
        }
        return largestyet;
            }
    }
        
    
    private ArrayList<BankAccount> accounts;
}
