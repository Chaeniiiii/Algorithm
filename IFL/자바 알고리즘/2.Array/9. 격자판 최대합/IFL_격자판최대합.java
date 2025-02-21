import java.util.*;
import java.io.*;

public class IFL_격자판최대합 {

    private static int n;
    private static int max;

    private static int[][] board;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        max = Integer.MIN_VALUE;
        int row,col ;
        for(int i = 0 ; i<n; i++){
            row = 0; col = 0;
            for(int j = 0; j<n; j++){
                row += board[i][j];
                col += board[j][i];
            }
            max = Math.max(max,Math.max(row,col));
        }

        int sum1 = 0,sum2 = 0;
        for(int i = 0 ; i<n; i++){
            sum1 += board[i][i];
            sum2 += board[i][(i+n-1)%n];
        }
        
        max = Math.max(max,Math.max(sum1,sum2));
        System.out.println(max);

    }

}