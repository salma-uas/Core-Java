public class String_class{

    public static void main(String []args){

        String s1="Hello ";
        String s2="World";

        //string add 

        String s3=s1.concat(s2);

        //string length count including space
        System.out.println(s1.length());
        System.out.println(s3);
        System.out.println(s3.length());
        System.out.println(s1.equals("Hello "));

        //string compare or matching without considering upper or lower case

        System.out.println(s1.equalsIgnoreCase("World "));


        //indexOf() function to find the position of charcter

        System.out.println(s1.indexOf("ll"));
        System.out.println(s2.indexOf("Wo"));

        //charAt() to retrive character from index

        System.out.println(s1.charAt(3));

        //convert uppercase 
        System.out.println(s1.toUpperCase());

        //convert lower case
        System.out.println(s1.toLowerCase());


    }
}