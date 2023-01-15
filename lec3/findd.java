package lec3;
public class findd{
    
    public static void main(String[] args) 
    {
        int t=7;
        int arr[] = {2,3,7,2,5,7,9,0};
        int a = find(arr ,7,arr.length-1);
        System.out.println(a);
    }
    public static int find(int arr[] ,int t,int i)
    {
        if(arr[i] == t)
            return i;
        return find(arr, t, i-1);
    }
    
}
