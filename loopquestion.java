//print sum from 1 to n number 


import java.util.*;

public class loopquestion {
    
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int j=0;
    for(int i=0; i<n; i++)
    {
        j=j+i;

    }
    System.out.println(j);
}

}
