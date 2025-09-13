
//print sum of two number with help of function

import java.util.*;

public class function2 {
    

    public static int AddTwoNumber(int number1, int number2){
        int sum=number1+number2;
        return sum;
    }
        public static void main(String[]args){

            Scanner sc = new Scanner(System.in);
            int number1= sc.nextInt();

            int number2=sc.nextInt();

           int sum = AddTwoNumber(number1 , number2);
           System.out.println(sum);

        }
    }

