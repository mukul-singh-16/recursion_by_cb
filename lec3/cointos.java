package lec3;

public class cointos {
    public static void main(String[] args) {
        int n=2;n
        tos(n,""); 
    }
    public static void tos(int n,String s) {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        tos(n-1,s+"H");
        tos(n-1,s+"T");
    }
}

