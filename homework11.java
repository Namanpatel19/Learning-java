


import java.util.*;

public class homework11 {
    

    public static void table(int n)
    
    {
        int multi=1;
        
        for (int i=1; i<=10; i++){
             
            multi=i*n;
            
        
        System.out.println( n + " x "+ i+" "+ "= " + multi);
        }
    }


    public static void main(String[]args){
      

         System.out.print("enter number whom table you want to print  ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        table(n);

    }
}
