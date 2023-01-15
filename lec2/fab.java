package lec2;

public class fab 
{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fib(n));

	}

	public static int fib(int n) {
        if(n<=0 ) {
        	return 0;
        }
        if(n<=1)
            return 1;
		int f1 = fib(n - 1);
		int f2 = fib(n - 2);
		return f1 + f2;
	}
    
}
