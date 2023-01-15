package lec2;

public class pow {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(pow(a,b));
    }
    public static int pow(int a ,int b)
    {
        if(b==0)
            return 1;
        return pow(a,b-1) *a;
    }
}
