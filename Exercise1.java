//print average of three number with function
import java.util.*;
public class Exercise1 {

    public static double sumithree(double a, double b, double c){

        double sum=(a+b+c)/3;

         return sum;
    }
    

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        System.out.println(sumithree(a, b, c));
    }

}
