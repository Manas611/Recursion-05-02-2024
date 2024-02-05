public class Problem9 {

    public static int Search(int[] arr,int x,int i,int idx,int n)
    {
        if(n-1 == i)
        {
            if(arr[i] == x)
                idx = i;
            return idx;
        }
        if(arr[i] == x)
        {
            idx = i;
        }
        return Search(arr, x, i+1, idx,n);

    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,8,2,1,2};
        int x = 9;
        int n = arr.length;
        int idx = Search(arr,x,0,0,n);
        System.out.println(idx);
    }
}
