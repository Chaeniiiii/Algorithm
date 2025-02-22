// 잘못된 코드
import java.util.*;
import java.io.*;

public class IFL_조합의경우수 {

    private static int n,r;

    private static int [] dp;
    private static boolean [] visited;

    public static void main(String [] args) throws Exception { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        dp = new int[n+1];
        visited = new boolean[n+1];

        dfs(0,0);

        System.out.println(dp[r-1] + dp[r]);

    }

    private static void dfs(int start, int dep){

        if(dep > r) return;

        if(dep <= r && dep != 0){
            dp[dep] ++;
        }

        for(int i = start+1; i<=n-1; i++){
            
            if(visited[i]) continue;

            visited[i] = true;
            dfs(i,dep+1);
            visited[i] = false;

        }


    }

}