// print binary pattern with help of loop
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

import java.util.*;

public class practice9 {
    
    public static void main(String[]args){
        System.out.println("number of lines you want to print");
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();

        

        for(int i=1;i<=n; i++){

            for(int j=1 ;j<=i; j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                    if(sum%2==1){
                        System.out.print("0 ");
                    }

                }
System.out.println();

            }
        }
    }
