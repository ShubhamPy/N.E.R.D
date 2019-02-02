/*
Hollow Mirror RIght Triangle

    *
   **
  * *
 *  *
*****


*/

public class HollMirRightTRiangle{

     public static void main(String []args){
         for(int i=1;i<=5;i++){
             for(int j=i;j<=4;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 if(j==i||i==5||j==1){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
             }System.out.println();
         }
     }
}
