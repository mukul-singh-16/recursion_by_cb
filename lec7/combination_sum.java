import java .util.*;
public class combination_sum {
    public static void main(String[] args) {
        int arr[]={4,5,3,8};
        int target =8;
        List<List<Integer>> l2=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        func(arr,target,"",0,l1,l2,0);
        // for(int i=0;i<l2.size()-1;i++)
        System.out.println(l2);
        
    }
    public static void func(int arr[],int target,String ans,int sum,List<Integer> l1 , List<List<Integer>> l2,int idx)
    {
        if(target==sum)
        {  
            l2.add(new ArrayList<>(l1));
            System.out.println(ans);
            return;
        }
        if(target < sum)
            return;
        
        for(int i=idx;i<arr.length;i++)
        {
            l1.add(arr[i]);
        func(arr,target,ans+arr[i],sum+arr[i],l1,l2,i+1);
            l1.remove(l1.size()-1);
        }
        
    }
    
}
