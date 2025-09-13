 import java.util.*;
 class Practicearray1{

    public static void main(String []desending)
    {
      System.out.println("enter number of values you want to enter");

        Scanner ds = new Scanner(System.in);
        int n = ds.nextInt();

         int des[] = new int[n];

         System.out.println("enter values");

         for (int i=0; i<n; i++)
         {
            des[i]=ds.nextInt();
         }

         boolean Desending = true;

         for (int i=0; i<n-1; i++)
         {
            if (des[i]<des[i+1]){
                Desending = false;
            }
         }

         if (Desending)
         {
            System.out.println("this is in desending order");
         }
         else
         {
            System.out.println("this is not in desending order");
         }
    }
}