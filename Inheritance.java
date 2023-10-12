
//parent class
public class Inheritance{

     String name;
     double height;
    

    Inheritance(String new_name){
        this.name=new_name;
        //this.height=n_height;

    }

    final protected boolean player(){
        return true;
    }



    //child class Child.java

    public static void main(String []args){
        Child ch=new Child();
        System.out.println(ch.player2(2));

    }
    



}