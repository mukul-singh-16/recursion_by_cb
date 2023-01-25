package lec5;

public class maze_path {
    static int count=0;
    public static void main(String[] args) {
        int row=3;
        int col=3;
        pathh(row, col, "", 0, 0);
        System.out.println(count);
    }
    public static void pathh(int row,int col,String ans,int r,int c)
    {
        if(r==row-1 && c==col-1)
        {
            System.out.println(ans);
            count++;
            return ;
        }
        if(r < row-1)
        pathh(row, col, ans+"V ", r+1, c);
        if(c < col-1)
        pathh(row, col, ans+"H ", r, c+1);
        return ;

    }
    
}
