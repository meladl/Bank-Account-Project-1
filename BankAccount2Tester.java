import java.util.ArrayList;
public class BankAccount2Tester {
    public static void main(String[] args) {
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>( );
    accounts.add(new BankAccount(1205));
    accounts.add(new BankAccount(1206));
    accounts.add(new BankAccount(1207));
    accounts.add(1, new BankAccount(1208));
    accounts.remove(0);
    System.out.println("Size = " + accounts.size());
    BankAccount first = accounts.get(0);
    System.out.println("First Account Number is " + first.getAccountNumber());
    BankAccount last = accounts.get(accounts.size() - 1);
    System.out.println("Last Account Number is " + last.getAccountNumber());
    }
    
}
