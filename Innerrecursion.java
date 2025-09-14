//print Fibonacci sequence 

import java.util.*;

class recursion{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            for (int i = 0; i<n; i++){
                System.out.println(feb(i));
            }
        }





static int  feb(int n){

    if(n==0){
        return 0;
    }else if(n==1){
        return 1;
    }
        else {
            return feb(n-1)+ feb(n-2);
        }
    }
}






