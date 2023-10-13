public class accountChecking {
    private String name;
    private double balance;
    private double interestRate;


    public accountChecking(String userName,double newBalance){
        this.name=userName;
        this.balance=newBalance;
        this.interestRate=0.7/100;
    }

    public void getAccountInfo(){
        System.out.println("The name of user is " +this.name );
        System.out.println("User current Account Balance is " +this.setAccountBalance());
        System.out.println(" Next year interest is "+this.setInterest());

    }
    private double setAccountBalance(){
        return this.balance;
    }

    private double setInterest(){
        return this.balance*this.interestRate;
    }


}
