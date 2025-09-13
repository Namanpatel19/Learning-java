//print which number is greater from 2 number with help of fucntion

import java.util.*;

public class Exercise3 {
    

    public static void greater(int a, int b){

        if(a>b){
            System.out.println(a+" is greater");
        }

            else if (b>a){
                System.out.println(b+"  is greater ");
            
                   }
                
            else{
            System.out.println("both are equal");
            }
           
        
    }
     

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name");
        int a = sc.nextInt();

        System.out.println("enter second number");
        int b = sc.nextInt();

        greater(a, b);

    }

}
