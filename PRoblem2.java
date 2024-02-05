public class PRoblem2 {

    public static int Digit(int n,int cnt)
    {
        if(n == 0)
        {
            return cnt;
        }

        return Digit(n/10, cnt+1);

    }
    public static void main(String[] args) {
        int n = 988;
        int cnt1 = Digit(n,0);
        System.out.println(cnt1);
    }
}
