//print number traingle with loop
//        1 
//      2 1 2 
//    3 2 1 2 3 
//  4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5

public class homework5 {
    public static void main(String[]args){

        int n=5;
        for(int i=1;i<=n;i++){
        

            for (int j=1; j<=n-i; j++)
                System.out.print("  ");


                for(int k=i; k>=1; k--)
                System.out.print(k+" ");


                    for(int y=2; y<=i; y++)
                    System.out.print(y+" ");
    

          System.out.println();


    }
}
}
