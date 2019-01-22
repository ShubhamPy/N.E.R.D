import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first No.");
        int firstNumber= input.nextInt();
        System.out.println("Enter second No.");
        int secondNumber= input.nextInt();
        System.out.println("Enter third No.");
        int thirdNumber= input.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println("first num is largest");
        }else if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println("Second num is largest");
        }else{
            System.out.println("third num is largest");
        }
    }
}
