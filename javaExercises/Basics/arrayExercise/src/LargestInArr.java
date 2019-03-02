public class LargestInArr {
    public static void main(String[] args) {
        int [] arr = {1,23,45,78,3,6,12,3,45,5};
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }System.out.println(largest);

    }
}
