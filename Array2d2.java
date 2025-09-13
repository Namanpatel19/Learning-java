

import java.util.*;

public class Array2d2 {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);


        System.out.println("enter number of rows");
        int row = sc.nextInt();

        System.out.println("enter number of coloumn ");
        int col = sc.nextInt();


        int array[][]= new int [row][col];

        for(int i = 0 ; i<row; i++){
         System.out.println("enter values for " + (i+1)+"st" + " row");
        

            for(int j =0; j<col; j++){
                   array[i][j]= sc.nextInt();

            }
        }

        System.out.println("enter number you want to find");
        int x = sc.nextInt();

        for(int i =0; i<row; i++)
        {
            for(int j = 0; j< col; j++){

                if(array[i][j]==x){
                    System.out.println("this numner "+x+" is exist in this matrix at location"+i+","+j);

                }
            }
        }
        
        
       
}
}

