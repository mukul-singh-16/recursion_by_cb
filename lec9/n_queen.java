package lec9;

public class n_queen {
    public static void main(String[] args) {
        int n=5;
        boolean arr [][]=new boolean[n][n];
        queen(arr,0,n);
    }
    //to display the answer
    public static void Display(boolean [][] ans) {

        for (int k = 0; k < ans.length; k++) {
            for (int l = 0; l < ans[0].length; l++) {
                if(ans[k][l]==true)
                System.out.print("Q ");
                else
                System.out.print("_ ");
            }
            System.out.println();
        }
        System.out.println("***********");

    }
    //main code
    public static void queen(boolean arr[][],int row, int tq)
    {
        // System.out.println("aa gya");
        if(tq==0) //sare queen mil gy to return
        {
            Display(arr);
            return;
        }
        if(row>arr.length)// sare rows khtm ho gai to return 
            return;

        for(int i=0;i< arr[0].length;i++) //hr row me ek queen honi chaiya or agr nhi bhet pa rhi hai ek row me ek queen to mtlab apn glt ja rhi hai
        {
            
            if(possible(arr,row,i)) //to apn check krenga ke us row ke kon se index pe queen bhita sekta hai
            {

            arr[row][i]=true; //agr queen bhita de to true kr dunga track rakhne ke liya


            queen(arr, row+1, tq-1);


            arr[row][i]=false; //agr return return hoa to yha ayga mtlab ab tk jo kiya wo glt tha to sb phela jisa kr dinga apne sare change ko unchange kr dinga
            }
                //agr ek row ke kise be index pe queen nhi bhet pai to mtlab ans glt hai backtrack krenga or dusra ways try krenga
        }
    }
    public static boolean possible(boolean arr[][],int row,int col)
    {
        //  1--->    current row or curent coll ke upper ,left upper or right upper check kren ke jaroorat hai bs ke koi queen to nhi bhete 
        //           agr bhete hai to fals return kr dinga or apna current row and current pe new queen nhi bhita sekta wrna upper wali ya dignol wali mar dege
        // System.out.println("row = "+row +"col = "+col);
        //   2--->   niche or dignol niche check krne ke jaroorat nhi hai quke wha koi queen he nhi hai to wo mr he nhi payage apn ko br uper wali queen se khtra hai
        //   3--->   left or right me check krne ke jarroot nhi hai kuke apn ek row me ek he queen bhita rhi hai
        //upper
        int r=row;
        while(r>=0)
        {
            if(arr[r][col]==true)
                return false;
            r--;
        }
        //left upper
        r=row;int c =col;
        while(r>=0 && c>=0)
        {
            if(arr[r][c]==true)
                return false;
            r--;
            c--;
        }
        // right upper
        r=row;c =col;
        while(r>=0 && c<arr.length)
        {
            if(arr[r][c]==true)
                return false;
            r--;
            c++;
        }
        return true;
        
    }
}
