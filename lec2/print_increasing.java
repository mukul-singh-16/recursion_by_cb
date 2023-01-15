package lec2;

public class print_increasing {
    public static void main(String args[])
    {
        int n=5;
        prn(n);
    }
    public static void prn(int n)
    {
        if(n==0)
        {   
            return ;
        }
        
        prn(n-1);
        System.out.println(n);
    }
}
