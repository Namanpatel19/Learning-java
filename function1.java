//print name with help of function


import java.util.*;

public class function1 {


    public static void PrintMyName(String name){
        System.out.println("your name is "+name);
        return;
    }
    public static void main(String[]args)
    {
    Scanner sc= new Scanner(System.in);
    String name=sc.next();
    
    PrintMyName(name);
        
    
    }
    
}
