package lec4;

public class Generate_Parentheses {
    public static void main(String[] args) {
        sol(0, 0, 3, "");
    }
    public static void sol(int o, int c,int n,String ans)
    {
        if(n==c && n==o)
        {
            System.out.println(ans);
            return;
        }
        if(o<n)
        sol(o+1,c,n,ans+"(");
        if(c<o)
        sol(o,c+1,n,ans+")");
        return ;
    }
    
}
