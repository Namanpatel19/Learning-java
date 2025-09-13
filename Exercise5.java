import java.util.*;

public class Exercise5 {
    

    public static void age(int n){

        if (n<1){
        System.out.println("invalid age");
        }

        else if(n<18)
        {
            System.out.println( "you are not eligible to vote");
        }

        else if (n<1){
        System.out.println("invalid age");
        }

        else{ 
            System.out.println("you are eligible to vote");
        }
    }

    public static void main(String[] args){

     Scanner g = new Scanner(System.in);
     int n = g.nextInt();

     age(n);

    }
}
