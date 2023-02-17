package lec9;
// confusion
import java.util.*;

public class raat_maze {
    public static void Display(int[][] ans) {

        for (int k = 0; k < ans.length; k++) {
            for (int l = 0; l < ans[0].length; l++) {
                System.out.print(ans[k][l] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String str = scan.next();
            for (int j = 0; j < str.length(); j++) {
                maze[i][j] = str.charAt(j);
            }

        }
        int[][] ans = new int[n][m];
        print_path(maze, 0, 0, ans);
        if (f == false) {
            System.out.println("NO PATH FOUND");
        }
    }

    static boolean f = false;

    public static void print_path(char[][] maze, int current_col, int curent_row, int[][] ans) {
        if (f == false) {
            if (curent_row == maze.length - 1 && current_col == maze[0].length - 1) {
                ans[curent_row][current_col] = 1;
                Display(ans);
                f = true;
                return;
            }

            if (curent_row >= maze.length || current_col >= maze[0].length
                    || maze[curent_row][current_col] == 'X') {
                return;
            }

            maze[curent_row][current_col] = 'X';
            ans[curent_row][current_col] = 1;
            int r[] = { 1, 0 };
            int c[] = { 0, 1 };
            // int r[] = { -1, 1, 0, 0 };
            // int c[] = { 0, 0, -1, 1 };

            for (int i = 0; i < c.length; i++) {
                print_path(maze, current_col + c[i], curent_row + r[i], ans);
            }

            maze[curent_row][current_col] = 'O';
            ans[curent_row][current_col] = 0;
        }
    }
}
