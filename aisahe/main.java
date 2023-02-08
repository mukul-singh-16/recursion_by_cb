import java.util.*;

public class Main {
    public static void Display1(int[][] ans1) {

        for (int k = 0; k < ans1.length; k++) {
            for (int l = 0; l < ans1[0].length; l++) {
                System.out.print(ans1[k][l] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int m1 = scan.nextInt();
        char[][] maze1 = new char[n1][m1];
        for (int i = 0; i < maze1.length; i++) {
            String str = scan.next();
            for (int j = 0; j < str.length(); j++) {
                maze1[i][j] = str.charAt(j);
            }

        }
        int[][] ans = new int[n1][m1];
        path(maze1, 0, 0, ans);
        if (f == false) {
            System.out.println("NO PATH FOUND");
        }
    }

    static boolean f = false;

    public static void path(char[][] maze, int col1, int row1, int[][] ans1) {

        if (row1 == maze.length - 1 && col1 == maze[0].length - 1
                && maze[row1][col1] != 'X') {
            ans1[row1][col1] = 1;
            Display1(ans1);
            f = true;
            return;
        }

        if (row1 < 0 || col1 < 0 || row1 >= maze.length || col1 >= maze[0].length
                || maze[row1][col1] == 'X') {

            return;
        }
        maze[row1][col1] = 'X';
        ans1[row1][col1] = 1;
        int r[] = { -1, 1, 0, 0 };
        int c[] = { 0, 0, -1, 1 };

        for (int i = 0; i < c.length; i++) {
            path(maze, col1 + c[i], row1 + r[i], ans1);
        }

        maze[row1][col1] = 'O';
        ans1[row1][col1] = 0;

    }
}