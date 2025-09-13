//print factorial with help of function

import java.util.*;

public class function4 {
    
    public static int factorial(int a)
    {
        if (a<0){
            System.out.println("invalid number");
            return -1 ;
        }
       

        int sum=1;
        for(int i=1; i<=a; i++){
            sum=sum*i;
            
        }

        return sum;
    }

public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

  System.out.println(factorial(a));

}

}

//same code with different logic
//import java.util.*;
//
//public class function4 {
//    
//    public static int factorial(int a)
//    {
//        int sum=1;
//        for(int i=a; i>=a; i--){
//            sum=sum*i;
//            
//        }
//
//        return sum;
//    }
//
//public static void main(String[]args)
//{
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//
//  System.out.println(factorial(a));
//
//}
//
//}