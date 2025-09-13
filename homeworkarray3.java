import java.util.*;
public class homeworkarray3 {
    

    public static void main(String[]assd){

        System.out.println("enter number of values you want to store ");

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        int number[]= new int[n];

        System.out.println("enter "+n+" values");

        for (int i =0;i<n; i++){
        number[i]= sc.nextInt();

        }

        boolean assending = true;

        for(int i =0; i<n-1; i++){

            if( number[i] > number[i+1] ){
                assending=false;

            }
        
        }

        if (assending){
            System.out.println("this is in assesnding order");

        }
        else 
        System.out.println("this is not in assesning  order");
    }
}
