import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int i=100;
        System.out.println("List of Even Nums:");
        for(i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("List of odd nums:");
        for(i=1;i<100;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }


        int num;
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter No.");
        num = userInput.nextInt();

        if (num%2==0){
            System.out.println("An Even no.");
        }else{
            System.out.println("An Odd No.");
        }
    }
}
