package lec6;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        int n=1000;
        print(0, n);

    }
    public static void print(int curr,int n) {
        if(curr>n)
        return;
        System.out.println(curr);
        int i=0;
        if(curr==0)
            i=1;
        for(;i<=9;i++)
            print(curr*10+i, n); 
    }
    
}
