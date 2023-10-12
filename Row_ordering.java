public class Row_ordering {
    public void row(){

        int [][] matrix={{1,77,55},{88,22,33},{101,102,58}};
        for (int outer=0;outer<matrix.length;outer++){
            for(int inner=0;inner<matrix.length; inner++){

                //System.out.println(matrix[outer][inner]); //row major ordering outer=Row,Inner=Column
                //System.out.println(matrix[inner][outer]); //column major ordering

            }
        }

        //Enhance for loop
        for(int [] x:matrix){
            for (int z:x){
                System.out.println(x[2]);

            }
        }
    }

    public static void main(String [] args){
        Row_ordering ro=new Row_ordering();
        ro.row();
    }
    
}
