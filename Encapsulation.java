public class Encapsulation{

    private int age;
    private String name;
    //static varibale
    public static int num_goal=12;
    
    //accessor method

    public int get_age(){
        return age;
    }

    //Mutator method

    public void get_name(String name){
        //this.name=new_name;
    
        System.out.println(this.name);   //instance variable
        System.out.println(name);       //local variable
    }

    //static method
    public static int cal_age(int byear,int nyear){
        return (nyear-byear);
    }



    public static void main(String [] args){

        Encapsulation en=new Encapsulation();
        en.get_name("local");

        int age=cal_age(1997,2023);
        System.out.println(age);
        System.out.println(Math.abs(11));  //math is a class and .abs() is a function under math class
        System.out.println(Math.pow(2,5));
        System.out.println(Math.sqrt(37));
        System.out.println(Math.min(12,3));


        System.out.println(num_goal);
        


    }

    
}