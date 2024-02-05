public class Problem4 {

    public static String Remove(String s,int i,String ans)
    {
        if(s.length()-1 < i)
        {
            return ans;
        }

        if(s.charAt(i) != 'x')
        {
            ans = ans + s.charAt(i);
        }

        return Remove(s, i+1, ans);

    }
    public static void main(String[] args) {
        String s = "xx";
        String ans = "";
        ans = Remove(s, 0, ans);
        System.out.println(ans);
    }
}
