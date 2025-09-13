// print score rating with conditional statement

import java.util.*;
public class homework2 {
     

 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 
if(n==0){
return;
}


else if(n==1)
{
    int k = sc.nextInt();
    

    if(k <=100 && k >=90){
    System.out.println("good");}

    else if(k <=89 && k >=60){
    System.out.println("this is also good");}

    else if(k <=59 && k >=0){
    System.out.println("this is good as well");}
    }
    
 else{
    System.out.println("invalid number");
}

}
}



