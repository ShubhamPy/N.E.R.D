import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int result;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter First Number:");
        firstNumber = userInput.nextInt();
        System.out.println("Enter Second Number:");
        secondNumber =userInput.nextInt();

        result = firstNumber + secondNumber;
        System.out.println("Addition of above two numbers is : "+result);
    }
}
