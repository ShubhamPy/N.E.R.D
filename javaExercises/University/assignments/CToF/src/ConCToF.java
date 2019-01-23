import java.util.Scanner;

public class ConCToF {
    public static void main(String[] args) {
        float Celcius,Fahrenheit;

        System.out.println("Temp Conversion For \n1.Celcius to Fahrenheit\n2.Fahrenheit to Celcius");
        Scanner userInput = new Scanner(System.in);
        int opt = userInput.nextInt();

        if(opt==1){
            Scanner temp = new Scanner (System.in);
            System.out.println("Enter Temperature in Celcius");
            Celcius = temp.nextFloat();
            Fahrenheit = (Celcius *9/5)+32;
            System.out.println("Temp. in fahrenheit is "+Fahrenheit+"F");
        }else if(opt==2){
            Scanner temp2 = new Scanner (System.in);
            System.out.println("Enter Temperature in Fahrenheit");
            Fahrenheit = temp2.nextFloat();
            Celcius = (Fahrenheit - 32) * 5/9;
            System.out.println("Temp. in Celcius is "+Celcius+"C");
        }else{
            System.out.println("Invalid Input!");
        }


    }
}
