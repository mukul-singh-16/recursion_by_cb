package lec8;
import java.util.*;
public class combination_leatcode {
    public static void main(String[] args)
    {
        boolean []board=new boolean[4];
        int n=2;
        List<List<Integer>> l2=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        Queen(board,n,0,"",0,l1,l2);
        System.out.println(l2);
    }
    public static void Queen(boolean board[],int tq,int qpsf,String ans,int idx,List<Integer> l1 , List<List<Integer>> l2)
    {
        // tf -->total queen
        // opsf--> queen place so far
        if(qpsf==tq)
        {
            l2.add(new ArrayList<>(l1));
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++)
        {
            // for(int j=0;j<i;j++)
            // {
            //     board[j]=true;
            // }
            if(board[i]==false)
            {
                board[i]=true;
                l1.add(i+1);
                Queen(board, tq, qpsf+1, ans+(i+1),i+1,l1,l2);
                l1.remove(l1.size()-1);
                board[i]=false;
                
            }
            // for(int j=0;j<i;j++)
            // {
            //     board[j]=false;
            // }
        }
        
    }
    
}
