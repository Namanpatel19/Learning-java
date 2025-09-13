//print number of positive negative and zero 


import java.util.*;

public class Exercise7 {
    

    public static void main(String[]args){

   int positive=0;
   int negative=0;
   int zero =0;
   String yes;

  
   Scanner sc = new Scanner(System.in);

   do{
    
   System.out.println("enter a number");
   int n =sc.nextInt();
   

    if(n<0){
        negative++;
    }

    else if(n==0)
    zero++;

    else if(n>0)
    positive++;


   
     System.out.println("want to exit type exit or anything for continue");

    yes = sc.next();
    
    

   }while(!yes.equals("exit"));
   



System.out.println("negative  "+negative);
System.out.println("positive  "+positive);
System.out.println("zero  "+ zero);

}
}

