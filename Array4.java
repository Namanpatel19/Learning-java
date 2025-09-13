// take array input from user and then ask for a number then print index of input number which is stored in array
import java.util.*;
public class Array4 {
    

    public static void main(String[]lm){
        System.out.println("number of element you want to store");

       Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int size[]= new int[num];

      

        System.out.println("enter "+num + " values");
        
        for (int i =0; i<num; i++)
        
        {
            size[i]= sc.nextInt();
        }

        System.out.println("enter value you want to find index");
       
        int x = sc.nextInt();

      // for ( int i=0; i<num; i++)
        for (int i =0; i<size.length; i++)
        {
           if (size[i]==x){
            System.out.println(x+" is store at index "+i);
           } 
           else{
            System.out.println("number not found");
           }
        }
    }


}
