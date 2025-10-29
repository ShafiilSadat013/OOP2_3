public class BankMain {

    public static void main(String[] args) {
        
        BankAccount x = new BankAccount(1001, "Sadat " , 1000);
        BankAccount y = new BankAccount(1002, "Gecko ", 600);
        BankAccount z = new BankAccount(1003, "Dager1 ", 700);

        x.deposit(10000);
        x.withdraw(500);
        y.deposit(300);
        y.withdraw(200);
        z.deposit(25000);
        z.withdraw(3700);
        
        System.out.println("Account 1: " + x.getAccountHolder() + "Account Number: " + x.getAccountNumber() + "Balance: " + x.getBalance());
        System.out.println("Account 2: " + y.getAccountHolder() + "Account Number: " + y.getAccountNumber() + "Balance: " + y.getBalance());
        System.out.println("Account 3: " + z.getAccountHolder() + "Account Number: " + z.getAccountNumber() + "Balance: " + z.getBalance());
        
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Total Balance: " + BankAccount.getTotalBankBalance());
    }
}

//Banaccount (remove public if u want to run in one file)
public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    static int totalAccounts;
    static double totalBankBalance;


    public BankAccount(int accountNumber, String accountHolder , double initialBalance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        if(initialBalance<500){
            System.out.println(" initial balance at least 500. Setting Balance to 500  ");
            this.balance = 500;
        }
        else{
            this.balance= initialBalance;
        }

        totalAccounts++;
        totalBankBalance += this.balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println(" Deposit have to be positive  ");
            return;
        }
        balance += amount;
        totalBankBalance += amount;
        System.out.println("Deposited : " + amount + " New balance : " + balance);
    }

    public void withdraw(double amount){
        if (amount<=0){
            System.out.println("Withdraw have to be positive");
            return;
        }
        if (balance - amount <500){
            System.out.println("Minimum balance have to be 500");
            return ;
        }
        balance -= amount;
        totalBankBalance -= amount;
        System.out.println("Withdrawn :" + amount + " New Balance :" + balance);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public static double getTotalBankBalance() {
        return totalBankBalance;

    }    
    
}
