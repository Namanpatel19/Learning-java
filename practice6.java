//print half triangle of number with loop
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5


import java.util.*;

public class practice6{


    public static void main(String[]args){

    int n=5;
   

    for(int i=0; i<=n; i++){

    
        for(int j=1;j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }

}
