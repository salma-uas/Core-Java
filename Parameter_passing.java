import java.util.Arrays;

public class Parameter_passing{

    String [] topics;

    public Parameter_passing(String [] initialParameter){
       topics= initialParameter;

    }


    public static void main(String[] args){
        Parameter_passing group;

        if(args[0].equals("Science")){
            String[] groupSubjectScience={"Physics","Chemistry","Biology"};
            group=new Parameter_passing(groupSubjectScience);
        }
        else if(args[0].equals("Commerce")){
            String [] groupSubjectCommerce={"Economics","Management","Finance"};
            group=new Parameter_passing(groupSubjectCommerce);
        }
        else{
            String[] groupSubjectArts={"Mantik","Geography","Scociology"};
            group = new Parameter_passing(groupSubjectArts);
        }

        System.out.println("Group Subject of " + args[0] + " are : ");
        System.out.println(Arrays.toString(group.topics));


    }

}