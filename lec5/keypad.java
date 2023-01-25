package lec5;
import java.util.*;
public class keypad {
    public static void main(String[] args) 
    {
        String []s={"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
        Scanner sc=new Scanner(System.in);
        evl("12","",s);
    }
    public static void evl(String que,String ans,String s[])
    {
        // if(que.length()!=0)
        //     System.out.println(que);
        if(que.length()==0)
        {
            System.out.println(ans);
            return;
        }
        String s1=s[(que.charAt(0))-'0'];
        for(int j=0;j<s1.length();j++)
        {
            evl(que.substring(1), ans+s1.charAt(j), s);
        }
    }
}

