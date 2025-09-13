// print string with array

import java.util.*;
class homeworkarray1{


    public static void main(String []name){

        System.out.println("enter number of names you want to enter ");


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String word[]=new String[n];


          System.out.println("enter "+n+" names"); 
        for(int i =0; i<n; i++)
        {
            word[i]=sc.next();
        }

        System.out.println("these are the names you enter");

         for(int i =0; i<n; i++)
         {
            System.out.println(word[i]);
         }
    }
}