package lec8;

public class queen {
    public static void main(String[] args) {
        String s="0123";
    printSubSeq(s, "",2);

}

public static void printSubSeq(String s , String ans,int n) {
    if( ans.length()==2*n)
    {
        System.out.println(ans);
        return ;
    }
    if(s.length()==0)
    {
        // System.out.println(ans);
        return;
    }
    
    char ch=s.charAt(0);
    printSubSeq(s.substring(1), ans + "b"+ch,n);
    printSubSeq(s.substring(1),ans+"",n);
    
}
}
