package lec4;
class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int n = 2;
		String s="abc";
		printSubSeq(s, "");

	}

	public static void printSubSeq(String s , String ans) {
		if(s.length()==0)
		{
			System.out.println(ans);
			return ;
		}
		char ch=s.charAt(0);
		printSubSeq(s.substring(1),ans+"");
		printSubSeq(s.substring(1), ans + ch);
	}

}