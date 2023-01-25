package lec4;

public class subsequence_count {
    public static void main(String[] args) {
		String s="abc";
        int count =printSubSeq(s, "",0);
        System.out.println(count);

	}

	public static int printSubSeq(String s , String ans, int count) {
		if(s.length()==0)
		{
			System.out.println(ans);
            // System.out.println(count);
			return count+1;
		}
		char ch=s.charAt(0);
		count=printSubSeq(s.substring(1),ans+"",count);
		count=printSubSeq(s.substring(1), ans + ch,count);
        return count;
	}
    
}
