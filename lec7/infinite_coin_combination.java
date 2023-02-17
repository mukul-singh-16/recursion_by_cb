public class infinite_coin_combination {
    // permotation
    public static void main(String[] args)
    {
        int arr[]={2,3,5};
        int n=10;
        coin(arr,n,"");
    }
    public static void coin(int arr[],int tcv,String ans)
    {
        // tcv -->total coin value
        // ccs--> current coins sum
       if(tcv==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(tcv >= arr[i])
            {
                coin(arr,tcv-arr[i],ans+arr[i]);
            }
        }
    }
}
    
