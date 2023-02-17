

public class queen_combination {
    public static void main(String[] args)
    {
        boolean []board=new boolean[4];
        int n=2;
        Queen(board,n,0,"",0);
    }
    public static void Queen(boolean board[],int tq,int qpsf,String ans,int idx)
    {
        // tf -->total queen
        // opsf--> queen place so far
        if(qpsf==tq)
        {
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
                Queen(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf+" ",i+1);
                board[i]=false;
            }
            // for(int j=0;j<i;j++)
            // {
            //     board[j]=false;
            // }
        }
    }
}
