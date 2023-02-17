package lec4;

public class boardpath {
    public static void main(String[] args) {
        int n=4;
        int start=0;
        int end=4;
        bpath(start, end,"");
    }
    public static void bpath(int start,int end, String ans)
    {
        if(start==end)
            System.out.println(ans);
        if(start>end)
            return;
        // for(int i=1;i<9;i++)
        // bpath(start+i, end, ans+i);
        bpath(start+1, end, ans+'1');
        bpath(start+2, end, ans+'2');
        bpath(start+3, end, ans+'3');
    }
}
