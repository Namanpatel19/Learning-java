//print x^y where x and y we take user input

import java.util.*;

class Exercise8{


public static void power(int n, int y){


 double sum=Math.pow(n, y);


System.out.println(sum);

}
 

public static void main(String[]args){


Scanner h = new Scanner(System.in);
System.out.println("enter the value of x in x^y");
int n = h.nextInt();

System.out.println("enter the value of y in x^y");
int y = h.nextInt();


power(n , y);
}


}
