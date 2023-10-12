public class Nested_loop {
    
    public void count(){

        for(int outer=0;outer<3;outer++){
            System.out.println("the outer index is "+ outer);

            for(int inner=0;inner<4;inner++){
                System.out.println("Ther inner index is " + inner);
            }
            
        }

    }

    public static void main(String [] args){
        Nested_loop nl=new Nested_loop();
        nl.count();

        //2D array
        int [] [] twointArray = {{1,2,3},
                                 {4,5,6}};

        int retrieve=twointArray [1][1];
        System.out.println(retrieve);

        //initializer list
        String  [][] intro ={{"hi","I","am"},{"Omme","Salma","and"},{"what","about","you?"}};
        System.out.println(intro[1][1]);

        String [] [] intro1;
        intro1=new String [] [] {{"hi","I","am"},{"Delwar","Hossin","and"},{"what","about","you?"}};
        intro1[1][0]="Salma and Delwar";  //modifying array
        
        System.out.println(intro1[1][0]);

        
        


    }
}
