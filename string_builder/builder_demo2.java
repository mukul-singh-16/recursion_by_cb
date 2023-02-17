package string_builder;
// string builder demo 2
public class builder_demo2 {
    public static void main(String[] args) {
        // string_time();
        string_builder_time();
    }
    //time takeen by string
    public static void string_time() {
        String s="";
        for(int i=0;i<100000;i++)
        {
            s=s+i;
        }
        System.out.println(s);
        
    }
    // time taken by string StringBuilder
    public static void string_builder_time() {
        StringBuilder sb=new StringBuilder();
        // String s="";
        for(int i=0;i<100000;i++)
        {
            sb.append(i);
        }
        System.out.println(sb);
        
    }
    
}
