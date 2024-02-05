public class Problem5 {
    public static String Remove(String s,String res,int i)
    {
        if(i>s.length()-1)
        {
            return res;
        }

        if(i+1<s.length() && s.charAt(i) != s.charAt(i+1))
        {
            res = res + s.charAt(i);
        }

        return Remove(s, res, i+1);
    }
    public static void main(String[] args) {
        String s = "aabbc";
        String res = "";
        s += '$';
        String ans1 = Remove(s,res,0);
        System.out.println(ans1);
    }
}
