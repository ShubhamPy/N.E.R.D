import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float num1,num2,add,sub,mul,div;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter First number:");
        num1 = in.nextFloat();
        System.out.println("Enter Second number:");
        num2 = in.nextFloat();


        int userOpt;
        System.out.println("Enter the operation you want to perform:");
        System.out.println("1.Addition\n2.Subtarction\n3.Multiplication\n4.Division");
        userOpt = in.nextInt();

        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        switch (userOpt){
            case 1:
                System.out.println(add);
                break;
            case 2:
                System.out.println(sub);
                break;
            case 3:
                System.out.println(mul);
                break;
            case 4:
                System.out.println(div);
                break;
            default:
                System.out.println("Invalid operation");
        }


    }
}
