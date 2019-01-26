/*
Inverted Right Triangle Star Pattern

*****
****
***
**
*

 */

import java.util.Scanner;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter value for n ");
        int n =in.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
