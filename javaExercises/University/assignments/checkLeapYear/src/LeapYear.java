import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Year:");
        year = in.nextInt();
        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not A Leap Year");
        }
    }
}

