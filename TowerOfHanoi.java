public class TowerOfHanoi {

    public static void Tower(int n,char to,char des, char use)
    {
        if(n>0)
        {
            Tower(n-1, to,use,des);
            System.out.println(to + " " + des);
            Tower(n-1, use,des,to);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        Tower(n,'a','c','b');
    }
}
