package lec6;
class tower_of_hanoi
{
    public static void main(String[] args) {
        int n = 2;
		toh(n, "src", "hlp", "dest");
    }
    public static void toh(int n,String s,String h,String d)
    {
        if(n==0) {
			return;
		}

		toh(n-1, s, d, h);//helper 
		System.out.println("Move "+n+"th disc form "+s+" to "+d);//
		toh(n-1, h, s, d);
    }
}