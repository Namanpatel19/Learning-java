import java.util.*;

public class Strings {
    
    public static void main(String[]args){

        Scanner word = new Scanner(System.in);

             System.out.println("enter your full name");


            String name = word.nextLine();

            System.out.println(name.length());
           
            for (int i =0; i<name.length(); i++){
                
                System.out.println(name.charAt(i));
            }

       

        

    }
}
