//print which number is greater with help of conditional statement

import java.util.*;

public class conditional3 {
    
}
   
     public static void main(String agr[]){
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if( a == b ){
        System.out.println("equal");
    
    }
    else {
        if ( a > b ) {
            System.out.println("a is greater");
        }
    else{
       
            System.out.println(("b is greater"));
        }
    
    }
}