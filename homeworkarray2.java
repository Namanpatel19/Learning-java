import java.util.*;
public class homeworkarray2 {
    

    public static void main(String[]asds){


    System.out.println("enter number of values you want to enter");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();

     int number[]= new int[n];

     System.out.println("enter values");

     for(int i=0; i<n;i++){
        number[i]=sc.nextInt();

     }

     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;


      for(int i=0; i<n;i++){
        if(number[i]<min){
           min = number[i];
          
        }
        if(number[i]>max){
          max = number[i];
          
        }
        

    }
    System.out.println("minimum number is "+min +" maximun number is "+max);
}
}