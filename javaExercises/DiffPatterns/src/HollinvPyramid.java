/*
Hollow Inverted Pyramid Star Pattern

*********
 *     *
  *   *
   * *
    *


*/

public class HollinvPyramid{

     public static void main(String []args){
         for(int i=1;i<=5;i++){
             for(int j=1;j<i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=(10-(2*i-1));j++){
                 if(j==1||i==1||j==(10-(2*i-1))){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }
}
