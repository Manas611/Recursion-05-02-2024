import java.util.Arrays;

public class Quick {

    public static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i<j) {
            while(arr[i]<=pivot && i<=high-1)
            {
                i++;
            }

            while (arr[j]>pivot && j>=low+1) {
                j--;
            }

            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quick(int[] arr,int low, int high)
    {
        if(low<high)
        {
            int pIndex = partition(arr, low, high);
            quick(arr, low, pIndex-1);
            quick(arr, pIndex+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quick(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
