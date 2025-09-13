import java.util.*;

public class switchexample
{
   
     public static void main(String agr[]){
        Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    //if(button==1){
    //System.out.println("helloworld");
     
    //}else if(button==2){
    //System.out.println("Namaste");
   // }
    //else if(button==3){
    //System.out.println("bonjour");
    //}
    //else{
    //    System.out.println("inavlid number");
    //}
   switch(button) {
    case 1 : System.out.println("hello");
    break;
    case 2 : System.out.println("Namaste");
    break;
    case 3 : System.out.println("Bonjour");
    break;
    default : System.out.println("invalid button");
   }

}
}