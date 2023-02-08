package lec8;

public class breakdown_of_string {
    public static void main(String args[])
    {
        String s="nitin";
        fun(s,"");
    }
    public static void fun(String q,String ans)
    {
        if(q.length()==0)
        {
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<q.length();i++)
        {
            fun(q.substring(i+1, q.length()),ans+ q.substring(0, i+1)+"|");
        }
        return;
    }

    
}
