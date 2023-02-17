package lec3;

public class coinTosCount {
    public static void main(String[] args) {
        int n=3;
        System.out.println(cointos(n, ""));
    }
    public static int cointos(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return 1;
        }
        return cointos(n-1, ans+'T') + cointos(n-1, ans+'H');
    }
    
}
