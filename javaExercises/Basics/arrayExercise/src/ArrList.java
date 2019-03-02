import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();      // no need to declare size of array
        arr.add(1);
        arr.add(3);
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));

        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("string1");
        arr1.add("string2");
        arr1.add(0,"string0");
        System.out.println(arr1.get(0));
        System.out.println(arr1.get(1));

    }
}
