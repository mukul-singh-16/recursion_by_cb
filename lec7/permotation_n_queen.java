

public class permotation_n_queen {
    public static void main(String[] args)
    {
        boolean []board=new boolean[4];
        int n=2;
        Queen(board,n,0,"");
    }
    public static void Queen(boolean board[],int tq,int qpsf,String ans)
    {
        // tf -->total queen
        // opsf--> queen place so far
        if(qpsf==tq)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;
                Queen(board, tq, qpsf+1, ans+"q"+qpsf+"b"+i);
                board[i]=false;
            }
        }
    }
}
