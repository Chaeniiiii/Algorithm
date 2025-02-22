// Top-Down(재귀 + 메모이제이션, DFS방식)
import java.util.*;
import java.io.*;

public class IFL_조합의경우수2 {

    private static int [][] dp;

    public static void main(String [] args) throws Exception { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        dp = new int[n+1][n+1];
        System.out.println(dfs(n,r));

    }

    private static int dfs(int n, int r){

        if(dp[n][r] > 0) return dp[n][r];

        if(n == r || r == 0) return 1;
        else return dp[n][r] = dfs(n-1,r-1) + dfs(n-1,r);

    }

}