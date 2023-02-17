// package lec7;
public class finite_coin_combination
{
    public static void main(String[] args) {
        int arr[]={2, 3, 5 };
        int target=10;
        finite(arr,target,0,"");
    }
    public static void finite(int arr[],int target,int index,String ans)
    {
        if(0==target)
        {
            System.out.println(ans);
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(target >= arr[i])
            finite(arr, target-arr[i],i, ans+arr[i]+"");
        }
    }
}