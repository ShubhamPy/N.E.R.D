public class Methods {
    public static void main(String[] args) {
  //modifier return-type method-name(Parameter List){
  //      ---statement body;}
  // modifier like-- public static, public final, private static or private final
  // return type like-- int so we have to return integer type in method ,here void i.e null so need to return anything

        nameIt1();      //calling method nameIt1
        int numberOne=5;
        int numberTwo=10;
        System.out.println(findTheMin(numberOne,numberTwo));
        System.out.println(findTheMin(40,19));
    }
    public static void nameIt1(){
        System.out.println("just a example statement-1");
        System.out.println("just a example statement-2");
        // for executing these statement we have to call these method in main()
    }

    public static int findTheMin(int num1,int num2){   //these are() parameter list
        int min;
        if(num1<num2){
            min = num1;
        }else{
            min= num2;
        }
        return min;       //we have to return as we take int initially
        // now for executtin call this method in main
    }
}
