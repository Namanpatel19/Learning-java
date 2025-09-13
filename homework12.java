//check number is prime or not with help of function

import java.util.*;

public class homework12 {


    public static void isprime(int n){
         
        int count=0;
         for (int i=1;i<=n;i++)
         {
            if(n%i==0)
            count++;

         }
        if (n<=1){
            System.out.println("number is not prime");
        }


        else if (count==2)
         {
            System.out.println("number is prime");
         }
         else
         {
            System.out.println("number is not prime");
         }
         return;
    }

    public static void main(String[]args){

        Scanner h = new Scanner(System.in);
        int n = h.nextInt();


        isprime(n);
    }
    
}
