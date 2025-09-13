//print circumference with help of function

import java.util.*; 


public class Exercise4 {

    public static void circum(int r){

         double rad;
         rad=2*Math.PI*r;

        System.out.println(rad);
    }
    public static void main(String[]args){

        System.out.println("enter radius");

        Scanner radius = new Scanner(System.in);
        int r = radius.nextInt();

        circum(r);

    }


}
