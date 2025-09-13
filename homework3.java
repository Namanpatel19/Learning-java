// print rombus with loop
//       * * * * *
//      * * * * *
//     * * * * *
//    * * * * *
//   * * * * *

public class homework3 {


    public static void main(String[]args){
       int n=1;
       int l=5;

        for(int i=5; i>=n; i--)
        {

            for(int j=1;j<=i;j++)
            System.out.print(" ");

            for(int k=1; k<l; k++){
                System.out.print("* ");
            }
          System.out.println();
        }
    }
}
