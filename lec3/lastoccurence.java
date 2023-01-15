package lec3;

public class lastoccurence {
    public static void main(String[] args) {
        int arr[]={2,3,2,2,3,3,6,2};
        int t=3;
        System.out.println(occur(arr,arr.length-1,t));
    }
    public static int occur(int arr[],int s, int t) {
        if(s<0)
            return -1;
        if(arr[s]==t)
            return s;
        return occur(arr, s-1, t);
    }
}
