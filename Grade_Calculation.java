public class Grade_Calculation {

    public char grade(int marks){
        
        char Grade;
        
        if(marks>=90){
            Grade='A';
        }
        else if(marks>=80){
            Grade='B';

        }
        else if(marks>=70){
            Grade='C';
        }

        else if(marks>=60){
            Grade='D';

        }
        else{
            Grade='F';
        }

         return Grade;
        }


    public static void main(String []args){

        Grade_Calculation g=new Grade_Calculation();
        
        char result;
        result=g.grade(33);
        System.out.println("Your grade is " +result);



       
        








    }
}
