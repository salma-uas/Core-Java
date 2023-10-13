import java.util.ArrayList;

public class ArrayList_ToDo{

    public static void main(String[] args){
        ArrayList <String> BiriyaniRecipe=new ArrayList <String>();
        ArrayList <String> payesRecipe=new ArrayList <String>();

        BiriyaniRecipe.add("Prepare Chicken");
        BiriyaniRecipe.add("Add Masalas, oil, and marinate it for 15 mins");
        BiriyaniRecipe.add("Cook it for 25 minutes and add Yaougard");
        BiriyaniRecipe.add("prepare the rice and boil it until 3/4 boiled ");
        BiriyaniRecipe.add("Add the boiled rice on Chicken");
        BiriyaniRecipe.add("Leave it for 30-35 minutes in a low heat and cover the pot");

        //payes Recipe
        payesRecipe.add("Boil and stir the milk ,1 litter into 1/2 litter");
        payesRecipe.add("Add sugar,caseonut,Ghee");
        payesRecipe.add("Add the rice powder and cook it for 35 minutes");


        System.out.println(" The number of step is " +BiriyaniRecipe.size() +"\n");
        System.out.println(BiriyaniRecipe+ "\n");
        
        System.out.println(" The number of step is " + payesRecipe.size()+ "\n");
        System.out.println(payesRecipe +"\n");

        

    }
}