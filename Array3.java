import java.util.*;
public class Array3 {

public static void main(String []ss){

    System.out.println("enter number of values you want to store in array");

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int size[]= new int[num];

    System.out.println("enter values which you want to store and print");

    for(int i= 0; i<num; i++){
        size[i] = sc.nextInt();
    }

    System.out.println("store values are");

    for(int i =0; i<num; i++)
{
    System.out.println(size[i]);
}
    
}
}