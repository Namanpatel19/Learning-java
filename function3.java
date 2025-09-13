//multiply two numbers with help of function

import java.util.*;

public class function3 {


    public static int multiply(int a, int b){

        System.out.println(a*b);

        return(a*b);

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("multiply"+ multiply(a, b));

    
    }
    
}
