package string_builder;
// string builder demo 1
public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("hey");
        System.out.println(sb);
        sb.append("1234567890");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // capicity is grow by old capacity*2 +2
        // String s=new String(sb);
        // System.out.println(s);
        System.out.println(sb.charAt(5));
        System.out.println(sb.substring(4));

    }
    
}
