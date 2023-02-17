package lec9;

public class sudoko {
    public static void main(String[] args) {
        int n=9;
        int arr[][]=new int[n][n];
        char c[][]= {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(c[i][j] != '.')
                    arr[i][j] = c[i][j]-'0';
            }
                
        }
        sudko(arr, 0, 0);
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
                
        }
        
        // sudko(arr,0,0);
    }
    public static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
        {
			for (int j = 0; j < arr.length; j++) 
            {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
    }
    
    public static void sudko(int arr[][],int row,int col)
    {
        if(col==arr.length)
        {
            row++;
            col=0;
            // sudko(arr,row+1,0);
        }
        if(row == arr.length)
        {
            Display(arr);
            return;
        }
        
        if(arr[row][col] != 0)
        {
        sudko(arr,row,col+1);
        }

        else if(arr[row][col] == 0)
        {
            for(int i=1;i<=arr.length;i++)
            {
                if(valid(arr,row,col,i))
                {
                    arr[row][col]=i;
                    sudko(arr,0,col+1);
                    arr[row][col]=0;
                }
            }
            
            // return;
        }
    }
    public static boolean valid(int arr[][],int row,int col,int n)
    {
        // check current row
        for(int i=0;i<arr.length;i++)
        {
            if(arr[row][i]==n)
                return false;
        }
        // check current col
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][col]==n)
                return false;
        }
        int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (arr[i][j] == n) {
					return false;
				}

			}

		}

        return true;

    }
    
}
