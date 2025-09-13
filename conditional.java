
//print adult or non adult using if else conditional statement

import java.util.*;

public class conditional {

    public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if(age > 18)
     {
        System.out.println("adult"); 
    }
    else{
        System.out.println("Non adult");
    }
}  

}
