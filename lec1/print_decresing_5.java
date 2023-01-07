package lec1;
public class print_decresing_5 {
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
        System.out.println(n);
        prn(n-1);
        
        
    
}
}
