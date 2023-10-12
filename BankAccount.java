public  class BankAccount{

    double balance;
    double tax;

    public BankAccount(double accBalance,double currentTax){
        balance=accBalance;
        tax=currentTax;
    }

    public double deposit(double monthlyDeposit){
        double updatedBalance=balance+monthlyDeposit;
        balance=updatedBalance;
        return balance;

    }
    public double withDraw(double moneyWithdraw){
        double afterWithdraw=balance-moneyWithdraw;
        balance=afterWithdraw;
        return balance;
    }

    public void checkBalance(){
        System.out.println(balance*0.08);
        System.out.println(balance);
    }

    public static void main(String []args){
        
        BankAccount acc=new BankAccount(100000, 0.07);
        System.out.println("Good day ! welcome to online banking service");
        double depAmmount=acc.deposit(1000);
        System.out.println("Your current  balance is  "+depAmmount);
        double withAmmount=acc.withDraw(10000);
        System.out.println("Your current  balance is  "+withAmmount);
        System.out.println("Now run account checking");
        
        acc.checkBalance();
        System.out.println(acc);
        
    }
    public String toString(){
        return "Account Details : amount is "+balance + " and " +tax+" Euro";
    }
}