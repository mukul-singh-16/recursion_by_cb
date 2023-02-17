package string_builder;

import java.util.Arrays;

public class merge_sorted_array 
{
    public static void main(String[] args) 
    {
        int a[]={3,5,7,9,11};
        int b[]={1,2,3,4,6,7};
        int arr[]=new int[a.length + b.length];
        // arr[0]=12;
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                arr[k++]=a[i];
                i++;
            }
            if(a[i]>b[j])
            {
                arr[k++]=b[j];
                j++;

            }
        }
        while(i<a.length)
        {
            arr[k++]=a[i];
            i++;
        }
        while(j<b.length)
        {
            arr[k++]=b[j];
            j++;
        }
        
        // for(int h=0;h<arr.length;h++)
        // System.out.println(arr[h]);
        System.out.println(Arrays.toString(arr));
    }

}
