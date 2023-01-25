package lec3;

public class firstoccurence {
    public static void main(String[] args) 
    {
        int arr[]={2,3,2,2,3,7,6,3};
        int t=3;
        System.out.println(occur(arr,0,t));
    }
    public static int occur(int arr[],int s, int t) {
        if(s==arr.length)
            return -1;
        if(arr[s]==t)
            return s;
        return occur(arr, s+1, t);
    }
}
