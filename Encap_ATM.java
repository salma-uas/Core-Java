public class Encap_ATM{

    public static int total_money=1000000;
    public static int num_atm=12;
    public int money;
    
	//Average money in every ATM 

    public static void average_money(){
        //total_money=total_money+1;
        System.out.println("average money per atm is " +total_money/num_atm);
        
    }

    public int change_money(){
        
        total_money=total_money+1;
        return total_money;
    }

    public static void main(String [] args){
        System.out.println("Total numb of ATM is " +Encap_ATM.num_atm  + " and money is "  +Encap_ATM.total_money);
        Encap_ATM.average_money();
        
        Encap_ATM en=new Encap_ATM();
        int x=en.change_money();
        System.out.println("Instance  money is " +x);
    }
}