package lec4;

public class cointoswithoutdublicate {
    public static void main(String[] args) {
        int n=3;
        cointos(n,"");
    }
    public static void cointos(int n,String s)
    {
        if(n==0)
        {
            System.out.println(s);
            return ;
        }
        if(s.length()==0||(s.charAt(s.length()-1)!='H'))
        cointos(n-1,s+"H");
        cointos(n-1,s+"T");
    }
    
}
