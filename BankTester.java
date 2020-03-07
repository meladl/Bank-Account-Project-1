
public class BankTester {
    public static void main(String[] args) {
   Bank fBOJ = new Bank();
   fBOJ.addAccount(new BankAccount(1001,2000));
   fBOJ.addAccount(new BankAccount(1015,10000));
   fBOJ.addAccount(new BankAccount(1729,15000));
  double threshold = 15000;
  int c = fBOJ.count(threshold);
  System.out.println(c + " accounts with balance  greater than or equal to " + threshold);
  int accountNumber = 1015;
  BankAccount a = fBOJ.find(accountNumber);
  if(a == null)
      System.out.println("No Account with number " + accountNumber);
  else 
      System.out.println("Account with number " + accountNumber + " has balance " + a.getBalance());
  BankAccount max = fBOJ.getMaximum();
  System.out.println("Account with number " + max.getAccountNumber() + " has the largest balance " );
    }
    
    
}
