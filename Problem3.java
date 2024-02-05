public class Problem3 {

    public static int Sum(int[] arr,int sum,int i)
    {
        if(i>arr.length-1)
        {
            return sum;
        }
        return Sum(arr, sum+arr[i], i+1);
        
    }
    public static void main(String[] args) {
        int[] arr = {9,8,9};
        int sum1 = Sum(arr,0,0);
        System.out.println(sum1);
    }
}
