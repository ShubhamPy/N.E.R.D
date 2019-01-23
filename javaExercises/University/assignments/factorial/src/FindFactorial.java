import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter Number:");
        int number = userInput.nextInt();
        int fact=1;
        if (number == 0){
            System.out.println("Enter number greater than 0");
        }else{

            for(int i=number;i>=1;i--){
                fact = fact*i;
            }
            System.out.println("Factorial of "+number+" is "+fact);
        }

    }
}
