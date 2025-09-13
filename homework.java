//simple calculator with conditional statement

import java.util.*;

public class homework {

    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    for(int i=0; i<3; i++)
    {
    System.out.println("for add 1 , multiplication 2, divide 3 substraction 4");
    int cal = sc.nextInt();
    if(cal != 1 && cal !=2 && cal != 3 && cal != 4) {
    System.out.println("invalid");
    return;
    }
    
    System.out.println("enter two numbers");
    int a = sc.nextInt();
    int b =sc.nextInt();
    


if (cal==1)
{
    System.out.println(a+b);
}
else if(cal==2)
{
    System.out.println(a*b);
}
else if(cal==3)
{
    System.out.println(a/b);
}
else if(cal==4){
    System.out.println(a-b);
}


else{
    System.out.println("invalid");
}  
}
    }
}


