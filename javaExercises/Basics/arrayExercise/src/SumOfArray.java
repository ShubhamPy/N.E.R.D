public class SumOfArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,3,53,8,43,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];                 //sum-up all the elements
        }
        System.out.println(sum);
    }
}
