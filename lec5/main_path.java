package lec5;

public class main_path {
    public static void main(String[] args) {
        int row=3;
        int col=4;
        pathh(row, col, "", 1, 1);
    }
    public static void pathh(int row,int col,String ans,int r,int c)
    {
        if(row==r && col==c)
        {
            System.out.println(ans);
            return ;
        }
        if(r < row)
        pathh(row, col, ans+"V ", r+1, c);
        if(c < col)
        pathh(row, col, ans+"H ", r, c+1);
        return ;

    }
    
}
