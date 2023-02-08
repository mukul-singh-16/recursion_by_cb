package lec8;

import java.util.*;

public class Palindrome_Partitioning {
    static int f=0;
    public static void main(String args[])
    {
        List<List<String>> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        String s="nitin";
        fun(s,"",l2,l1);
        // System.out.println(l1.toString());
        System.out.println(l1);
    }
    public static void fun(String q,String ans,List<String> l2,List<List<String>>  l1)
    {
        if(q.length()==0)
        {
            System.out.println(ans);
            l1.add(new ArrayList<>(l2));
            return ;
        }
        for(int i=0;i<q.length();i++)
        {
            if((isPalindrome( q.substring(0, i+1))))
            {
                l2.add(q.substring(0, i+1));
            
                fun(q.substring(i+1, q.length()),ans+ q.substring(0, i+1)+"|",l2,l1);
                l2.remove(l2.size()-1);
            }
        }
        // l1.add(new ArrayList<>(l2));
        // l2.remove(l2.size()-1);
        // l2.removeAll(l1)
         return;
    }
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(!(s.charAt(i)==s.charAt(s.length()-1-i)))
            return false;
        }
        return true;
    }
}
