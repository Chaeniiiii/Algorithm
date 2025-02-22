//Bottom - Up (반복문, DP테이블 직접 채우기)
import java.util.*;
import java.io.*;

public class IFL_조합의경우수3 {

    public static void main(String [] args) throws Exception { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int [][] dp = new int[n+1][r+1];

        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=Math.min(i,r); j++){
                if(j == 0 || i == j) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }

        }

        System.out.println(dp[n][r]);

    }

}