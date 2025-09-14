// revese string with help of stack

import java.util.*;

public class reversestring {


    public static void main(String[]args){

         Stack <Character> stack = new Stack<>();

         Scanner sc = new Scanner(System.in);

         String name = sc.nextLine();

         for(int i=0; i<name.length(); i++){

            stack.push(name.charAt(i));
         }

         while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");


         }



    }
    
}
