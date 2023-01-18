package lec5;

public class permotation_of_string {
    
    public static void main(String[] args) {
        // String abcdef;
        sequence("abc", "");
    }
    public static void sequence(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++)
        {
            sequence(ques.substring(0,i)+ques.substring(i+1), ans+ques.charAt(i));
        }
    }
}
