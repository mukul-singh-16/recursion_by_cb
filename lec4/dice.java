package lec4;

public class dice {
    public static void main(String[] args) {
        int n=4;
        int start=0;
        int end=3;
        dicefun(start, end,"");
    }
    public static void dicefun(int start,int end, String ans)
    {
        if(start==end)
            System.out.println(ans);
        if(start>end)
            return;
        for(int i=1;i<=end;i++)
        dicefun(start+i, end, ans+i+' ');
    }
    
}
