public class ArrayType {
    public static void main(String[] args) {
        int [] arr = {1,2,3,9,8,6,7};           // declaring array with hardCoded values
        int [] arr2 = new int[6];               // declaring array without values

        for(int i=0;i<7;i++){                   //print whole arr array
            System.out.println(arr[i]);
        }
        System.out.println();

        for(int i=0;i<arr2.length;i++){         //inserting values in arr2 array
            arr[i]=i*10;
        }for(int i=0;i<6;i++){                  //print arr2 array
            System.out.println(arr[i]);
        }
    }
}
