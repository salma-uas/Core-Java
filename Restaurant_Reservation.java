public class Restaurant_Reservation{

    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirm;
    double cost;
    String message;

    public Restaurant_Reservation(int count,int capacity, boolean open){
        if(count<1 || count>50){
            System.out.println("Invalid request (Out of seat capacity)" +count);
        }

        guestCount=count;
        restaurantCapacity=capacity;
        isRestaurantOpen=open;
    }

    public void reservation(){
        if(restaurantCapacity>=guestCount&&isRestaurantOpen){
            System.out.println("Welcome you can book to our restaurant");
            isConfirm=true;
            System.out.println("Total cost will be " + infoUser());
        }
        else{
            System.out.println("Unable to booking your order!");
            isConfirm=false;
            System.out.println("please try at a latter Date. Issues!" +issues());

        }
    }

    public double infoUser(){
        
        if(isConfirm){
            if(guestCount<=20){
                cost=250.00*guestCount;
                //return cost;
                }
                else {
                 cost=210.00*guestCount;
                  
                }
                
            }
            return cost;          
}

public String issues(){

    if(guestCount>=restaurantCapacity){
        message= "Seat Capacity Issues";
        }
        
        else if(!isRestaurantOpen) {
         message="restaurant closed due to holiday";
        }
        else{
            message="System maintainance issues";
        }
    
    return message;
    
}




    public static void main (String [] args){

        Restaurant_Reservation EngagementCeremony=new Restaurant_Reservation(15, 30, true);
        Restaurant_Reservation EngagementCeremony2=new Restaurant_Reservation(35, 50, true);
        Restaurant_Reservation EngagementCeremony3=new Restaurant_Reservation(15, 30, false);
        Restaurant_Reservation EngagementCeremony4=new Restaurant_Reservation(55, 30, true);

        EngagementCeremony.reservation();
        EngagementCeremony2.reservation();
        EngagementCeremony3.reservation();
        EngagementCeremony4.reservation();

    }
}