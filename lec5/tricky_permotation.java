package lec5;

public class tricky_permotation {
    
    public static void main(String[] args) {
        String s="aba";
        sequence(s, "");
    }
    public static void sequence(String ques,String ans)
    {
        // int arr[]=new int[]
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<ques.length();i++)
        {
            int flag=0;
            char ch=ques.charAt(i);
            for(int j=i+1;j<ques.length();j++)
            {
                if(ques.charAt(j)==ch) {
                flag=1;
                break;
                }
            }
            if(flag!=1)
            sequence(ques.substring(0,i)+ques.substring(i+1), ans+ch);
        }
    }
}
