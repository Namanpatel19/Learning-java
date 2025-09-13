//print n number is even or not with help of function

import java.util.*;

public class homework10 {
    

    public static void even(int n)
    {
        if(n%2==0){
            System.out.println("given number is even");
        }
        else{
            System.out.println("given number is not even");
        }
        
    }


    public static void main(String[]args){
      

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         
        even(n);
       }

}
