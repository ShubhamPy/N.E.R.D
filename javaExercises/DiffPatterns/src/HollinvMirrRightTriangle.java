/*
Hollow Inverted Mirror Right Triangle Star Pattern

*****
 *  *
  * *
   **
    *

*/

public class HollinvMirrRightTriangle{

     public static void main(String []args){
         for(int i=1;i<=5;i++){
             for(int j=1;j<i;j++){
                 System.out.print(" ");
             }
             for(int j=5;j>=i;j--){
                 if(i==j||i==1||j==5){
                     System.out.print("*");
                     
                 }else{
                     System.out.print(" ");
                 }
                 
             }
             System.out.println();
         }
     }
}
