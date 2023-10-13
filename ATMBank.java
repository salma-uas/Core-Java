public  class ATMBank{

    //static varibale for tracking 

    public static int totalMoney=0;
    public static int numOfATMs=0;

    //instance variable
    public int money;

    //constructor method for initializing object

    public ATMBank(int newMoney){
        this.money=newMoney;
        totalMoney+=newMoney;
        numOfATMs++;

    }

    //money Withdraw function
    public void moneyWithdraw(int WithdrawAmount){
        if((this.money-WithdrawAmount)>=500){

            this.money-=WithdrawAmount;
            totalMoney-=WithdrawAmount;

        } 
        else{
            System.out.println("Insufficient balance in your account");
        }
        
    }

    //deposit function

    public void deposit(int depositAmount){
        this.money+=depositAmount;
        totalMoney+=depositAmount;
    }

    public static void main(String [] args){

        ATMBank ATM1=new ATMBank(1000);
        ATMBank ATM2=new ATMBank(2000);

        System.out.println("Total amount of money in ATM1 "+ATM1.money);
        System.out.println("Total amount of money in ATM2 "+ATM2.money);

        System.out.println("Total amount of money in all ATM "+ATMBank.totalMoney);
        System.out.println("Total num of ATM "+ATMBank.numOfATMs);

        ATM1.moneyWithdraw(600);
        ATM2.moneyWithdraw(800);

        System.out.println("Total amount of money in ATM1 "+ATM1.money);
        System.out.println("Total amount of money in ATM2 "+ATM2.money);

        System.out.println("Total amount of money in all ATM "+ATMBank.totalMoney);
        System.out.println("Total num of ATM "+ATMBank.numOfATMs);

        ATM1.deposit(500);
        ATM2.deposit(200);

        //Accesing Static variable 

        System.out.println("Total amount of money in ATM1 "+ATM1.money);
        System.out.println("Total amount of money in ATM2 "+ATM2.money);

        System.out.println("Total amount of money in all ATM "+ATMBank.totalMoney);
        System.out.println("Total num of ATM "+ATMBank.numOfATMs);








    }
}