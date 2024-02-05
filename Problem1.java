import java.util.ArrayList;
import java.util.Collections;

public class Problem1 {

    public static void Reverse(ArrayList<Integer> arr,int i,int n)
    {
        if(i>n/2)
        {
            return;
        }
        System.out.println(i);

        Collections.swap(arr, i, n-i-1);
        Reverse(arr, i+1, n);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);

        Reverse(arr,0,arr.size());
        System.out.println(arr);
    }
}
