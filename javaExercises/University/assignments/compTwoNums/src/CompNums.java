import java.util.Scanner;

public class CompNums {
    public static void main(String[] args) {
        int firstNum,secondNum;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter First Number:");
        firstNum = inp.nextInt();
        System.out.println("Enter Secon Number:");
        secondNum= inp.nextInt();

        if (firstNum > secondNum) {
            System.out.println("First Number is bigger");
        }else if (firstNum < secondNum){
            System.out.println("Second number is bigger");
        }else{
            System.out.println("Both Number are Equals");
        }
    }
}

