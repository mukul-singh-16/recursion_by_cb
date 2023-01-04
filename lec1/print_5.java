public class print_5 {
    public static void main(String args[])
    {
        int n=5;
        prn(n);
    }
    public static void prn(int n)
    {
        if(n==0)
        {   
            // System.out.println(1);
            return ;
        }
        System.out.println(n);
        prn(n-1);
    
}
}
